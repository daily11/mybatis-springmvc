package com.service.impl;

import com.dao.BookDao;
import com.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> findAllBook() {
        return bookDao.findAllBook();
    }
}
