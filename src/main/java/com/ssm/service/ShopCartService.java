package com.ssm.service;

import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.pojo.ShoppingCart;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 17:05
 */
public interface ShopCartService {
    /**
     * 根据ID获取购物车商品
     * @return
     */
    ShopCartDto getShopCartById(Integer userId);

    /**
     * 添加到购物车
     * @param shoppingCart
     * @return
     */
    boolean addShopCart(ShoppingCart shoppingCart);

    /**
     * 查询所有的购物车信息
     * @param id
     * @return
     */
    List<ShoppingCart> getAllShopCartByUserId(Integer id);

    /**
     * 在已在的购物车上进行添加
     * @param shoppingCart
     * @return
     */
    boolean addShopCartByUpdate(ShoppingCart shoppingCart);

    /**
     * 删除单个商品
     * @param id
     * @return
     */
    boolean delShopCartByID(Integer id);

    /**
     * 根据ID获取总价(折扣，原价)
     * @param userid
     * @return
     */
    ShopCartDto getTotalMoney(Integer userid);

    /**
     * 判断是否会员
     * @param userid
     * @return
     */
    double ifMember(Integer userid);

    /**
     * 改变商品的数量
     * @param shoppingCart
     * @return
     */
    boolean updateShopCartNum(ShoppingCart shoppingCart);

    /**
     * 清空购物车
     * @param userId
     * @return
     */
    boolean delAllShopCartByUserId(Integer userId);
}
