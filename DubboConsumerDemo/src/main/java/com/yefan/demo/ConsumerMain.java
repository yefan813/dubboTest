package com.yefan.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yefan.demo.bean.User;
import com.yefan.demo.service.ProviderService;

public class ConsumerMain {
	 public static void main(String[] args) throws Exception {  
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
	                new String[] { "spring-config-dubbo-consumer.xml" });  
	        context.start();  
	  
	        ProviderService demoService = (ProviderService) context.getBean("demoService"); //  
	        String hello = demoService.sayHello("tom"); //
	        System.out.println(hello); //   
	  
	        //   
	        List<User> list = demoService.getUsers();  
	        if (list != null && list.size() > 0) {  
	            for (int i = 0; i < list.size(); i++) {  
	                System.out.println(list.get(i));  
	            }  
	        }  
	        // System.out.println(demoService.hehe());  
	        System.in.read();  
	    }  
}
