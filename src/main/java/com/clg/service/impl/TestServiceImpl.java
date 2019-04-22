package com.clg.service.impl;

import com.clg.entity.LombokTestEntity;
import com.clg.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    @Resource(name = "LombokTestEntity")
    private LombokTestEntity LombokTestEntity;
    @Autowired
    @Resource(name = "lombokTestEntity")
    private LombokTestEntity lombokTestEntity;

    @Override
    public int run() {
        System.out.println(lombokTestEntity.getPassWord());
        System.out.println(LombokTestEntity.getPassWord());
        return LombokTestEntity.getPassWord();
    }
}
