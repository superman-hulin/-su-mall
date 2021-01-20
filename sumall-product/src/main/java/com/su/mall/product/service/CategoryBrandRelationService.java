package com.su.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-20 20:40:59
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

