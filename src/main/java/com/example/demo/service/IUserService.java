package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:18
 */
public interface IUserService {
    List<User> selectAll();
    List<User> selectAll2();

    int update(User user);
}
