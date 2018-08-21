package com.annasblackhat.sesi11.model;

import com.google.gson.annotations.SerializedName;


public class ValueItem{

	@SerializedName("id")
	private int id;

	@SerializedName("value")
	private String value;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}