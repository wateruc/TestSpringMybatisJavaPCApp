package com.waterpc.test.TestSpringMybatisJavaPCApp;

import java.net.Socket;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.waterpc.test.TestSpringMybatisJavaPCApp.entity.UsersInforEntity;
import com.waterpc.test.TestSpringMybatisJavaPCApp.service.UsersInforEntityService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/waterpc/test/TestSpringMybatisJavaPCApp/applicationContext.xml");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersInforEntityService userInfoService=ctx.getBean(UsersInforEntityService.class);
        UsersInforEntity userInfo=userInfoService.getOneUserInfor(1l);
        System.out.println(userInfo.getName());
        
        //ProxyFactory proxyFactory = new ProxyFactory();
        //Socket socket;
    }
}
