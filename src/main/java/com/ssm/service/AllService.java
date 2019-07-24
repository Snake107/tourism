package com.ssm.service;

import com.ssm.dto.allsearch.SearchDto;
import com.ssm.vo.SearchVo;
import com.ssm.vo.ViewsVo;

import java.util.List;

public interface AllService {


    List<SearchDto> searchAll(SearchVo searchVo);

    /**
     * 浏览量+1
     * @param viewsVo
     */
    void viewsAddOne(ViewsVo viewsVo);
}
