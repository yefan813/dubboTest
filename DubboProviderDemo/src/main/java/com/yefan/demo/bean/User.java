package com.yefan.demo.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4521566808509891446L;
	private String name;
	private Integer age;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
