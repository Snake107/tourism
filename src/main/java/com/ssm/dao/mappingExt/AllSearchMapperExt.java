package com.ssm.dao.mappingExt;


import com.ssm.dto.allsearch.SearchDto;
import com.ssm.vo.SearchVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllSearchMapperExt {


    List<SearchDto> SearchAll(SearchVo searchVo);

    void ScenceViewsAddOne(Integer commodityId);

    void HotelViewsAddOne(Integer commodityId);

    void RestaurantViewsAddOne(Integer commodityId);
}
