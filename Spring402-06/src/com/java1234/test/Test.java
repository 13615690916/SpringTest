package com.java1234.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java1234.entity.People;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		People p = (People) ac.getBean("people");
		People p2 = (People) ac.getBean("people2");
		People p3 = (People) ac.getBean("people3");
		People p4 = (People) ac.getBean("people4");
		People p6=(People)ac.getBean("people6");
		People p8=(People)ac.getBean("people8");
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p6.toString());
		System.out.println(p8.toString());
	}
}
