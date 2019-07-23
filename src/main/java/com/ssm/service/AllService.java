package com.ssm.service;

import com.ssm.dto.allsearch.SearchDto;
import com.ssm.vo.SearchVo;

import java.util.List;

public interface AllService {


    List<SearchDto> searchAll(SearchVo searchVo);
}
