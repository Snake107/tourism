package com.ssm.service.impl;

import com.ssm.dao.mappingExt.UserMapperExt;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: FatCao
 * @Date: 2019-07-22 22:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapperExt userMapperExt;

    @Override
    public boolean addUser(User user ) {
        int rSet = userMapperExt.addUser(user);
        if (rSet > 0){
             return true;
        }
        return false;
    }
}
