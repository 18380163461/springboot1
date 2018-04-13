package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 16:53
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public User greeting() {
        return new User("iddd","nameeeeee");
    }

}