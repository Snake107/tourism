package com.ssm.service;

import com.ssm.dto.ChangeParamter;
import com.ssm.dto.ForgotParameter;
import com.ssm.pojo.User;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
    // 发送验证码到用户邮箱,并把验证码存到数据库中
    Object sendEmail(ForgotParameter forgotParameter);
    // 通过邮箱验证,修改用户密码
    Integer changePassword(ChangeParamter changeParamter);
    // 用户提交头像
    Object updateIcon(HttpServletRequest request, MultipartFile file);
    // 修改用户信息
    Integer updateUser(User user);
    // 根据 id 获取用户信息
    User getUserById(int id);
    // 原密码的校验
    boolean checkPassword(User user);
    // 修改密码
    boolean updatePassword(User user);
}
