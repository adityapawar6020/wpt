package com.demo.model;

public class User {
	
	String Username;
	String Pasword;
	public User() {
		super();
	}
	public User(String username, String pasword) {
		super();
		Username = username;
		Pasword = pasword;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPasword() {
		return Pasword;
	}
	public void setPasword(String pasword) {
		Pasword = pasword;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", Pasword=" + Pasword + "]";
	}
	
	
	

}
