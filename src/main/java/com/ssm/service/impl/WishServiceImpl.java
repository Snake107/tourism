package com.ssm.service.impl;

import com.ssm.dao.mappingExt.TCollectionMapperExt;
import com.ssm.pojo.TCollection;
import com.ssm.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishServiceImpl implements WishService {

    @Autowired
    TCollectionMapperExt tCollectionMapperExt;

    @Override
    public List<TCollection> selectCollectionByUserId(Integer userId) {
        return tCollectionMapperExt.selectCollectionByUserId(userId);
    }

}
