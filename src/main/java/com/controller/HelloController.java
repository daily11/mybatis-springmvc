package com.controller;

import com.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        List<Book> list = bookService.findAllBook();
        System.out.println(list);
        return "hello";
    }

}