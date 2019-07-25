package com.ssm.dto;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 15:34
 * @description：
 * @modified By：
 */
public class CommentParameter {
    private Integer limit;
    private Integer start;
    private Integer commodityId;
    private Integer bigType;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
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

}
    