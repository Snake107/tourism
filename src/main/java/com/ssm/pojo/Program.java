package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_program")
public class Program {
    @Id
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 商品类型
     */
    @Column(name = "big_type")
    private Integer bigType;

    private String timelong;

    private String time;

    private Integer num;

    private String name;

    private String detail;

    private String pic;

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
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品类型
     *
     * @return big_type - 商品类型
     */
    public Integer getBigType() {
        return bigType;
    }

    /**
     * 设置商品类型
     *
     * @param bigType 商品类型
     */
    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    /**
     * @return timelong
     */
    public String getTimelong() {
        return timelong;
    }

    /**
     * @param timelong
     */
    public void setTimelong(String timelong) {
        this.timelong = timelong == null ? null : timelong.trim();
    }

    /**
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}