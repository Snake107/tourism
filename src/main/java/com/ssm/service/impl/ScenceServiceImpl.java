package com.ssm.service.impl;


import com.ssm.dao.mappingExt.ScenceMapperExt;
import com.ssm.dto.ScenceNaviParameter;
import com.ssm.pojo.ext.ScenceExt;
import com.ssm.service.ScenceService;
import com.ssm.vo.ScenceNavi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
