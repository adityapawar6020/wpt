package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;
import com.demo.model.User;


@Repository 
public class logindaoimpl implements logindaointerface {

	@Autowired
	JdbcTemplate jt;//yache function use karu na 
	
	
	public User checkuser(String username, String password) {
		try{
			
	
		String q="Select username,password from user where username=? and password=? ";
		

			User u=jt.queryForObject(q,
					new Object[]{username,password},
					BeanPropertyRowMapper.newInstance(User.class));
		
		return u;
		
		}
		
		//sadha obj la convert kela user object madhe
		
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}

	}


	public List<Product> getallproducts() {
		
	 
	try{
					
					
	String w="select * from Products";
	
	return jt.query(w,(rs,num)->{
		
		
		Product pobj=new Product();
		
		pobj.setProductname(rs.getString(1));
		pobj.setProductprice(rs.getString(1));
		
		return pobj;
	  });
			
			
					
					
				}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		return null;
	}
	}

	
	
	
	
	
}
