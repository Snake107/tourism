package com.ssm.controller;

import com.ssm.dto.ScenceNaviParameter;
import com.ssm.service.ScenceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;

import com.ssm.dto.scence.ScenceDto;
import com.ssm.pojo.Tags;
import com.ssm.service.ScenceService;
import com.ssm.vo.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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


    @RequestMapping(value = "getAttractions",method = RequestMethod.GET)
    @ResponseBody
    public List<ScenceDto> getAttractions(){
        return scenceService.getAttractions();
    }
    @RequestMapping(value = "TravelSearch",method = RequestMethod.POST)
    @ResponseBody
    public List<ScenceDto> TravelSearch(@RequestBody SearchVo searchVo){
        return scenceService.TravelSearch(searchVo);
    }
    @RequestMapping(value = "getLabel",method = RequestMethod.GET)
    @ResponseBody
    public List<Tags> getLabel(){
        return scenceService.getLabel();
    }
}
