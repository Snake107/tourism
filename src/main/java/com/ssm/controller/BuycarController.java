package com.ssm.controller;

import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.pojo.ShoppingCart;
import com.ssm.pojo.User;
import com.ssm.service.ShopCartService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:58
 */
@RestController
@RequestMapping(value = "/buycart")
public class BuycarController {
    @Resource
    ShopCartService shopCartService;

    @RequestMapping(value = "/getShopCartById",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getShopCartById(@RequestBody User user){
        ShopCartDto shopCartById = shopCartService.getShopCartById(user.getId());
//        shopCartById.getShoppingCartList().forEach(shopcart->{
//            System.out.println(shopcart.getCommodityName());
//        });

        return shopCartById;
    }

    @RequestMapping(value = "/addShopCart",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object addShopCart(@RequestBody ShoppingCart shoppingCart){

        List<ShoppingCart> allShopCartByUserId = shopCartService.getAllShopCartByUserId(shoppingCart.getUserId());

        for (ShoppingCart cart : allShopCartByUserId) {
            if (cart.getCommodityId().equals(shoppingCart.getCommodityId())&&cart.getBigType().equals(shoppingCart.getBigType())){
                cart.setCommodityNum( cart.getCommodityNum()+shoppingCart.getCommodityNum());

                return shopCartService.addShopCartByUpdate(cart);
            }
        }
        double v = shopCartService.ifMember(shoppingCart.getUserId());

        shoppingCart.setDiscount(v);
        return shopCartService.addShopCart(shoppingCart);
    }

    @RequestMapping(value = "/delShopCartByID",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object delShopCartByID(@RequestBody ShoppingCart shoppingCart){

        return shopCartService.delShopCartByID(shoppingCart.getId());
    }

    @RequestMapping(value = "/updateShopCartNum",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object updateShopCartNum(@RequestBody ShoppingCart shoppingCart){
        return  shopCartService.updateShopCartNum(shoppingCart);
    }
}
