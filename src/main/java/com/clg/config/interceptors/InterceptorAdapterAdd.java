package com.clg.config.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author cailiugen
 * @Date 2019/4/30
 */
@Configuration
public class InterceptorAdapterAdd extends WebMvcConfigurerAdapter {

    @Autowired
    private TestHandlerInterceptor testHandlerInterceptor;

    @Autowired
    private InitHandlerInterceptor initHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(testHandlerInterceptor).addPathPatterns("/test/**");
        registry.addInterceptor(initHandlerInterceptor).addPathPatterns("/**").excludePathPatterns("/other/**");

    }


}
