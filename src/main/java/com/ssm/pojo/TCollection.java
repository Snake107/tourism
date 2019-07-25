package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_collection")
public class TCollection {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 商品类型
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

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
     * 获取商品ID
     *
     * @return commodity_id - 商品ID
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID
     *
     * @param commodityId 商品ID
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品类型
     *
     * @return big_type - 商品类型
     */
    public Integer getBigType() {
        return bigType;
    }

    /**
     * 设置商品类型
     *
     * @param bigType 商品类型
     */
    public void setBigType(Integer bigType) {
        this.bigType = bigType;
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
}