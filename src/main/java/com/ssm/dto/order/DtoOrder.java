package com.ssm.dto.order;



/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/5 10:01
 */

public class DtoOrder {
    private Integer userId;
    private String tradeNo;
    private String outTradeNo;
    private String orderName;
    private double totalMoney;
    private double invoiceAmount;
    private String payTime;
    private String description;
    private String arrivalDate;
    private String departureDate;

    public DtoOrder() {
    }

    public DtoOrder(String tradeNo, String outTradeNo, String orderName, double totalMoney, double invoiceAmount, String payTime) {
        this.tradeNo = tradeNo;
        this.outTradeNo = outTradeNo;
        this.orderName = orderName;
        this.totalMoney = totalMoney;
        this.invoiceAmount = invoiceAmount;
        this.payTime = payTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
