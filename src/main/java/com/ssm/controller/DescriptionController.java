package com.ssm.controller;


import com.ssm.dto.description.GoodsDescription;
import com.ssm.service.DescriptionService;
import com.ssm.vo.GoodsDataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Description")
public class DescriptionController {

    @Autowired
    DescriptionService descriptionService;

    @RequestMapping(value = "/getGoodsDescription",method = RequestMethod.POST)
    @ResponseBody
    public GoodsDescription getGoodsDescription(@RequestBody GoodsDataVo goodsDataVo){
        GoodsDescription goodsDescription = descriptionService.GoodsDescription(goodsDataVo);
        System.out.println(goodsDescription);
        System.out.println(goodsDescription.getSchedule());
        return descriptionService.GoodsDescription(goodsDataVo);
    }
}
