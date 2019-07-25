package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_schedule")
public class TSchedule {
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

    /**
     * 时长
     */
    private String timelong;

    /**
     * 时刻
     */
    private String time;

    /**
     * 第几个项目
     */
    private Integer num;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片路径
     */
    private String pic;

    /**
     * 描述
     */
    private String SiteDescription;

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
     * 获取时长
     *
     * @return timelong - 时长
     */
    public String getTimelong() {
        return timelong;
    }

    /**
     * 设置时长
     *
     * @param timelong 时长
     */
    public void setTimelong(String timelong) {
        this.timelong = timelong == null ? null : timelong.trim();
    }

    /**
     * 获取时刻
     *
     * @return time - 时刻
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置时刻
     *
     * @param time 时刻
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * 获取第几个项目
     *
     * @return num - 第几个项目
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置第几个项目
     *
     * @param num 第几个项目
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取图片路径
     *
     * @return pic - 图片路径
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置图片路径
     *
     * @param pic 图片路径
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getSiteDescription() {
        return SiteDescription;
    }

    /**
     * 设置描述
     *
     * @param SiteDescription 描述
     */
    public void setSiteDescription(String SiteDescription) {
        this.SiteDescription = SiteDescription == null ? null : SiteDescription.trim();
    }


    @Override
    public String toString() {
        return "TSchedule{" +
            "id=" + id +
            ", commodityId=" + commodityId +
            ", bigType=" + bigType +
            ", timelong='" + timelong + '\'' +
            ", time='" + time + '\'' +
            ", num=" + num +
            ", title='" + title + '\'' +
            ", pic='" + pic + '\'' +
            ", SiteDescription='" + SiteDescription + '\'' +
            '}';
    }
}