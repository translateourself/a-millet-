package com.milletmall.milletmember.controller;

import java.util.Arrays;
import java.util.Map;

import com.milletmall.milletmember.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.milletmall.milletmember.entity.MemberEntity;
import com.milletmall.milletmember.service.MemberService;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.common.utils.R;



/**
 * 会员
 *
 * @author XXn
 * @email xuxunnen@gmail.com
 * @date 2025-01-08 22:41:35
 */
@RestController
@RequestMapping("milletmember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/getAllInformation")
    public R getAllInformation(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("xxn");
        R coupon = couponFeignService.GetAllMembersMock();
        return R.ok().put("coupon", coupon.get("coupon") ).put("member",memberEntity);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
