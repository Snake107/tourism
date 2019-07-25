package com.ssm.dao.mappingExt;


import com.ssm.dto.ChangeParamter;
import com.ssm.dto.ForgotParameter;
import com.ssm.pojo.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapperExt extends Mapper<User> {
    /**
     * 添加用户
     * @param user  用户信息对象
     * @return      影响行数
     */
    Integer addUser(User user);


    void changePassword(ChangeParamter changeParamter);

    void recover(ChangeParamter changeParamter);


    /**
     * 检查用户名是否存在
     * @param user  用户信息对象
     * @return      用户信息集合
     */
    List<User> checkNickName(User user);

    /**
     * 检查邮箱是否存在
     * @param user  用户信息对象
     * @return      用户信息集合
     */
    List<User> checkEmail(User user);

    /**
     * 用户的登录校验
     * @param user  前端传递的用户信息
     * @return      true 登录成功; false 登录失败
     */
    List<User> loginUser(User user);

    /**
     * 获取单个用户的所有信息
     * @param user  前端用户的登录信息
     * @return      数据库中用户的所有信息
     */
    User getUserByEmail(User user);

    /**
     * 设置用户表中的验证码字段
     * @param forgotParameter
     */
    void setCode(ForgotParameter forgotParameter);

    /**
     * 判断邮箱验证码是否正确
     * @return  用户信息集合
     */
    List<User> checkCode(ChangeParamter changeParamter);

    /**
     * 根据邮箱验证码修改用户密码
     * @param changeParamter    前端用户提交信息
     * @return                  影响行数
     */
    Integer updatePassword(ChangeParamter changeParamter);
}