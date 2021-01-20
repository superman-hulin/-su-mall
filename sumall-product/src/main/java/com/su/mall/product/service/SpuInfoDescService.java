package com.su.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-20 20:40:59
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

