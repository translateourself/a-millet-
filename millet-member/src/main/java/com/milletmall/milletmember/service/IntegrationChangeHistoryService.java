package com.milletmall.milletmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletmember.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:41:35
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

