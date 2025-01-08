package com.milletmall.milletcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletcoupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:25:10
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

