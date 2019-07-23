package com.ssm.service.impl;

import com.ssm.dao.mappingExt.AllSearchMapperExt;
import com.ssm.dto.allsearch.SearchDto;
import com.ssm.service.AllService;
import com.ssm.vo.SearchVo;
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
}
