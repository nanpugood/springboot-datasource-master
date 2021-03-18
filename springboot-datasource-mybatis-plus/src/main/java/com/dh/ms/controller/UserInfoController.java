package com.dh.ms.controller;


import com.dh.ms.model.UserInfo;
import com.dh.ms.service.UserInfoServcie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserInfoController {

    @Resource
    private UserInfoServcie userInfoServcie;

    //查询主库
    @GetMapping("/test1")
    public UserInfo getTest1() {
        return userInfoServcie.selectByOddUserId(1);
    }

    //查询从库
    @GetMapping("/test2")
    public UserInfo getest2() {
        return userInfoServcie.selectByEvenUserId(1);
    }

    //主库
    @GetMapping("/insert")
    public int insert() {
        return userInfoServcie.insert();
    }
    //从库
    @GetMapping("/update/{id}")
    public int update(@PathVariable("id") Integer id) {
        return userInfoServcie.update(id);
    }
    //从库
    @GetMapping("/delete/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return userInfoServcie.delete(id);
    }
}
