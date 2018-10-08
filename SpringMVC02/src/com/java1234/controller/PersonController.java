package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController {
	private static List<Person> personList=new ArrayList<Person>();
	
	static{
		personList.add(new Person(1,"張三1",11));
		personList.add(new Person(2,"李四2",12));
		personList.add(new Person(3,"王五3",13));
	}
	
	@RequestMapping("/list")
	public ModelAndView getList(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("personList", personList);
		mav.setViewName("person/list");
		return mav;
	}
	
	@RequestMapping("/preSave")
	public ModelAndView add(@RequestParam(value="id",required=false) String id) {
		ModelAndView mav=new ModelAndView();
		//修改
		if (id!=null) {
			mav.addObject("person",personList.get(Integer.parseInt(id)-1));
			mav.setViewName("person/update");
		}
		else{
			mav.setViewName("person/add");
		}
		return mav;
	}
	
	@RequestMapping("/save")
	public String save(Person person){
		//修改
		if(person.getId()!=0){
			Person p=personList.get(person.getId()-1);
			p.setAge(person.getAge());
			p.setName(person.getName());
		}
		else {
			personList.add(person);
		}
		return "redirect:/person/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id") String id){
		personList.remove(Integer.parseInt(id)-1);
		return "redirect:/person/list.do";
	}
}
