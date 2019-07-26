package com.ssm.dao.mappingExt;

import com.ssm.dto.vip.VipDto;
import com.ssm.pojo.Vip;
import tk.mybatis.mapper.common.Mapper;

public interface VipMapperExt extends Mapper<Vip> {
    /**
     * 添加VIp信息
     * @param vipDto
     * @return
     */
    Integer addVip(VipDto vipDto);
}