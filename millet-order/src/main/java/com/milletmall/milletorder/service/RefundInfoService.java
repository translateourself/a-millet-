package com.milletmall.milletorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:04:11
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

