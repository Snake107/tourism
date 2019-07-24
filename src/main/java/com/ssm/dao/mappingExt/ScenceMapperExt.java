package com.ssm.dao.mappingExt;

import com.ssm.pojo.ext.ScenceExt;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ScenceMapperExt extends Mapper<ScenceExt> {

    /**
     * 首页   查询评分高的前6个景点
     * @return
     */
    List<ScenceExt> selectIndexSixScenceInfo();

}
