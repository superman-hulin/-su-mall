package com.su.mall.order.dao;

import com.su.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-21 09:45:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
