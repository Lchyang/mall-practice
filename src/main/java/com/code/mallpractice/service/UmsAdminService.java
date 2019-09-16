package com.code.mallpractice.service;

import com.code.mallpractice.mbg.model.UmsAdmin;
import com.code.mallpractice.mbg.model.UmsPermission;

import java.util.List;

public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return jwt token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限(角色权限+-权限)
     */
    List<UmsPermission> getPermissionList(Long adminId);
}

