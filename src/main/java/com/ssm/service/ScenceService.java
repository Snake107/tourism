package com.ssm.service;

import com.ssm.dto.ScenceNaviParameter;
import com.ssm.vo.ScenceNavi;

import com.ssm.pojo.ext.ScenceExt;

import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 20:40
 * @description：
 * @modified By：
 */
public interface ScenceService {
    List<ScenceNavi> getScenceNavi(ScenceNaviParameter scenceNaviParameter);
    /**
     * 首页   查询评分高的前6个景点
     * @return
     */
    List<ScenceExt> selectIndexSixScenceInfo();

}
