package com.milletmall.milletmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:41:35
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

