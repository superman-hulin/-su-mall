package com.su.mall.member.feign;

import com.su.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("sumall-coupon") //指明调用的远程服务名称
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list") //请求路径需要写全
    public R membercoupons();

}
