package com.yefan.demo.service;

import java.util.List;

import com.yefan.demo.bean.User;

public interface ProviderService {
	public String sayHello(String name);
	public List<User> getUsers();  
}
