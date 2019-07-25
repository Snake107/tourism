package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_big_type")
public class BigType {
    @Id
    private Integer id;

    /**
     * 主类型
     */
    @Column(name = "p_type")
    private Integer pType;

    /**
     * 类型名称
     */
    @Column(name = "p_name")
    private String pName;

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
     * 获取主类型
     *
     * @return p_type - 主类型
     */
    public Integer getpType() {
        return pType;
    }

    /**
     * 设置主类型
     *
     * @param pType 主类型
     */
    public void setpType(Integer pType) {
        this.pType = pType;
    }

    /**
     * 获取类型名称
     *
     * @return p_name - 类型名称
     */
    public String getpName() {
        return pName;
    }

    /**
     * 设置类型名称
     *
     * @param pName 类型名称
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
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