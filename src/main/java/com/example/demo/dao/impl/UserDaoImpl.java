package com.example.demo.dao.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:16
 */
@Repository
public class UserDaoImpl implements IUserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> selectAll() {
        return jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(User.class));
    }
}
