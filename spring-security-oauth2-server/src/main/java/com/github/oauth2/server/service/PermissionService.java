package com.github.oauth2.server.service;

import com.github.oauth2.server.domain.Permission;

import java.util.List;

public interface PermissionService{

    List<Permission> selectByUserId(Long userId);

}
