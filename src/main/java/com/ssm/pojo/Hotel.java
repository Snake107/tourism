package com.ssm.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_hotel")
public class Hotel {
    @Id
    private Integer id;

    /**
     * 酒店名称
     */
    @Column(name = "hotel_name")
    private String hotelName;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份/州
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 照片
     */
    private String picture;

    /**
     * 价格
     */
    private Double price;

    /**
     * 评分
     */
    private Double mark;

    /**
     * 添加日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改日期
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

    private Integer flag;

    /**
     * 描述
     */
    private String description;

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
     * 获取酒店名称
     *
     * @return hotel_name - 酒店名称
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置酒店名称
     *
     * @param hotelName 酒店名称
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取省份/州
     *
     * @return province - 省份/州
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份/州
     *
     * @param province 省份/州
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
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
     * 获取添加日期
     *
     * @return create_date - 添加日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置添加日期
     *
     * @param createDate 添加日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     *
     * @return update_date - 修改日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期
     *
     * @param updateDate 修改日期
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