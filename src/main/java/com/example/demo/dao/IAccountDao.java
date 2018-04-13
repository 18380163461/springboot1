package com.example.demo.dao;

import com.example.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-13 11:37
 */
public interface IAccountDao extends JpaRepository<Account,Integer> {
}