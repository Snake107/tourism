package com.ssm.dto;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 19:59
 * @description：
 * @modified By：
 */
public class ScenceNaviParameter {
    private String orderBy;
    private Integer limit;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
    