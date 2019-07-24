package com.ssm.controller;

import com.ssm.dto.wish.CollectionDto;
import com.ssm.pojo.User;
import com.ssm.service.CollectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:57
 */
@RestController
@RequestMapping(value = "/wish")
public class WishController {

    @Resource
    CollectionService collectionService;

    @RequestMapping(value = "/list",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getCollectionById(@RequestBody User user){
        CollectionDto collection = collectionService.getCollectionById(user.getId());
        collection.getCollectionDtos().forEach(wish ->{
            //System.out.println(wish.getDescription());
        });
        return collection.getCollectionDtos();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object insertCollection(@RequestBody CollectionDto collectionDto){
        Integer rSet = collectionService.addCollection(collectionDto);
       // System.out.println(rSet);
        return rSet;
    }

    @RequestMapping(value = "/del",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object delCollection(@RequestBody CollectionDto collectionDto){
        Integer rSet = collectionService.delCollection(collectionDto.getId());
         System.out.println(rSet);
        return rSet;
    }


}
