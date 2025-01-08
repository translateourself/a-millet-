package com.milletmall.milletware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:08:14
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

