package com.code.mallpractice.service;

import com.code.mallpractice.common.api.CommonResult;

public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 验证验证码和手机号是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
