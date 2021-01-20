package com.su.mall.product.dao;

import com.su.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-20 20:40:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
