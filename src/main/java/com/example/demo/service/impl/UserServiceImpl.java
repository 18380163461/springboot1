package com.example.demo.service.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:19
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;

    @Override
    @Cacheable("users")
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @CachePut(value="users")
    public List<User> selectAll2() {
        return userDao.selectAll();
    }

    @Override
    @CachePut(value="users")
    public int update(User user) {
        return 0;
    }

}
