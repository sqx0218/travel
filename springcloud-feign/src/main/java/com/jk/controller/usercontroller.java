package com.jk.controller;


import com.jk.model.Book;
import com.jk.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class usercontroller {

    @Autowired
    private UserServices userService;

    @RequestMapping("query")
    @ResponseBody
    public List<Book> query(){
        return userService.query();
    }
}
