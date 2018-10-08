package com.java1234.test;

import com.java1234.service.JavaWork;
import com.java1234.service.ZhangSan;

public class Test {
	public static void main(String[] args) {
		
		JavaWork javaWork=new JavaWork();
		javaWork.setTester(new ZhangSan());
		javaWork.doTest();
	}
}
