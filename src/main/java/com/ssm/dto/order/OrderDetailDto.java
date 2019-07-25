package com.ssm.dto.order;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/24 21:05
 */
public class OrderDetailDto {

    private Integer tradeId;
    private Integer commodityId;
    private Integer bigType;
    private Double originalCost;
    private Integer commodityNum;


    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getBigType() {
        return bigType;
    }

    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    public Double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(Double originalCost) {
        this.originalCost = originalCost;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" +
                "tradeId=" + tradeId +
                ", commodityId=" + commodityId +
                ", bigType=" + bigType +
                ", originalCost=" + originalCost +
                ", commodityNum=" + commodityNum +
                '}';
    }
}
