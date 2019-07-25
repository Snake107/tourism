package com.ssm.service;

import com.ssm.dto.order.OrderDetailDto;
import com.ssm.dto.order.OrderDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/24 20:37
 */
public interface OrderService {
    /**
     * 添加订单并获取订单ID
     * @param orderDto
     * @return
     */
    Integer addOrder(OrderDto orderDto);

    /**
     * 添加订单详情
     * @param orderDetailDtos
     * @return
     */
    boolean addOrderDetail(@Param("list")List<OrderDetailDto> orderDetailDtos);
}
