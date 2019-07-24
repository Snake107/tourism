package com.ssm.pojo.ext;

/**
 * author: QI
 */

import com.ssm.pojo.Scence;

public class ScenceExt extends Scence {
    private String tagName;
    private Integer reviews;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }
}