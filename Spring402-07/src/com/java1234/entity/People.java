package com.java1234.entity;

public class People {
	private int id;
	private String name;
	private int age;
	private String className;
	private Dog dog;
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
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
	public People() {
		super();
		System.out.println("≥ı ºªØpeople");
	}
	public People(int id, String name, int age, String className) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
	}
	public People(int id, String name, int age, String className, Dog dog) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age
				+ ", className=" + className + ", dog=" + dog.getName() + "]";
	}

	


}
