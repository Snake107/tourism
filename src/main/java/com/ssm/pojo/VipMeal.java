package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_vip_meal")
public class VipMeal {
    @Id
    private Integer id;

    /**
     * 充值套餐名
     */
    @Column(name = "vip_name")
    private String vipName;

    /**
     * 会员充值费用


     */
    @Column(name = "vip_money")
    private Integer vipMoney;

    /**
     * 充值月数
     */
    @Column(name = "vip_time")
    private String vipTime;

    /**
     * 打折数
     */
    @Column(name = "vip_discount")
    private Double vipDiscount;

    private Integer flag;

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
     * 获取充值套餐名
     *
     * @return vip_name - 充值套餐名
     */
    public String getVipName() {
        return vipName;
    }

    /**
     * 设置充值套餐名
     *
     * @param vipName 充值套餐名
     */
    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    /**
     * 获取会员充值费用


     *
     * @return vip_money - 会员充值费用


     */
    public Integer getVipMoney() {
        return vipMoney;
    }

    /**
     * 设置会员充值费用


     *
     * @param vipMoney 会员充值费用


     */
    public void setVipMoney(Integer vipMoney) {
        this.vipMoney = vipMoney;
    }

    /**
     * 获取充值月数
     *
     * @return vip_time - 充值月数
     */
    public String getVipTime() {
        return vipTime;
    }

    /**
     * 设置充值月数
     *
     * @param vipTime 充值月数
     */
    public void setVipTime(String vipTime) {
        this.vipTime = vipTime == null ? null : vipTime.trim();
    }

    /**
     * 获取打折数
     *
     * @return vip_discount - 打折数
     */
    public Double getVipDiscount() {
        return vipDiscount;
    }

    /**
     * 设置打折数
     *
     * @param vipDiscount 打折数
     */
    public void setVipDiscount(Double vipDiscount) {
        this.vipDiscount = vipDiscount;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}