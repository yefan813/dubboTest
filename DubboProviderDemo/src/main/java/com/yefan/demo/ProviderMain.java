package com.yefan.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {
	 public static void main(String[] args) throws Exception {  
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config-dubbo-provider.xml"});  
	        context.start();  
	   
	        System.in.read(); // Ϊ��֤����һֱ���ţ�������������������ģ��  
	    }  
}
