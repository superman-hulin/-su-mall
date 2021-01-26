package com.su.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-21 09:45:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

