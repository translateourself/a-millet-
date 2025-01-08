package com.milletmall.milletware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:08:14
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

