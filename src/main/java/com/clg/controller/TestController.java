package com.clg.controller;

import com.clg.entity.AddUserDefinedVo;
import com.clg.entity.JsonResult;
import com.clg.entity.UserStatis;
import com.clg.entity.UserStatisResp;
import com.clg.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public JsonResult<List> test(String string) {
        UserStatis userStatis = new UserStatis();
        userStatis.setId("123");
        UserStatisResp userStatisResp = new UserStatisResp();
        userStatisResp.setUser_statis(userStatis);
        System.out.println(JsonResult.ok(userStatisResp).toString());
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        return JsonResult.ok(list);
    }

    @RequestMapping("/beanTest")
    public void beanTest() {
        testService.run();
    }

    @RequestMapping("/List")
    public String beanTest(AddUserDefinedVo vo) {
        try {
            return vo.getQueryItem().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "nonono";
    }

    @GetMapping("/getUserDefineItem")
    public String getUserDefineItem(String id){
        return testService.getUserDefineItem(id);
    }
    @GetMapping("/getData")
    public String getUserDefineItem(String table,String id){
        return testService.getUserDefineItem(table,id);
    }
    @GetMapping("/getDataSelective")
    public String getUserDefineItemSelective(String userId,String id){
        return testService.getUserDefineItemSelective(userId,id);
    }


}
