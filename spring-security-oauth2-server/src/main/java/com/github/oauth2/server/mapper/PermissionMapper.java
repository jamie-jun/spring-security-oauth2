package com.github.oauth2.server.mapper;

import com.github.oauth2.server.domain.Permission;
import mybatis.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper extends MyMapper<Permission> {
    List<Permission> selectByUserId(@Param("userId") Long userId);
    Permission selectById(@Param("id")Long id);


}
