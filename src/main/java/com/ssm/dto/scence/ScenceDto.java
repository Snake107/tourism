package com.ssm.dto.scence;

import com.ssm.pojo.Scence;

public class ScenceDto {
    private String tagName;
    private Integer tId;
    private Integer id;
    private String scenceName;
    private String picture;
    private String description;
    private Integer price;
    private Integer pType;
    private Integer views;
    private Integer totalNumber;
    private Double mark;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

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

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "ScenceDto{" +
            "tagName='" + tagName + '\'' +
            ", tId=" + tId +
            ", id=" + id +
            ", scenceName='" + scenceName + '\'' +
            ", picture='" + picture + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            ", pType=" + pType +
            ", views=" + views +
            ", totalNumber=" + totalNumber +
            ", mark=" + mark +
            '}';
    }
}
