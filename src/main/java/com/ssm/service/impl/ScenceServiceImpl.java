package com.ssm.service.impl;


import com.ssm.dao.mappingExt.ScenceMapperExt;
import com.ssm.dto.ScenceNaviParameter;
import com.ssm.pojo.ext.ScenceExt;
import com.ssm.service.ScenceService;
import com.ssm.vo.ScenceNavi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.ssm.dto.scence.ScenceDto;
import com.ssm.pojo.Tags;


import com.ssm.vo.SearchVo;


@Service
public class ScenceServiceImpl implements ScenceService {

    @Autowired
    ScenceMapperExt scenceMapperExt;

    @Override
    public List<ScenceExt> selectIndexSixScenceInfo() {
        return scenceMapperExt.selectIndexSixScenceInfo();
    }
    @Override
    public List<ScenceNavi> getScenceNavi(ScenceNaviParameter scenceNaviParameter) {
        return scenceMapperExt.getScenceNavi(scenceNaviParameter);
    }




    @Override
    public List<ScenceDto> getAttractions() {
        return scenceMapperExt.getAttractions();
    }

    @Override
    public List<ScenceDto> TravelSearch(SearchVo searchVo) {
        return scenceMapperExt.TravelSearch(searchVo);
    }

    @Override
    public List<Tags> getLabel() {
        return scenceMapperExt.getLabel();
    }
}
