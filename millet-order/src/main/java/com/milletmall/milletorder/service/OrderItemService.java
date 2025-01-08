package com.milletmall.milletorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletorder.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:04:11
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

