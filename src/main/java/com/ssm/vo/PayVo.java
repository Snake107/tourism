package com.ssm.vo;

import com.ssm.pojo.ShoppingCart;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/24 11:28
 */
public class PayVo {
    private Integer userid;
    private double totalOriginalMoney;

    private List<ShoppingCart> shoppingCartList;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

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
