package com.su.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-20 20:40:59
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

