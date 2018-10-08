package com.java1234.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		People people1 = (People) ac.getBean("zhangsan");
		People people2 = (People) ac.getBean("lisi");
		System.out.println(people1);
		System.out.println(people2);
	}
	
	
}
