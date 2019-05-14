package com.github.oauth2.resource.controller;

import com.github.oauth2.resource.domain.Content;
import com.github.oauth2.resource.dto.ResponseResult;
import com.github.oauth2.resource.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: spring-security-oauth2
 * @description:
 * @author: Jamie
 * @create: 2019-05-14 15:19
 **/

@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/")
    public ResponseResult<List<Content>> list(){
        return  new ResponseResult(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),contentService.selectAll());
    }
}
