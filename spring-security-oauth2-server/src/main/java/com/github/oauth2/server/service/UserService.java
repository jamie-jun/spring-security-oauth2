package com.github.oauth2.server.service;

import com.github.oauth2.server.domain.User;

public interface UserService{

    User getByUserName(String username);

}
