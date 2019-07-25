package com.ssm.service.impl;

import com.ssm.dao.mapping.ContactMapper;
import com.ssm.pojo.Contact;
import com.ssm.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    ContactMapper contactMapper;

    @Override
    public void addContact(Contact contact) {
        contactMapper.insert(contact);
    }
}
