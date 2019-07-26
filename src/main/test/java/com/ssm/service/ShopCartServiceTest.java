package com.ssm.service;


import com.ssm.dto.order.OrderDto;
import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.pojo.ShoppingCart;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 17:10
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"})
public class ShopCartServiceTest {
//    @Resource
//    ShopCartService shopCartService;
//
//    @Test
//    public void testgetShopCartById(){
//        ShopCartDto shopCartById = shopCartService.getShopCartById(1);
//        List<ShoppingCart> shoppingCartList = shopCartById.getShoppingCartList();
//        shoppingCartList.forEach(shopcart->{
//            System.out.println(shopcart.getCommodityName());
//        });
//    }

    @Resource
    OrderService orderService;

    @Test
    public void testorderid(){
        OrderDto orderDto = new OrderDto();
        orderDto.setUserId(1);
        orderDto.setTradeNo("2");

        Integer integer = orderService.addOrder(orderDto);
        System.out.println(orderDto.getId());
    }

}
