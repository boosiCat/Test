package com.clg.controller;

import com.clg.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.SortedMap;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test(String string){
        return "hello world"+string;
    }
    @RequestMapping("/beanTest")
    public void beanTest(String url, HttpServletRequest request, HttpServletResponse response){
        try {
            response.sendRedirect(url+"?string=111");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
