package com.milletmall.milletproduct.dao;

import com.milletmall.milletproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 16:12:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
