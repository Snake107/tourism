package com.ssm.service.impl;

import com.ssm.dao.mapping.ShoppingCartMapper;
import com.ssm.dao.mappingExt.ShoppingCartMapperExt;
import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.pojo.ShoppingCart;
import com.ssm.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 17:05
 */
@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired
    ShoppingCartMapperExt shoppingCartMapperExt;

    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public ShopCartDto getShopCartById(Integer userId) {
        return shoppingCartMapperExt.getShopCartById(userId);
    }

    @Override
    public boolean addShopCart(ShoppingCart shoppingCart) {
        Integer rSet = shoppingCartMapperExt.addShopCart(shoppingCart);
        if (rSet>0){
            return true;
        }
        return false;
    }
    //？？？？？？？？？？？？？？？？？
    @Override
    public List<ShoppingCart> getAllShopCartByUserId(Integer id) {
        return shoppingCartMapper.selectByExample(id);
    }

    @Override
    public boolean addShopCartByUpdate(ShoppingCart shoppingCart) {
        Integer rSet = shoppingCartMapperExt.addShopCartByUpdate(shoppingCart);
        if (rSet>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delShopCartByID(Integer id) {
        Integer rSet = shoppingCartMapperExt.delShopCartByID(id);
        if (rSet>0){
            return true;
        }
        return false;
    }

    @Override
    public ShopCartDto getTotalMoney(Integer userid) {
        return shoppingCartMapperExt.getTotalMoney(userid);
    }

    @Override
    public double ifMember(Integer userid) {
        return shoppingCartMapperExt.ifMember(userid);
    }

    @Override
    public boolean updateShopCartNum(ShoppingCart shoppingCart) {
        Integer rSet = shoppingCartMapperExt.updateShopCartNum(shoppingCart);
        if (rSet>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delAllShopCartByUserId(Integer userId) {
        Integer rSet = shoppingCartMapperExt.delAllShopCartByUserId(userId);
        if (rSet>0){
            return true;
        }
        return false;
    }
}
