package com.milletmall.milletorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:04:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

