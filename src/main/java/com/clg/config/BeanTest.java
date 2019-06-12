package com.clg.config;

import com.clg.entity.LombokTestEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 小台
 * @Date 2019/4/2211:17
 */
@Configuration
public class BeanTest {

    public BeanTest(){
        System.out.println("============");
    }

    @Bean("lombokTestEntity")
    public LombokTestEntity initA(){
        LombokTestEntity  lombokTestEntity = new  LombokTestEntity();
        lombokTestEntity.setId(1).setPassWord(123);
        return lombokTestEntity;
    }
    @Bean("LombokTestEntity")
    public LombokTestEntity initB(){
        LombokTestEntity  LombokTestEntity = new  LombokTestEntity();
        LombokTestEntity.setId(1).setPassWord(321);
        return LombokTestEntity;
    }

}
