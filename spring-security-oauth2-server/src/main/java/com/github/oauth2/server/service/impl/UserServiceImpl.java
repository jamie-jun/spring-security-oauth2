package com.github.oauth2.server.service.impl;

import com.github.oauth2.server.domain.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.github.oauth2.server.mapper.UserMapper;
import com.github.oauth2.server.service.UserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getByUserName(String username) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",username);
        return userMapper.selectOneByExample(example);
    }
}
