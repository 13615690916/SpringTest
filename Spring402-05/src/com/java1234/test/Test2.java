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
		People people = (People) ac.getBean("people1");
		People people2 = (People) ac.getBean("people1");
		System.out.println(people);
		System.out.println(people.getDog()==people2.getDog());
		System.out.println(ac.getBean("dog")==ac.getBean("dog"));
	}
	
	
}
