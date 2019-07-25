package com.ssm.dao.mappingExt;

import com.ssm.dto.order.OrderDetailDto;
import com.ssm.dto.order.OrderDto;
import com.ssm.pojo.Order;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderMapperExt extends Mapper<Order> {

    /**
     * 添加订单
     * @param orderDto
     * @return
     */
    Integer addOrder(OrderDto orderDto);


}