package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.model.Student;

@Controller
public class RegistrationController {

	@RequestMapping(value="/registrationform.ds",method = RequestMethod.GET)
	public ModelAndView registrationFormhandler() {

		ModelAndView model = new ModelAndView("registrationform");
		//model.addObject("WelcomeMsg", "Welcome To Registration Form");

		return model;

	}
	
	@RequestMapping(value ="/registrationprocess.ds",method= RequestMethod.GET)
	public ModelAndView registrationFormProcesshandler(@RequestParam("name")String name,@RequestParam("contact")String contact,@RequestParam("email")String email) 
	{
		System.out.println("Hello ");

		Student student = new Student();
		student.setName(name);
		student.setContact(Long.parseLong(contact));
		student.setEmail(email);
		
		ModelAndView modelview = new ModelAndView("sucess");
		modelview.addObject("student",student);
		

		return modelview;

	}

	
	
}
