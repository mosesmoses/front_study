package com.moses.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/10/15.
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(context.getBeanDefinitionCount());
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String beanName:beanDefinitionNames){
            Object bean = context.getBean(beanName);
            System.out.println(beanName+": "+bean);
        }
        User user = (User)context.getBean("user");
        user.view();




    }
}
