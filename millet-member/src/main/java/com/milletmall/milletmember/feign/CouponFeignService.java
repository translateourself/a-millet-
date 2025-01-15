package com.milletmall.milletmember.feign;

import com.milletmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xuxunne
 * @description:
 * @since 2025/1/9 19:50
 */
@FeignClient("millet-coupon")
public interface CouponFeignService {

    @RequestMapping("/milletcoupon/coupon/member/all")
    public R GetAllMembersMock();
}
