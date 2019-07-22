package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_tags")
public class Tags {
    @Id
    private Integer id;

    /**
     * 景点标签名称
     */
    @Column(name = "tag_name")
    private String tagName;

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
     * 获取景点标签名称
     *
     * @return tag_name - 景点标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置景点标签名称
     *
     * @param tagName 景点标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
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