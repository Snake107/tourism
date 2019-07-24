package com.ssm.service;

import com.ssm.pojo.TCollection;

import java.util.List;

public interface WishService {
    /**
     * 根据 用户ID 查询已收藏的商品
     * @return
     */
    List<TCollection> selectCollectionByUserId(Integer userId);
}
