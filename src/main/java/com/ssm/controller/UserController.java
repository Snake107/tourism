package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.pojo.ext.UserExt;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: FatCao
 * @Date: 2019-07-22 21:57
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Resource
    UserService userService;

    /**
     *用户注册
     * @param user  前端获取的用户信息
     * @return      true 注册成功; false 注册失败
     */
    @RequestMapping(value = "register",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean registerUser(@RequestBody User user){
        return userService.addUser(user);
    }

    /**
     * 检查用户名是否存在
     * @param user  前端获取的用户信息
     * @return      true 用户名可用; false 用户名已存在
     */
    @RequestMapping(value = "checkNickName",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean checkNickName(@RequestBody User user){
        return userService.checkNickName(user);
    }

    /**
     * 检查邮箱是否存在
     * @param user  前端获取的用户信息
     * @return      true 邮箱可用; false 邮箱已存在
     */
    @RequestMapping(value = "checkEmail",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean checkEmail(@RequestBody User user){
        return userService.checkEmail(user);
    }

    /**
     * 用户的登录校验(含记录cookie)
     * @param user  前端获取的用户信息
     * @return      true 登陆成功; false 登陆失败
     */
    @RequestMapping(value = "loginUser",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean loginUser(@RequestBody UserExt userExt, HttpServletRequest request, HttpServletResponse response){
        boolean flag = userService.loginUser(userExt);
        if (flag){
            // 登录成功
            // 并把该用户的所有信息获取
            User user1 = userService.getUserByEmail(userExt);
            // 设置 cookie
            if ("true".equals(userExt.getRemember())){
                // 创建 Cookie 对象
                Cookie email = new Cookie("email", userExt.getEmail());
                Cookie password = new Cookie("password", userExt.getPassword());
                // 设置有效时间(30天)
                email.setMaxAge(60*60*24*30);
                password.setMaxAge(60*60*24*30);
                // 设置相关路径
                email.setPath(request.getContextPath());
                password.setPath(request.getContextPath());
                // 发送 Cookie 到浏览器
                response.addCookie(email);
                response.addCookie(password);
            }
            // 设置登录凭证,把 user1 对象放入 session 中
            request.getSession().setAttribute("user",user1);
            return true;
        }
        return false;
    }
}

// B59C67BF196A4758191E42F76670CEBA
// B59C67BF196A4758191E42F76670CEBA