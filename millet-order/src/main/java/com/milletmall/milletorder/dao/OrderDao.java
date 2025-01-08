package com.milletmall.milletorder.dao;

import com.milletmall.milletorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:04:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}