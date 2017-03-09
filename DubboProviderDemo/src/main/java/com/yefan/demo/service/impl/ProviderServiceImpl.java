package com.yefan.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.yefan.demo.bean.User;
import com.yefan.demo.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("ÄÐ");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("Å®");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("Å®");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

}
