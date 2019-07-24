package com.ssm.dto.wish;

import com.ssm.pojo.TCollection;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 10:24
 */
public class CollectionDto extends TCollection {
    private Integer id;
    private String name;
    private String pType;
    private String description;
    private String picture;
    private double price;
    private Integer views;
    private double mark;
    private String tagName;
    private String userid;
    private String nickName;

    private List<CollectionDto> collectionDtos;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<CollectionDto> getCollectionDtos() {
        return collectionDtos;
    }

    public void setCollectionDtos(List<CollectionDto> collectionDtos) {
        this.collectionDtos = collectionDtos;
    }
}
