package com.milletmall.milletmember.dao;

import com.milletmall.milletmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:41:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
