package com.java1234.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java1234.entity.Dog;
import com.java1234.entity.People;

public class Test2 {

	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("beans.xml");
	}

	// 基本类型值
	@Test
	public void test() {
		Dog dog1 = (Dog) ac.getBean("dog");
		Dog dog2 = (Dog) ac.getBean("dog");
		System.out.println(dog1);
		System.out.println(dog2);
	}
	
	
}
