package com.github.oauth2;

import com.github.oauth2.server.domain.Permission;
import com.github.oauth2.server.mapper.PermissionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

/**
 * @program: spring-security-oauth2
 * @description:
 * @author: Jamie
 * @create: 2019-05-14 17:13
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {OAuth2ServerApplication.class})
public class PermissionServiceImplTest {

    @Resource
    private PermissionMapper permissionMapper;

    @Test
    public void testSelectByUserId() {
        List<Permission> permissions = permissionMapper.selectByUserId(37L);
        permissions.forEach(permission -> System.out.println(permission.getId()));
    }

}
