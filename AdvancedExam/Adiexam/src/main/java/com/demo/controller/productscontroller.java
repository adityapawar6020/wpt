package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.loginserviceinterface;

@Controller
@RequestMapping("/products")


public class productscontroller {

    @Autowired 
    loginserviceinterface lq;
	@GetMapping("/")
	public ModelAndView ShowProducts() {
		
		
		List<Product> uobj=lq.getProducts();
		
		
		
		
		return new ModelAndView("products","uobj",uobj);
	}
	}



 