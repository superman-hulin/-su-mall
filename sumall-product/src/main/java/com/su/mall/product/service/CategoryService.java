package com.su.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-20 20:40:59
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

