package com.ssm.dao.mappingExt;

import com.ssm.dto.description.GoodsDescription;
import com.ssm.vo.GoodsDataVo;

public interface DescriptionDao {


    GoodsDescription GoodsDescription(GoodsDataVo goodsDataVo);
}
