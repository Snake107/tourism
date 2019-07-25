package com.ssm.service.impl;

import com.ssm.dao.mappingExt.OrderDetailMapperExt;
import com.ssm.dao.mappingExt.OrderMapperExt;
import com.ssm.dto.order.OrderDetailDto;
import com.ssm.dto.order.OrderDto;
import com.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/24 20:37
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapperExt orderMapperExt;

    @Autowired
    OrderDetailMapperExt orderDetailMapperExt;

    @Override
    public Integer addOrder(OrderDto orderDto) {
        Integer rSet = orderMapperExt.addOrder(orderDto);
        if (rSet>0){
         return orderDto.getId();
        }
        return 0;
    }

    @Override
    public boolean addOrderDetail(List<OrderDetailDto> orderDetailDtos) {
        Integer rSet = orderDetailMapperExt.addOrderDetail(orderDetailDtos);
        if (rSet>0){
            return true;
        }
        return false;
    }
}
