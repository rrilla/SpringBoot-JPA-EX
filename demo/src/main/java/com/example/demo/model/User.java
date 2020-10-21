package com.example.demo.model;

public class User {
	private int id;
	private String username;
	private String addr;
	
	public User(int id, String username, String addr) {
		this.id = id;
		this.username = username;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
