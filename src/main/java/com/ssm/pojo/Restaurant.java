package com.ssm.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_restaurant")
public class Restaurant {
    /**
     * 餐厅类型
     */
    @Id
    private Integer id;

    /**
     * 餐厅名称
     */
    @Column(name = "restaurant_name")
    private String restaurantName;

    /**
     * 照片
     */
    private String picture;

    /**
     * 城市id
     */
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 价格
     */
    private Double price;

    /**
     * 评分
     */
    private Double mark;

    /**
     * 添加时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 地理位置坐标
     */
    private String coordinate;

    /**
     * 所属类型
     */
    @Column(name = "p_type")
    private Integer pType;

    /**
     * 点击量
     */
    private Integer views;

    /**
     * 旅游行程
     */
    @Column(name = "program_id")
    private Integer programId;

    /**
     * 标签id
     */
    @Column(name = "tags_id")
    private Integer tagsId;

    /**
     * 旅行社id
     */
    @Column(name = "travel_agency_id")
    private Integer travelAgencyId;

    private Integer flag;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取餐厅类型
     *
     * @return id - 餐厅类型
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置餐厅类型
     *
     * @param id 餐厅类型
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取餐厅名称
     *
     * @return restaurant_name - 餐厅名称
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * 设置餐厅名称
     *
     * @param restaurantName 餐厅名称
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    /**
     * 获取照片
     *
     * @return picture - 照片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置照片
     *
     * @param picture 照片
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取城市id
     *
     * @return city_id - 城市id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置城市id
     *
     * @param cityId 城市id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取评分
     *
     * @return mark - 评分
     */
    public Double getMark() {
        return mark;
    }

    /**
     * 设置评分
     *
     * @param mark 评分
     */
    public void setMark(Double mark) {
        this.mark = mark;
    }

    /**
     * 获取添加时间
     *
     * @return create_date - 添加时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置添加时间
     *
     * @param createDate 添加时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取地理位置坐标
     *
     * @return coordinate - 地理位置坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置地理位置坐标
     *
     * @param coordinate 地理位置坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    /**
     * 获取所属类型
     *
     * @return p_type - 所属类型
     */
    public Integer getpType() {
        return pType;
    }

    /**
     * 设置所属类型
     *
     * @param pType 所属类型
     */
    public void setpType(Integer pType) {
        this.pType = pType;
    }

    /**
     * 获取点击量
     *
     * @return views - 点击量
     */
    public Integer getViews() {
        return views;
    }

    /**
     * 设置点击量
     *
     * @param views 点击量
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 获取旅游行程
     *
     * @return program_id - 旅游行程
     */
    public Integer getProgramId() {
        return programId;
    }

    /**
     * 设置旅游行程
     *
     * @param programId 旅游行程
     */
    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    /**
     * 获取标签id
     *
     * @return tags_id - 标签id
     */
    public Integer getTagsId() {
        return tagsId;
    }

    /**
     * 设置标签id
     *
     * @param tagsId 标签id
     */
    public void setTagsId(Integer tagsId) {
        this.tagsId = tagsId;
    }

    /**
     * 获取旅行社id
     *
     * @return travel_agency_id - 旅行社id
     */
    public Integer getTravelAgencyId() {
        return travelAgencyId;
    }

    /**
     * 设置旅行社id
     *
     * @param travelAgencyId 旅行社id
     */
    public void setTravelAgencyId(Integer travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
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
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}