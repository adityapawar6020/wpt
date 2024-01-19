package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.logindaointerface;
import com.demo.model.Product;
import com.demo.model.User;



@Service
public class loginserviceimpl implements loginserviceinterface {
	
	@Autowired //object banvaila je annotato lagtil na te he karun gheil
	logindaointerface db;

	

	public User validateuser(String uN, String uP) {
		
return	db.checkuser(uN, uP);
		
		
		

	}



	public List<Product> getProducts() {

		
		
		
		return db.getallproducts();
	}
	
	
	
	

}
