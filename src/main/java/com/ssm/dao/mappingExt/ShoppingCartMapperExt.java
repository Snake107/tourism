package com.ssm.dao.mappingExt;

import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.pojo.ShoppingCart;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ShoppingCartMapperExt extends Mapper<ShoppingCart> {
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
    Integer addShopCart(ShoppingCart shoppingCart);

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
    Integer addShopCartByUpdate(ShoppingCart shoppingCart);

    /**
     * 删除单个商品
     * @param id
     * @return
     */
    Integer delShopCartByID(Integer id);

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
    Integer updateShopCartNum(ShoppingCart shoppingCart);

    /**
     * 清空购物车
     * @param userId
     * @return
     */
    Integer delAllShopCartByUserId(Integer userId);
}