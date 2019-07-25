package com.ssm.dto.description;

import com.ssm.pojo.TSchedule;

import java.util.List;

public class GoodsDescription {

    private Integer id;
    private String scenceName;
    private String picture;
    private String description;
    private Integer price;
    private Integer views;
    private Integer mark;
    private Integer totalNumber;
    private String country;
    private String province;
    private String city;
    private String pType;
    private List<TSchedule> schedule;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScenceName() {
        return scenceName;
    }

    public void setScenceName(String scenceName) {
        this.scenceName = scenceName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public List<TSchedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<TSchedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "GoodsDescription{" +
            "id=" + id +
            ", scenceName='" + scenceName + '\'' +
            ", picture='" + picture + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            ", views=" + views +
            ", mark=" + mark +
            ", totalNumber=" + totalNumber +
            ", country='" + country + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", pType='" + pType + '\'' +
            ", schedule=" + schedule +
            '}';
    }
}
