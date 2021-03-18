package com.dh.ms.service;

import com.dh.ms.model.UserInfo;

public interface UserInfoServcie {
    /**
     * 从TEST1数据源中获取用户信息
     */
    UserInfo selectByOddUserId(Integer id);

    /**
     * 从test2数据源中获取用户信息
     */
    UserInfo selectByEvenUserId(Integer id);

    /**
     * 添加
     *
     * @return
     */
    int insert();

    /**
     * 修改
     *
     * @return
     */
    int update(Integer id);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delete(Integer id);
}
