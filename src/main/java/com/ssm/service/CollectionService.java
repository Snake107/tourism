package com.ssm.service;

import com.ssm.dto.wish.CollectionDto;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 10:55
 */
public interface CollectionService {

    /**
     * 获取心愿单BYid
     * @param userid
     * @return
     */
    CollectionDto getCollectionById(Integer userid);


    /**
     * 添加到心愿单
     * @param collectionDto 目标ID
     * @return
     */
    Integer addCollection(CollectionDto collectionDto);

    /**
     * 删除心愿目标
     * @param id
     * @return
     */
    Integer delCollection(Integer id);
}
