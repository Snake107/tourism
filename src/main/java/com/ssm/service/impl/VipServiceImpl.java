package com.ssm.service.impl;

import com.ssm.dao.mapping.VipMapper;
import com.ssm.dao.mapping.VipMealMapper;
import com.ssm.dao.mappingExt.VipMapperExt;
import com.ssm.dto.vip.VipDto;
import com.ssm.pojo.Vip;
import com.ssm.pojo.VipMeal;
import com.ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/25 15:10
 */
@Service
public class VipServiceImpl implements VipService {

    @Autowired
    VipMealMapper vipMealMapper;

    @Autowired
    VipMapperExt vipMapperExt;

    @Override
    public List<VipMeal> getVipMeal() {

        return vipMealMapper.selectAll();
    }

    @Override
    public VipMeal getVipMealById(Integer id) {
        return vipMealMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addVip(VipDto vipDto) {
        return vipMapperExt.addVip(vipDto);
    }
}
