package com.ssm.service;

import com.ssm.pojo.User;

/**
 * @Author: FatCao
 * @Date: 2019-07-23 09:20
 */
public interface UserService {
    /**
     * 添加用户
     * @param user  用户信息对象
     * @return      是否注册成功
     */
    boolean addUser(User user) ;
}
