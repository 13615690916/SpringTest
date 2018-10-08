package com.java1234.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class People {
	private int id;
	private String name;
	private int age;
	private Dog dog;  //=new Dog(); 级联属性需要创建一个对象
	private List<String> hobbies=new ArrayList<String>();
	private Set<String> lovesSet=new HashSet<String>();
	private Map<String, String> works=new HashMap<String, String>();
	private Properties addresses=new Properties();
	
	
	public Properties getAddresses() {
		return addresses;
	}
	public void setAddresses(Properties addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getWorks() {
		return works;
	}
	public void setWorks(Map<String, String> works) {
		this.works = works;
	}
	public Set<String> getLovesSet() {
		return lovesSet;
	}
	public void setLovesSet(Set<String> lovesSet) {
		this.lovesSet = lovesSet;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public People(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public People() {
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
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age
				+ ", dog=" + dog.getName() + ", hobbies=" + hobbies + ", lovesSet="
				+ lovesSet + ", works=" + works + ", addresses=" + addresses
				+ "]";
	}
	
	
	
	
	
	

	
	
	
}
