package com.ssm.controller;

import com.ssm.dto.ScenceNaviParameter;
import com.ssm.service.ScenceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:55
 */
@Controller
@ResponseBody
@RequestMapping(value = "scence")
public class ScenceController {
    @Resource
    ScenceService scenceService;

    /**
     * 添加评论
     * @param scenceNaviParameter
     * @return
     */
    @RequestMapping(value = "navi/list",method = RequestMethod.POST)
    public Object addComment(@RequestBody ScenceNaviParameter scenceNaviParameter){
        return scenceService.getScenceNavi(scenceNaviParameter);
    }


    @RequestMapping(value = "/selectIndexSixScenceInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object selectIndexSixScenceInfo(){
        return scenceService.selectIndexSixScenceInfo();
    }

}
