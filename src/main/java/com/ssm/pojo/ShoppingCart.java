package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_shopping_cart")
public class ShoppingCart {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 商品名字
     */
    @Column(name = "commodity_name")
    private String commodityName;

    /**
     * 商品类型（景点，酒店，餐馆）
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 商品图片
     */
    @Column(name = "commodity_picture")
    private String commodityPicture;

    /**
     * 折扣
     */
    private Double discount;

    /**
     * 价格
     */
    @Column(name = "original_cost")
    private Double originalCost;

    /**
     * 商品数量
     */
    @Column(name = "commodity_num")
    private Integer commodityNum;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品名字
     *
     * @return commodity_name - 商品名字
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名字
     *
     * @param commodityName 商品名字
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
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
     * 获取商品图片
     *
     * @return commodity_picture - 商品图片
     */
    public String getCommodityPicture() {
        return commodityPicture;
    }

    /**
     * 设置商品图片
     *
     * @param commodityPicture 商品图片
     */
    public void setCommodityPicture(String commodityPicture) {
        this.commodityPicture = commodityPicture == null ? null : commodityPicture.trim();
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获取价格
     *
     * @return original_cost - 价格
     */
    public Double getOriginalCost() {
        return originalCost;
    }

    /**
     * 设置价格
     *
     * @param originalCost 价格
     */
    public void setOriginalCost(Double originalCost) {
        this.originalCost = originalCost;
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