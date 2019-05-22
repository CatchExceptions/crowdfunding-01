package com.lzhui.crowdfunding.controller;

import com.lzhui.crowdfunding.bean.User;
import com.lzhui.crowdfunding.manager.service.UserService;
import com.lzhui.crowdfunding.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DispatcherController {
    @Autowired
    private UserService userService;

//    首页面跳转
    @RequestMapping("/toindex")
    public String index()
    {
        return "toindes";
    }
//    登录
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
//    注册
    @RequestMapping("/reg")
    public String reg()
    {
        return "reg";
    }
//    管理员控制界面
    @RequestMapping("/main")
    public String main()
    {
        return "main";
    }
//    用户维护
@RequestMapping("/user")
public String user()
{
    return "user";
}

@RequestMapping("/dologin")
public  String dologin(String loginacct , String userpswd, String type, HttpSession session){
    System.out.println("=============进来了=====================");
    Map<String,Object> paramMap=new HashMap();
    paramMap.put("loginacct",loginacct);
    paramMap.put("userpswd",userpswd);
    paramMap.put("type",type);
    User tUser=userService.querylogin(paramMap);
    session.setAttribute(Const.LOGIN_USER,tUser);
        return "redirect:/main.htm";//为什么用redirect重定向不直接用main
    /*
    * 直接用main是转发，如果刷新页面则会出现重复提交表单。重定向则不会重复提交表单，只是刷新页面
    * */
}

}
