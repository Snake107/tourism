package com.ssm.service;


import com.ssm.pojo.ext.ScenceExt;

import java.util.List;

/**
 * author:QI
 */


public interface ScenceService {

    /**
     * 首页   查询评分高的前6个景点
     * @return
     */
    List<ScenceExt> selectIndexSixScenceInfo();

}
