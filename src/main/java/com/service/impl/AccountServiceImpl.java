package com.service.impl;

import com.dao.AccountDao;
import com.factory.BeanFactory;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService {

      public  AccountServiceImpl(){
        System.out.println("使用了默认的构造函数");
    }

    public void saveAccout() {

        System.out.println("SERVICE 保存成功");



    } public void init() {

        System.out.println("init 执行");



    } public void destroy() {

        System.out.println("destroy执行");



    }
}
