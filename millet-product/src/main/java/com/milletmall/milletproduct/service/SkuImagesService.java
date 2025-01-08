package com.milletmall.milletproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 16:12:53
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

