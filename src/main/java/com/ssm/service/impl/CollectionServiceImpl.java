package com.ssm.service.impl;

import com.ssm.dao.mappingExt.TCollectionMapperExt;
import com.ssm.dto.wish.CollectionDto;
import com.ssm.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 10:56
 */
@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    TCollectionMapperExt collectionMapperExt;

    @Override
    public CollectionDto getCollectionById(Integer userid) {
        return collectionMapperExt.getCollectionById(userid);
    }

    @Override
    public Integer addCollection(CollectionDto collectionDto) {
        return collectionMapperExt.addCollection(collectionDto);
    }

    @Override
    public Integer delCollection(Integer id) {
        return collectionMapperExt.delCollection(id);
    }
}
