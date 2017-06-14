package com.darrenforsythe.jackson.ignore.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyObject {

	private int id;
	@JsonProperty
	private String name;
	private Date date;

	public MyObject(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public MyObject() {
	};

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
