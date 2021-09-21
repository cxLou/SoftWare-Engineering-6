package com.test.vo;

public class Enterprise {
	private int id;
	private String username;
	private String pwd;
	private String phone;
	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", username=" + username + ", pwd=" + pwd + "]";
	}
	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enterprise(int id, String username, String pwd) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}
	
	public Enterprise(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public int getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
