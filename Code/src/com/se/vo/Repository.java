package com.se.vo;

import java.util.List;

public class Repository {
	private List<Good> repo1;
	private List<Customer> repo2;
	public Repository() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repository(List<Good> repo1, List<Customer> repo2) {
		super();
		this.repo1 = repo1;
		this.repo2 = repo2;
	}
	public List<Good> getRepo1() {
		return repo1;
	}
	public void setRepo1(List<Good> repo1) {
		this.repo1 = repo1;
	}
	public List<Customer> getRepo2() {
		return repo2;
	}
	public void setRepo2(List<Customer> repo2) {
		this.repo2 = repo2;
	}
	
}
