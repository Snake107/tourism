package com.ssm.dto.allsearch;

public class SearchDto {


    private Integer id;
    private Integer city_id;
    private String name;
    private String picture;
    private String description;
    private Double price;
    private Double mark;
    private Integer pType;
    private Integer travelAgencyId;
    private String country;
    private String province;
    private String city;
    private String cityDescription;
    private Integer tagsId;
    private Integer views;
    private Integer commentNumber;
    private String tagName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public Integer getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(Integer travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
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

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public Integer getTagsId() {
        return tagsId;
    }

    public void setTagsId(Integer tagsId) {
        this.tagsId = tagsId;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "SearchDto{" +
            "id=" + id +
            ", city_id=" + city_id +
            ", name='" + name + '\'' +
            ", picture='" + picture + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            ", mark=" + mark +
            ", pType=" + pType +
            ", travelAgencyId=" + travelAgencyId +
            ", country='" + country + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", cityDescription='" + cityDescription + '\'' +
            ", tagsId=" + tagsId +
            ", views=" + views +
            ", commentNumber=" + commentNumber +
            ", tagName='" + tagName + '\'' +
            '}';
    }
}
