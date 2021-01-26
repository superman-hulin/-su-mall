package com.su.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.su.common.utils.PageUtils;
import com.su.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author su
 * @email 2434275659@qq.com
 * @date 2021-01-21 09:52:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

