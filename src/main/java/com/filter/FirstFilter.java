package com.filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter--->doFilter");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        try {
            String name = (String) req.getSession().getAttribute("name");
            System.out.println("name--->" + name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        filterChain.doFilter(servletRequest, servletResponse);
        return;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
