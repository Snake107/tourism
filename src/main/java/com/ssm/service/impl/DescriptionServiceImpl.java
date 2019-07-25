package com.ssm.service.impl;

import com.ssm.dao.mappingExt.DescriptionDao;
import com.ssm.dto.description.GoodsDescription;
import com.ssm.service.DescriptionService;
import com.ssm.vo.GoodsDataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class DescriptionServiceImpl implements DescriptionService {



    @Autowired
    DescriptionDao descriptionDao;


    @Override
    public GoodsDescription GoodsDescription( GoodsDataVo goodsDataVo) {
        return descriptionDao.GoodsDescription(goodsDataVo);
    }
}
