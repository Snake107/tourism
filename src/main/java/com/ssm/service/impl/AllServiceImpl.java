package com.ssm.service.impl;

import com.ssm.dao.mappingExt.AllSearchMapperExt;
import com.ssm.dto.allsearch.SearchDto;
import com.ssm.service.AllService;
import com.ssm.vo.SearchVo;
import com.ssm.vo.ViewsVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AllServiceImpl implements AllService {


    @Resource
    AllSearchMapperExt allSearchMapperExt;

    @Override
    public List<SearchDto> searchAll(SearchVo searchVo) {
        return allSearchMapperExt.SearchAll(searchVo);
    }

    @Override
    public void viewsAddOne(ViewsVo viewsVo) {
        String bigType = viewsVo.getBigType();
        Integer commodityId = Integer.valueOf(viewsVo.getCommodityId());
        //景点
        if ("1".equals(bigType)){
            allSearchMapperExt.ScenceViewsAddOne(commodityId);
        }
        //酒店
        if ("2".equals(bigType)){
            allSearchMapperExt.HotelViewsAddOne(commodityId);
        }
        //餐厅
        if ("3".equals(bigType)){
            allSearchMapperExt.RestaurantViewsAddOne(commodityId);
        }
    }
}
