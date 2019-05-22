package com.lzhui.crowdfunding.manager.controller;

import com.lzhui.crowdfunding.manager.service.TestService;
import com.lzhui.crowdfunding.manager.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private TestService testService;//必须为接口，依赖倒转原则（规范），低耦合
    @RequestMapping("/test")
    public String test(){
        System.out.println("TestController");
        testService.insert();
        return "success";
    }
}
