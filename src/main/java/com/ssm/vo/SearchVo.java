package com.ssm.vo;

public class SearchVo {
    private String keyword;
    private String region;
    private Integer classification;
    private Integer mark;
    private Integer max;
    private Integer min;

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public SearchVo() {
    }

    public SearchVo(String keyword, String region, Integer classification) {
        this.keyword = keyword;
        this.region = region;
        this.classification = classification;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
            ", classification=" + classification +
            ", mark=" + mark +
            ", max=" + max +
            ", min=" + min +
            '}';
    }
}
