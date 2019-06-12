package com.clg.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @Author cailiugen
 * @Date 2019/4/30
 */
@Configuration
public class ConfigChangeListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent str) {
        System.out.println(str.toString());
    }
}
