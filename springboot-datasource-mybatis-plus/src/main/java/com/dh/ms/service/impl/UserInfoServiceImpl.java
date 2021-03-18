package com.dh.ms.service.impl;

import com.dh.ms.annotation.Master;
import com.dh.ms.annotation.Slave;
import com.dh.ms.mapper.UserInfoMapper;
import com.dh.ms.model.UserInfo;
import com.dh.ms.service.UserInfoServcie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserInfoServiceImpl implements UserInfoServcie {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    @Master
    public UserInfo selectByOddUserId(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    @Slave
    public UserInfo selectByEvenUserId(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    @Master
    public int insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("zhangsan");
        userInfo.setAddress("tianjin");
        userInfo.setUserAge(22);
        userInfo.setAddTime(new Date());
        userInfo.setRemarks("xixihaha");
        return userInfoMapper.insert(userInfo);
    }

    @Override
    @Slave
    public int update(Integer id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("lisi");
        userInfo.setAddress("beijing");
        userInfo.setUserAge(22);
        userInfo.setRemarks("ouye");
        userInfo.setAddTime(new Date());
        userInfo.setId(id);
        return userInfoMapper.updateById(userInfo);
    }

    @Override
    @Slave
    public int delete(Integer id) {
        return userInfoMapper.deleteById(id);
    }
}
