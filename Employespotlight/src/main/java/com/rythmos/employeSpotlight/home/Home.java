package com.rythmos.employeSpotlight.home;

public class Home {
	private String id;
	private String mail;
	private String password;
	private String name;
	public Home(){
		
	}
	public Home(String id, String mail, String password, String name) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
