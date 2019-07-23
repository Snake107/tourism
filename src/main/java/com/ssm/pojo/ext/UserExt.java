package com.ssm.pojo.ext;

import com.ssm.pojo.User;

/**
 * @Author: FatCao
 * @Date: 2019-07-23 18:01
 */
public class UserExt extends User {
    private String remember;

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    @Override
    public String toString() {
        return "UserExt{" +
                "remember='" + remember + '\'' +
                '}';
    }
}
