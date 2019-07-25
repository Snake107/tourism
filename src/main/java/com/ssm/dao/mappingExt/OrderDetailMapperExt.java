package com.ssm.dao.mappingExt;

import com.ssm.dto.order.OrderDetailDto;
import com.ssm.pojo.OrderDetail;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderDetailMapperExt extends Mapper<OrderDetail> {

    /**
     * 添加订单详情
     * @param orderDetailDtos
     * @return
     */
    Integer addOrderDetail(List<OrderDetailDto> orderDetailDtos);
}