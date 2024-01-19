package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.loginserviceinterface;


	
	@Controller
	@RequestMapping("/login")
	public class logincontroller {
		
		
		@Autowired 
		loginserviceinterface ls;
		
		


		@GetMapping("/")
		public String showloginform() {
			return "login";
			
//			yachat view return karto ahe na mahanun te view resolver user hota ahe na
		}
		
		@PostMapping("/validate") //jith pan @ te spring 
		public ModelAndView validate(@RequestParam String UN,@RequestParam String UP) {
			
		User V=	ls.validateuser(UN,UP);
			
		if(V==null)
		{
			return new ModelAndView("redirect:/login/");//easy
//			URL return kela tar direct tya controller la na
		}
		else {
			
			
			return new ModelAndView("redirect:/products/");
		}
		
		}
	}

			
			
		
		
		



