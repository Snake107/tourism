package com.ssm.service;

import com.ssm.dto.ScenceNaviParameter;
import com.ssm.vo.ScenceNavi;

import com.ssm.pojo.ext.ScenceExt;

import java.util.List;

import com.ssm.dto.scence.ScenceDto;
import com.ssm.pojo.Tags;
import com.ssm.vo.SearchVo;




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



    List<ScenceDto> getAttractions();

    List<ScenceDto> TravelSearch(SearchVo searchVo);


    List<Tags> getLabel();
}
