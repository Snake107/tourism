package com.ssm.dto.shopcart;

import com.ssm.pojo.ShoppingCart;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 16:41
 */
public class ShopCartDto  {


    private double totalOriginalMoney;

    private List<ShoppingCart> shoppingCartList;



    public double getTotalOriginalMoney() {
        return totalOriginalMoney;
    }

    public void setTotalOriginalMoney(double totalOriginalMoney) {
        this.totalOriginalMoney = totalOriginalMoney;
    }

    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<ShoppingCart> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }
}
