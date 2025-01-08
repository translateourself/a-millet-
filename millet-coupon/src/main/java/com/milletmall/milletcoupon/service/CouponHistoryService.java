package com.milletmall.milletcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletcoupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:25:10
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

