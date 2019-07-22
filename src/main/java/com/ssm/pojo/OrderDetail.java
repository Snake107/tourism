package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_order_detail")
public class OrderDetail {
    @Id
    private Integer id;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 商品Id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 商品类型（景点，酒店，餐馆）
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 商品价格
     */
    @Column(name = "commodity_money")
    private Double commodityMoney;

    /**
     * 商品折扣价格
     */
    @Column(name = "commodity_discount_money")
    private Double commodityDiscountMoney;

    /**
     * 商品数量
     */
    @Column(name = "commodity_num")
    private Integer commodityNum;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品Id
     *
     * @return commodity_id - 商品Id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品Id
     *
     * @param commodityId 商品Id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品类型（景点，酒店，餐馆）
     *
     * @return big_type - 商品类型（景点，酒店，餐馆）
     */
    public Integer getBigType() {
        return bigType;
    }

    /**
     * 设置商品类型（景点，酒店，餐馆）
     *
     * @param bigType 商品类型（景点，酒店，餐馆）
     */
    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    /**
     * 获取商品价格
     *
     * @return commodity_money - 商品价格
     */
    public Double getCommodityMoney() {
        return commodityMoney;
    }

    /**
     * 设置商品价格
     *
     * @param commodityMoney 商品价格
     */
    public void setCommodityMoney(Double commodityMoney) {
        this.commodityMoney = commodityMoney;
    }

    /**
     * 获取商品折扣价格
     *
     * @return commodity_discount_money - 商品折扣价格
     */
    public Double getCommodityDiscountMoney() {
        return commodityDiscountMoney;
    }

    /**
     * 设置商品折扣价格
     *
     * @param commodityDiscountMoney 商品折扣价格
     */
    public void setCommodityDiscountMoney(Double commodityDiscountMoney) {
        this.commodityDiscountMoney = commodityDiscountMoney;
    }

    /**
     * 获取商品数量
     *
     * @return commodity_num - 商品数量
     */
    public Integer getCommodityNum() {
        return commodityNum;
    }

    /**
     * 设置商品数量
     *
     * @param commodityNum 商品数量
     */
    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }
}