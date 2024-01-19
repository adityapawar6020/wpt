package com.demo.dao;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface logindaointerface {
	
public User checkuser(String username,String password);



public List<Product> getallproducts();

}


