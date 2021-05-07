package eTicaretDemo.entitites.concretes;

import eTicaretDemo.entitites.abstracts.Entity;

public class User implements Entity{
	private String name;
	private String lastName;
	private String eposta;
	private String password;
	
	
	public User() {
		
	}
	public User(String name, String lastName, String eposta, String password) {
		this.name = name;
		this.lastName = lastName;
		this.eposta = eposta;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
