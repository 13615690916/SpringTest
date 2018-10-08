package com.java1234.service;

public class JavaWork {
	
	private Tester tester;
	
	
	public void setTester(Tester tester) {
		this.tester = tester;
	}


	public void doTest(){
		tester.test();
	}
}
