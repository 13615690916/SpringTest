package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController {

	private static List<Person> personList=new ArrayList<Person>();
	
	static{
		personList.add(new Person(1,"aa",1));
		personList.add(new Person(2,"bb",2));
		personList.add(new Person(3,"cc",3));
	}
	
	@RequestMapping("/list")
	public ModelAndView getList(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("personList", personList);
		mav.setViewName("person/list");
		
		return mav;
	}
	
	@RequestMapping("/input")
	public ModelAndView input(@RequestParam(value="id",required=false) String id){
		ModelAndView mav=new ModelAndView();
		//ÐÞ¸Ä
		if (id!=null) {
			mav.addObject("person", personList.get(Integer.parseInt(id)-1));
			mav.setViewName("person/input");
		}
		//Ìí¼Ó
		else {
			mav.setViewName("person/input");
		}
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Person person){
		//ÐÞ¸Ä
		if (person.getId()!=0) {
			Person p=personList.get(person.getId()-1);
			p.setAge(p.getAge());
			p.setName(p.getName());
		}
		else {
			personList.add(person);
		}
		return "redirect:/person/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id") int id){
		personList.remove(id);
		return "redirect:/person/list.do";
	}
}
