package com.java1234.advice;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Before;

public class StudentServiceAspect {
	
	
	public void doBefore(){
		System.out.println("开始添加学生");
	}
}
