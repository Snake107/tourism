package com.ssm.dao.mappingExt;


import com.ssm.dto.ScenceNaviParameter;
import com.ssm.pojo.ext.ScenceExt;
import com.ssm.vo.ScenceNavi;

import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 19:57
 * @description：
 * @modified By：
 */
public interface ScenceMapperExt {

    /**
     * 获取首页的头部图片
     * @param scenceNaviParameter  查询城市所需参数
     * @return
     */
    List<ScenceNavi> getScenceNavi(ScenceNaviParameter scenceNaviParameter);
  /**
     * 首页   查询评分高的前6个景点
     * @return
     */
    List<ScenceExt> selectIndexSixScenceInfo();

}
