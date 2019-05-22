package com.lzhui.crowdfunding.exception;



public class LoginFailExecption extends RuntimeException {
/*
* 雷区：！！属性message不能乱取名，否则会报javax.el.PropertyNotFoundException: Property [meg] not found on type
*
* */
    public LoginFailExecption(String message){
      super(message);
    }
}
