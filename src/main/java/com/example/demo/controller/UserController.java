package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:20
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectAll() {
        List<User> users = userService.selectAll();
        System.out.println(JSONObject.toJSON(users));
        /*List<User> users =new ArrayList<>();
        User user=new User();
        user.setId("a");
        user.setName("name");
        users.add(user);*/
        return users;
    }
    @RequestMapping(value = "/selectAll2", method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectAll2() {
        List<User> users = userService.selectAll2();
        System.out.println(JSONObject.toJSON(users));
        return users;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public String update() {
        userService.update(new User());
        return "1";
    }
}