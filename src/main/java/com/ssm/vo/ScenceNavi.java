package com.ssm.vo;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 20:02
 * @description：
 * @modified By：
 */
public class ScenceNavi {
    private Integer id;
    private String country;
    private String city;
    private String picture;
    private Double price;
    private String description;
    private Integer hotelNum;
    private Integer restaurantNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHotelNum() {
        return hotelNum;
    }

    public void setHotelNum(Integer hotelNum) {
        this.hotelNum = hotelNum;
    }

    public Integer getRestaurantNum() {
        return restaurantNum;
    }

    public void setRestaurantNum(Integer restaurantNum) {
        this.restaurantNum = restaurantNum;
    }
}
    