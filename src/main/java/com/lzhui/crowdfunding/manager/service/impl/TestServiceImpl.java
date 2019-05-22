package com.lzhui.crowdfunding.manager.service.impl;

import com.lzhui.crowdfunding.manager.dao.TestDao;
import com.lzhui.crowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class TestServiceImpl implements TestService {
//    Autowired如何进行依赖注入的
/*   根据ByType进行类别查找
如果查到一个，则直接注入。
如果找到多个：
            根据byName进行注入，将多个对象中名称一致的那个bean注入，
            如果多个对象名称没有与变量名称一致的：可以指定@Qualifier(value="")，将其中一个注入进来
            否则报错，
 */

    /*
    * AOP原理：动态代理
    * 如果目标对象有接口，则采用JDK动态代理（基于接口（代理类和目标类实现共同的接口））。
    * 如果目标对象没有接口，则采用Cglib动态代理（基于继承（代理类是目标类的子类））。
    * 推荐JDK代理，也就是面向接口编程
    * */



    @Autowired
    private TestDao testDao;
    @Override//用来检查继承的，作用域不能缩小，异常域不能扩大
    public void insert() {
        Map map=new HashMap();
        map.put("name","张三");
        testDao.insert(map);
    }
}