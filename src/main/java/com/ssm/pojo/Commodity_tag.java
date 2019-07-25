package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_commodity_tag")
public class Commodity_tag {
    @Id
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 商品类型
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 标签ID
     */
    @Column(name = "tag_id")
    private Integer tagId;

    private Integer flag;

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
     * 获取标签ID
     *
     * @return tag_id - 标签ID
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置标签ID
     *
     * @param tagId 标签ID
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}