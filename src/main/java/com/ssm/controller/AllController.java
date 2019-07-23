package com.ssm.controller;

import com.ssm.dto.allsearch.SearchDto;
import com.ssm.service.AllService;
import com.ssm.vo.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
        return allService.searchAll(searchVo);
    }
}
