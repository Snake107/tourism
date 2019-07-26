package com.ssm.service;

import com.ssm.dto.vip.VipDto;
import com.ssm.pojo.Vip;
import com.ssm.pojo.VipMeal;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/25 15:09
 */
public interface VipService {
    /**
     * 获取vip充值菜单
     * @return
     */
    List<VipMeal> getVipMeal();

    /**
     * 根据ID获取对应菜单
     * @return
     */
    VipMeal getVipMealById(Integer id);

    /**
     * 添加Vip信息
     * @param vipDto
     * @return
     */
    Integer addVip(VipDto vipDto);
}
