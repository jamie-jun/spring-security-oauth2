package com.github.oauth2.resource.service.impl;

import com.github.oauth2.resource.domain.Content;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.github.oauth2.resource.mapper.ContentMapper;
import com.github.oauth2.resource.service.ContentService;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService{

    @Resource
    private ContentMapper contentMapper;

    @Override
    public List<Content> selectAll() {
        return contentMapper.selectAll();
    }
}
