package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_coupon")
public class Coupon {
    @Id
    private Integer id;

    /**
     * 折扣券名字
     */
    @Column(name = "discount_coupon")
    private String discountCoupon;

    /**
     * 折扣券价格
     */
    @Column(name = "discount_coupon_money")
    private Integer discountCouponMoney;

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
     * 获取折扣券名字
     *
     * @return discount_coupon - 折扣券名字
     */
    public String getDiscountCoupon() {
        return discountCoupon;
    }

    /**
     * 设置折扣券名字
     *
     * @param discountCoupon 折扣券名字
     */
    public void setDiscountCoupon(String discountCoupon) {
        this.discountCoupon = discountCoupon == null ? null : discountCoupon.trim();
    }

    /**
     * 获取折扣券价格
     *
     * @return discount_coupon_money - 折扣券价格
     */
    public Integer getDiscountCouponMoney() {
        return discountCouponMoney;
    }

    /**
     * 设置折扣券价格
     *
     * @param discountCouponMoney 折扣券价格
     */
    public void setDiscountCouponMoney(Integer discountCouponMoney) {
        this.discountCouponMoney = discountCouponMoney;
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