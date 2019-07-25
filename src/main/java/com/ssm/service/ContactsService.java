package com.ssm.service;

import com.ssm.pojo.Contact;

public interface ContactsService {
    /**
     * 反馈插入数据库
     * @param contact
     */
    void addContact(Contact contact);
}
