package com.ssm.service.impl;

import com.ssm.dao.mappingExt.UserMapperExt;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FatCao
 * @Date: 2019-07-22 22:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapperExt userMapperExt;

    /**
     * 添加用户
     * @param user  用户信息对象
     * @return      返回影响行数
     */
    @Override
    public boolean addUser(User user ) {
        int rSet = userMapperExt.addUser(user);

        if (rSet > 0){
             return true;
        }
         return false;
    }

    /**
     * 查询用户名是否重复
     * @param user  用户信息对象
     * @return      true 用户名可用; false 用户名已存在
     */
    @Override
    public boolean checkNickName(User user) {
        List<User> list = userMapperExt.checkNickName(user);
        if (list.size() > 0){
            // 用户名已存在
            return false;
        }
        return true;
    }

    /**
     * 查询邮箱是否重复
     * @param user  用户信息对象
     * @return      true 邮箱可用; false 邮箱已存在
     */
    @Override
    public boolean checkEmail(User user) {
        List<User> list = userMapperExt.checkEmail(user);
        if (list.size() > 0){
            // 邮箱已存在
            return false;
        }
        return true;
    }

    /**
     * 用户的登录校验
     * @param user  前端传递的用户信息
     * @return      true 登录成功; false 登录失败
     */
    @Override
    public boolean loginUser(User user) {
        List<User> list = userMapperExt.loginUser(user);
        if (list.size() > 0){
            // 登录成功
            return true;
        }
        return false;
    }

    /**
     * 获取单个用户的所有信息
     * @param user  前端登录传递的用户信息
     * @return      数据库中用户的所有信息
     */
    @Override
    public User getUserByEmail(User user) {
        return userMapperExt.getUserByEmail(user);
    }
}
