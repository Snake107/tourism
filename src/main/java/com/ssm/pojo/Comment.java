package com.ssm.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment")
public class Comment {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 商品类型，1景点2酒店3餐厅
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 评论用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 父级评论
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 评论时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 评分
     */
    private Integer mark;

    private Integer flag;

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
     * 获取商品类型，1景点2酒店3餐厅
     *
     * @return big_type - 商品类型，1景点2酒店3餐厅
     */
    public Integer getBigType() {
        return bigType;
    }

    /**
     * 设置商品类型，1景点2酒店3餐厅
     *
     * @param bigType 商品类型，1景点2酒店3餐厅
     */
    public void setBigType(Integer bigType) {
        this.bigType = bigType;
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
     * @return user_id - 评论用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置评论用户id
     *
     * @param userId 评论用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * 获取评论时间
     *
     * @return create_time - 评论时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置评论时间
     *
     * @param createTime 评论时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}