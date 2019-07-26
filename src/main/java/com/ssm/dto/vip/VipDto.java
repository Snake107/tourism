package com.ssm.dto.vip;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


public class VipDto {

    private Integer id;

    /**
     * 用户id
     */

    private Integer userId;

    /**
     * 充值套餐
     */

    private Integer vipMeal;

    /**
     * 开始时间
     */

    private String startTime;

    /**
     * 结束时间
     */

    private String endTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取充值套餐
     *
     * @return vip_meal - 充值套餐
     */
    public Integer getVipMeal() {
        return vipMeal;
    }

    /**
     * 设置充值套餐
     *
     * @param vipMeal 充值套餐
     */
    public void setVipMeal(Integer vipMeal) {
        this.vipMeal = vipMeal;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}