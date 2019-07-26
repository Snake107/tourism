package com.ssm.controller;

import com.ssm.service.VipService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/25 15:06
 */
@RestController
@RequestMapping("/vip")
public class VipController {

    @Resource
    VipService vipService;

    @RequestMapping(value = "/getVipMeal",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getVipMeal(){

        return vipService.getVipMeal();
    }
}
