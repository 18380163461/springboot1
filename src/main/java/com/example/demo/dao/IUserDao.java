package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:15
 */
public interface IUserDao {
    List<User> selectAll();
}
