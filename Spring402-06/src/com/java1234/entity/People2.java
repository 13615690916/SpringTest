package com.java1234.entity;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class People2 implements MethodReplacer {
	private int id;
	private String name;
	private int age;
	private Dog dog; // =new Dog(); 级联属性需要创建一个对象

	public People2(int id, String name, int age, Dog dog) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
	
	public People2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog getDog() {
		Dog dog=new Dog();
		dog.setName("vbb");
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age
				+ ", dog=" + dog.getName() + "]";
	}

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		Dog dog=new Dog();
		dog.setName("vbb");
		return dog;
	}

}
