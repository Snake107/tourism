package com.ssm.service;

import com.ssm.dto.description.GoodsDescription;
import com.ssm.vo.GoodsDataVo;
import org.apache.ibatis.annotations.Param;

public interface DescriptionService {


    GoodsDescription GoodsDescription(GoodsDataVo goodsDataVo);
}
