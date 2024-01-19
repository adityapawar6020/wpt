package com.demo.service;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface loginserviceinterface {


public User validateuser(String uN, String uP);

public List<Product> getProducts();
	
	
	
}
