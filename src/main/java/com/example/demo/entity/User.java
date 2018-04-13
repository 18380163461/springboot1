package com.example.demo.entity;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:14
 */
public class User {
    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
