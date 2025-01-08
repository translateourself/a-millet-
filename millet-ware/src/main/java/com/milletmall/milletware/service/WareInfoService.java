package com.milletmall.milletware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.milletware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 23:08:14
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

