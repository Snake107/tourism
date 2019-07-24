package com.ssm.controller;

import com.ssm.service.ScenceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:55
 */
@Controller
@RequestMapping(value = "/secence")
public class ScenceController {

    @Resource
    ScenceService scenceService;

    @RequestMapping(value = "/selectIndexSixScenceInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object selectIndexSixScenceInfo(){
        return scenceService.selectIndexSixScenceInfo();
    }

}
