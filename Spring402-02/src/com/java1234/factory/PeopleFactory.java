package com.java1234.factory;

import com.java1234.entity.People;

public class PeopleFactory {
	public People createPeople(){
		People people=new People();
		people.setId(5);
		people.setName("ÏÂÆå");
		people.setAge(55);
		return people;
	}
}
