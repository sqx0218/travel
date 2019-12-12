package com.jk.service.impl;


import com.jk.dao.UserMapper;
import com.jk.model.Book;
import com.jk.service.UserServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServicee {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Book> query() {
        return userMapper.query();
    }
}
