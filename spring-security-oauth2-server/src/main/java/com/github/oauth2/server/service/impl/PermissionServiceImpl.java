package com.github.oauth2.server.service.impl;

import com.github.oauth2.server.domain.Permission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.github.oauth2.server.mapper.PermissionMapper;
import com.github.oauth2.server.service.PermissionService;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService{

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> selectByUserId(Long userId) {
        return permissionMapper.selectByUserId(userId);
    }
}
