package com.github.oauth2.server.config.service;

import com.github.oauth2.server.domain.Permission;
import com.github.oauth2.server.domain.User;
import com.github.oauth2.server.service.PermissionService;
import com.github.oauth2.server.service.UserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-security-oauth2
 * @description:
 * @author: Jamie
 * @create: 2019-05-14 11:34
 **/

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByUserName(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if(user != null){
            List<Permission> permissions = permissionService.selectByUserId(user.getId());
            permissions.forEach(permission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),grantedAuthorities);
    }
}
