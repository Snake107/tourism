package com.ssm.vo;

public class SearchVo {
    private String keyword;
    private String region;
    private Integer classification;

    public SearchVo() {
    }

    public SearchVo(String keyword, String region, Integer classification) {
        this.keyword = keyword;
        this.region = region;
        this.classification = classification;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "SearchVo{" +
            "keyword='" + keyword + '\'' +
            ", region='" + region + '\'' +
            ", classification='" + classification + '\'' +
            '}';
    }
}
