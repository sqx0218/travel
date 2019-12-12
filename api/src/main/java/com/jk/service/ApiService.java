package com.jk.service;


import com.jk.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ApiService {

    @RequestMapping("Query")
    List<Book> query();
}
