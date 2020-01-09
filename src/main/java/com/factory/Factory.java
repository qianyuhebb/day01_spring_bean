package com.factory;

import com.service.impl.AccountServiceImpl;

public class Factory {


    //普通工厂
   /* public Object getAccountService(){

        return  new AccountServiceImpl();
    }*/
    public static Object getAccountService(){

        return  new AccountServiceImpl();
    }
}
