package com.ssm.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    private Integer id;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 注册邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 头像
     */
    private String icon;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证
     */
    private String identity;

    /**
     * 身份证正面
     */
    @Column(name = "id_card_z")
    private String idCardZ;

    /**
     * 身份证反面
     */
    @Column(name = "id_card_f")
    private String idCardF;

    /**
     * 国家
     */
    private String country;

    /**
     * 城市
     */
    private String city;

    /**
     * 忘记密码（uuid）
     */
    private String code;

    /**
     * 状态
     */
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
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取注册邮箱
     *
     * @return email - 注册邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置注册邮箱
     *
     * @param email 注册邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取头像
     *
     * @return icon - 头像
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     *
     * @param icon 头像
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取用户真实姓名
     *
     * @return real_name - 用户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realName 用户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取身份证
     *
     * @return identity - 身份证
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置身份证
     *
     * @param identity 身份证
     */
    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    /**
     * 获取身份证正面
     *
     * @return id_card_z - 身份证正面
     */
    public String getIdCardZ() {
        return idCardZ;
    }

    /**
     * 设置身份证正面
     *
     * @param idCardZ 身份证正面
     */
    public void setIdCardZ(String idCardZ) {
        this.idCardZ = idCardZ == null ? null : idCardZ.trim();
    }

    /**
     * 获取身份证反面
     *
     * @return id_card_f - 身份证反面
     */
    public String getIdCardF() {
        return idCardF;
    }

    /**
     * 设置身份证反面
     *
     * @param idCardF 身份证反面
     */
    public void setIdCardF(String idCardF) {
        this.idCardF = idCardF == null ? null : idCardF.trim();
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取忘记密码（uuid）
     *
     * @return code - 忘记密码（uuid）
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置忘记密码（uuid）
     *
     * @param code 忘记密码（uuid）
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取状态
     *
     * @return flag - 状态
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置状态
     *
     * @param flag 状态
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}