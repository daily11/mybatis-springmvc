package com.dao;

import com.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    List<Book> findAllBook();
}
