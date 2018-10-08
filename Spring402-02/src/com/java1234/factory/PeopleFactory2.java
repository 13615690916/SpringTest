package com.java1234.factory;

import com.java1234.entity.People;

public class PeopleFactory2 {
	public static People createPeople(){
		People people=new People();
		people.setId(7);
		people.setName("xx");
		people.setAge(77);
		return people;
	}
}
