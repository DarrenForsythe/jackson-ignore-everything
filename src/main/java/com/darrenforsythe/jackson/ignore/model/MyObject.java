package com.darrenforsythe.jackson.ignore.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyObject {
	

	private int id;
	private String name;
	private Date date;
	
	
	public MyObject(){
		id = 1;
		name = "thing";
		date = new Date();
	}


	@JsonProperty
	public String getName() {
		System.out.println("Name just got get!");
		return name;
	}


	public void setName(String name) {
		System.out.println("Name just got set!");
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}
