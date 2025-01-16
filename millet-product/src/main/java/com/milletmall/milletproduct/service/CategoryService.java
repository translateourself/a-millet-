package com.milletmall.milletproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.common.utils.R;
import com.milletmall.milletproduct.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 16:12:53
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    List<CategoryEntity> listWithTree();
}

