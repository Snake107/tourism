package com.ssm.pojo;

import javax.persistence.*;

@Table(name = "t_contact")
public class Contact {
    @Id
    private Integer id;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 填的邮箱
     */
    private String email;

    /**
     * 反馈内容
     */
    @Column(name = "contact_message")
    private String contactMessage;

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
     * 获取用户姓名
     *
     * @return username - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取填的邮箱
     *
     * @return email - 填的邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置填的邮箱
     *
     * @param email 填的邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取反馈内容
     *
     * @return contact_message - 反馈内容
     */
    public String getContactMessage() {
        return contactMessage;
    }

    /**
     * 设置反馈内容
     *
     * @param contactMessage 反馈内容
     */
    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage == null ? null : contactMessage.trim();
    }
}