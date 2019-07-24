package com.ssm.vo;

/**
 * 浏览量+1
 */
public class ViewsVo {
    /**
     * 大类型
     */
    private String bigType;
    /**
     * 商品ID
     */
    private String commodityId;

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }
}
