package com.milletmall.milletproduct.dao;

import com.milletmall.milletproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 16:12:53
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
