package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_comment")
public class Comment {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 评论用户id
     */
    @Column(name = "commodity_user_id")
    private Integer commodityUserId;

    /**
     * 商品类型，1景点2酒店3餐厅
     */
    @Column(name = "commodity_type")
    private Integer commodityType;

    /**
     * 父级评论
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 评分
     */
    private Integer mark;

    private Integer flag;

    /**
     * 评论内容
     */
    private String content;

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
     * 获取评论用户id
     *
     * @return commodity_user_id - 评论用户id
     */
    public Integer getCommodityUserId() {
        return commodityUserId;
    }

    /**
     * 设置评论用户id
     *
     * @param commodityUserId 评论用户id
     */
    public void setCommodityUserId(Integer commodityUserId) {
        this.commodityUserId = commodityUserId;
    }

    /**
     * 获取商品类型，1景点2酒店3餐厅
     *
     * @return commodity_type - 商品类型，1景点2酒店3餐厅
     */
    public Integer getCommodityType() {
        return commodityType;
    }

    /**
     * 设置商品类型，1景点2酒店3餐厅
     *
     * @param commodityType 商品类型，1景点2酒店3餐厅
     */
    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
    }

    /**
     * 获取父级评论
     *
     * @return parent_id - 父级评论
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级评论
     *
     * @param parentId 父级评论
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取评分
     *
     * @return mark - 评分
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * 设置评分
     *
     * @param mark 评分
     */
    public void setMark(Integer mark) {
        this.mark = mark;
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

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}