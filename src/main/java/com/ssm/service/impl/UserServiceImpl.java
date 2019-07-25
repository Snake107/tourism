package com.ssm.service.impl;

import com.ssm.dao.mappingExt.UserMapperExt;
import com.ssm.dto.ChangeParamter;
import com.ssm.dto.ForgotParameter;
import com.ssm.email.SendEmail;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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

    /**
     * 忘记密码  发送验证码到用户邮箱
     * @param forgotParameter
     * @return
     */
    @Override
    public Object sendEmail(ForgotParameter forgotParameter) {
        String string = UUID.randomUUID().toString().substring(0,6);
        String str = "您的邮箱验证代码为: "+string+"，请在网页中填写，完成验证。";
        forgotParameter.setCode(string);
        try {
            SendEmail.sendQQMails(forgotParameter.getEmail(),str);
        } catch (Exception e) {
            userMapperExt.setCode(forgotParameter);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过邮箱验证码 , 修改密码
     * @param changeParamter    用户修改的信息
     * @return                  返回 1 为修改成功 , 返回 0 为修改失败
     */
    @Override
    public Integer changePassword(ChangeParamter changeParamter) {
        // 判断邮箱验证码是否正确
        List<User> list = userMapperExt.checkCode(changeParamter);
        if (list.size() > 0){
            // 验证码正确则修改密码
            return userMapperExt.updatePassword(changeParamter);
        }
        return 0;
    }
}
