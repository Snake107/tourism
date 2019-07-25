package com.ssm.controller;

import com.ssm.dto.allsearch.SearchDto;
import com.ssm.service.AllService;
import com.ssm.vo.SearchVo;
import com.ssm.vo.ViewsVo;
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
@RequestMapping(value = "all")
public class AllController {


    @Autowired
    AllService allService;


    @RequestMapping(value = "search",method = RequestMethod.POST)
    @ResponseBody
    public List<SearchDto> search(@RequestBody SearchVo searchVo){
        System.out.println(searchVo.toString());
        System.out.println("==========================");

        return allService.searchAll(searchVo);
    }

    /**
     * 浏览量+1
     * @param viewsVo  大类型ID 、具体商品ID
     */
    @RequestMapping(value = "viewsAddOne")
    public void viewsAddOne(@RequestBody ViewsVo viewsVo){
        allService.viewsAddOne(viewsVo);
    }
}
