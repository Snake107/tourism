package com.ssm.controller;

import com.ssm.dto.ChangeParamter;
import com.ssm.dto.ForgotParameter;
import com.ssm.pojo.User;
import com.ssm.pojo.ext.UserExt;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
     * 用户注册(密码 MD5 加密)
     * @param user  前端获取的用户信息
     * @return      true 注册成功; false 注册失败
     */
    @RequestMapping(value = "register",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean registerUser(@RequestBody User user){
        // md5 加密用户密码
        String password = user.getPassword();
        byte[] bytes = password.getBytes();
        String passwordMD5 = DigestUtils.md5DigestAsHex(bytes);
        user.setPassword(passwordMD5);
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
     * @param userExt  前端获取的用户信息
     * @return      true 登陆成功; false 登陆失败
     */
    @RequestMapping(value = "loginUser",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean loginUser(@RequestBody UserExt userExt, HttpServletRequest request,HttpServletResponse response){
        // 把密码通过 MD5 加密,和数据库进行判断
        String password = userExt.getPassword();
        byte[] bytes = password.getBytes();
        String passwordMD5 = DigestUtils.md5DigestAsHex(bytes);
        userExt.setPassword(passwordMD5);
        boolean flag = userService.loginUser(userExt);
        if (flag){
            // 登录成功
            // 并把该用户的所有信息获取
            User user1 = userService.getUserByEmail(userExt);
            // 设置 cookie
            if ("true".equals(userExt.getRemember())){
                // 创建 Cookie 对象
                Cookie emailCookie = new Cookie("email", userExt.getEmail());
                Cookie passwordCookie = new Cookie("password", userExt.getPassword());
                // 设置有效时间(30天)
                emailCookie.setMaxAge(60*60*24*30);
                passwordCookie.setMaxAge(60*60*24*30);
                // 设置相关路径
                emailCookie.setPath(request.getContextPath());
                passwordCookie.setPath(request.getContextPath());
                // 发送 Cookie 到浏览器
                response.addCookie(emailCookie);
                response.addCookie(passwordCookie);
            }
            // 设置登录凭证,把 user1 对象放入 session 中
            request.getSession().setAttribute("user",user1);
            User user = (User) request.getSession().getAttribute("user");
            System.out.println(request.getSession().getId());
            return true;
        }
        return false;
    }

    /**
     * 忘记密码  发送验证码到用户邮箱
     * @param forgotParameter
     * @return
     */
    @RequestMapping(value = "login/forgot",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object forgotSendEmail(@RequestBody ForgotParameter forgotParameter){
        return userService.sendEmail(forgotParameter);
    }

    /**
     * 修改密码 ,判断输入的验证码是否正确
     * @param changeParamter    前端获取的验证码/新密码/邮箱
     * @return                  返回 1 为修改成功 , 返回 0 为修改失败
     */
    @RequestMapping(value = "login/changePassword",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public Integer changePassword(@RequestBody ChangeParamter changeParamter){
        // 用 MD5 进行密码加密
        String password = changeParamter.getPassword();
        byte[] bytes = password.getBytes();
        String passwordMD5 = DigestUtils.md5DigestAsHex(bytes);
        changeParamter.setPassword(passwordMD5);
        // 验证码成功则修改密码
        return userService.changePassword(changeParamter);
    }

    /**
     * 用户上传头像
     * @param request
     * @param file
     * @return
     */
    @RequestMapping(value = "updateIcon",method= RequestMethod.POST)
    @ResponseBody
    public Object uploadPic(HttpServletRequest request, @RequestParam(name = "file",required = true) MultipartFile file){
        return userService.updateIcon(request,file);
    }

    /**
     * 信息回显
     * @param
     * @return
     */
    @RequestMapping(value = "getUser",method = RequestMethod.POST)
    @ResponseBody
    public User getUser(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        return user;
    }

    /**
     * 判断用户是否有登录
     * @param request
     * @return          true 为已登录 , false 为未登录
     */
    @RequestMapping(value = "checkUserSession",method = RequestMethod.POST)
    @ResponseBody
    public boolean checkUserSession(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if (user != null){
            return true;
        }
        return false;
    }

    /**
     * 注销用户 , 并且清除 cookie
     * @param request
     * @return
     */
    @RequestMapping(value = "logoutUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean logoutUser(HttpServletRequest request,HttpServletResponse response){
        // 清除 session
        request.getSession().removeAttribute("user");

        // 清除 cookie
        Cookie email1 = new Cookie("email", null);
        Cookie password1 = new Cookie("password", null);
        email1.setMaxAge(0);
        password1.setMaxAge(0);
        email1.setPath(request.getContextPath());
        password1.setPath(request.getContextPath());
        response.addCookie(email1);
        response.addCookie(password1);
        return true;
    }

    /**
     * 用户信息修改
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean uploadUser(@RequestBody User user,HttpServletRequest request){
        User user1 = (User) request.getSession().getAttribute("user");
        int id = user1.getId();
        user.setId(id);
        Integer rSet = userService.updateUser(user);
        user1 = userService.getUserById(id);
        if (rSet > 0){
            request.getSession().setAttribute("user",user1);
            return true;
        }
        return false;
    }

    /**
     * 原密码的校验
     * @param user
     * @param request
     * @return          1 密码正确 , 0 密码错误
     */
    @RequestMapping(value = "checkPassword",method = RequestMethod.POST)
    @ResponseBody
    public Integer checkPassword(@RequestBody User user,HttpServletRequest request){
        User user1 = (User) request.getSession().getAttribute("user");
        user.setId(user1.getId());
        // MD5 加密
        String password = user.getPassword();
        byte[] bytes = password.getBytes();
        String passwordMD5 = DigestUtils.md5DigestAsHex(bytes);
        user.setPassword(passwordMD5);
        boolean flag = userService.checkPassword(user);
        Integer a;
        if (flag){
            a = 1;
            return a;
        }
        a = 0;
        return a;
    }

    /**
     * 修改密码
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value = "updatePassword",method = RequestMethod.POST)
    @ResponseBody
    public boolean updatePassword(@RequestBody User user,HttpServletRequest request){
        User user1 = (User) request.getSession().getAttribute("user");
        String password = user.getPassword();
        byte[] bytes = password.getBytes();
        String passwordMD5 = DigestUtils.md5DigestAsHex(bytes);
        user.setPassword(passwordMD5);
        user.setId(user1.getId());
        return userService.updatePassword(user);
    }
}

