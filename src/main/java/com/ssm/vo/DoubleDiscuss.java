package com.ssm.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 15:17
 * @description：
 * @modified By：
 */
public class DoubleDiscuss implements Serializable {
    private Integer id;
    private Integer userId;
    private String content;
    private Integer mark;
    private Date createTime;
    private String nickName;
    private String icon;
    private List<BaseDiscuss> baseDiscussList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<BaseDiscuss> getBaseDiscussList() {
        return baseDiscussList;
    }

    public void setBaseDiscussList(List<BaseDiscuss> baseDiscussList) {
        this.baseDiscussList = baseDiscussList;
    }
}
    