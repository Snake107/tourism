package com.ssm.service;

import com.ssm.pojo.User;

/**
 * @Author: FatCao
 * @Date: 2019-07-23 09:20
 */
public interface UserService {
    // 添加用户
    boolean addUser(User user) ;
    // 查询用户名是否重复
    boolean checkNickName(User user);
    // 查询邮箱是否重复
    boolean checkEmail(User user);
    // 用户的登录校验
    boolean loginUser(User user);
    // 获取单个用户的所有信息
    User getUserByEmail(User user);
}
