package com.testcases;

public class Player {
	public int id;
	public String name;
	public String country;
	public String role;
	public String price;

	
	public Player(int id, String name, String country, String role, String price) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.role = role;
		this.price= price;
	}
	
	@Override
	public String toString()
	{
		return "name-"+name+" country-"+country+" role-"+role+"price"+price;
	}
	
}
