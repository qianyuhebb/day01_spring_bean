package com.controller;


import com.dao.AccountDao;
import com.factory.BeanFactory;
import com.service.AccountService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {


    /**
     *   获取IOC容器 ，
     *   根据id 获取bean
     * @param args
     */
    public static void main(String[] args) {
            //立即加载的方式     单例情况下使用      更多的使用这种情况
//        ApplicationContext  ac =new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext  ac =new ClassPathXmlApplicationContext("bean.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        AccountService as2 = (AccountService) ac.getBean("accountService");
//        AccountDao as2 = ac.getBean("accountDao", AccountDao.class);

        System.out.println(as);
       System.out.println(as2);
        as.saveAccout();
        //手动关闭容器   多例对象即使手动关闭也不执行destroy方法  因为多例对象是懒加载，单例对象是立即加载
        ac.close();
//        as2.saveAccount();
    }

}
