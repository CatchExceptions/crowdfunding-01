package com.lzhui.crowdfunding.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//这个监听器功能：服务器启动将上下文路径放到APP_PATH里
public class StartSystemListener implements ServletContextListener {
//    在服务器启动时，创建application对象时需要执行的方法。
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        将项目上下文路径（request.getContextPath）放置到application域中
        ServletContext application=sce.getServletContext();//拿域
       String contextPath= application.getContextPath();//拿路径
        application.setAttribute("APP_PATH",contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
