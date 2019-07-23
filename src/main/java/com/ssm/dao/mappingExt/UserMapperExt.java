package com.ssm.dao.mappingExt;

import com.ssm.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapperExt extends Mapper<User> {
    /**
     * 添加用户
     * @param user  用户信息对象
     * @return      影响行数
     */
    Integer addUser(User user);

    /**
     * 检查用户名
     * @param user  用户信息对象
     * @return      用户信息集合
     */
    //List<User> checkUsername(User  user) ;
}