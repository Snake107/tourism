package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: FatCao
 * @Date: 2019-07-22 21:57
 */
@Controller
public class UserController {

    @Resource
    UserService userService;

    /**
     *用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/register",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public boolean registerUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
