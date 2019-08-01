package com.clg.service.impl;

import com.clg.entity.LombokTestEntity;
import com.clg.mapper.UserDefineItemMapper;
import com.clg.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private LombokTestEntity LombokTestEntity;
    @Autowired
    private LombokTestEntity lombokTestEntity;
    @Autowired
    private UserDefineItemMapper userDefineItemMapper;

    @Override
    public int run() {
        System.out.println(lombokTestEntity.getPassWord());
        System.out.println(LombokTestEntity.getPassWord());
        return LombokTestEntity.getPassWord();
    }

    @Override
    public String getUserDefineItem(String id) {
        return userDefineItemMapper.selectById(id).toString();
    }

    @Override
    public String getUserDefineItem(String table, String id) {
        return userDefineItemMapper.select(table, id).toString();
    }

    @Override
    public String getUserDefineItemSelective(String userId, String id) {
        return userDefineItemMapper.selective(userId, id).toString();
    }
}
