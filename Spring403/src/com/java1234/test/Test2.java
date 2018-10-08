package com.java1234.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java1234.Impl.StudentServiceImpl;

public class Test2 {

	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("beans.xml");
	}

	// 基本类型值
	@Test
	public void test() {
		StudentServiceImpl student = (StudentServiceImpl) ac
				.getBean("studentService");
		student.AddStudent("张三");
	}

}
