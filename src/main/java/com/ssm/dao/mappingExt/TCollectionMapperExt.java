package com.ssm.dao.mappingExt;

import com.ssm.dto.wish.CollectionDto;
import com.ssm.pojo.TCollection;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 10:22
 */

@Repository
public interface TCollectionMapperExt extends Mapper<TCollection> {

    /**
     * 首页 根据 用户ID 查询已收藏的商品
     * @return
     */
    List<TCollection> selectCollectionByUserId(Integer userId);
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
