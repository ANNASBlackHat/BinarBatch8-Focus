package com.annasblackhat.sesi11.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class VariantsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("value")
	private List<ValueItem> value;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setValue(List<ValueItem> value){
		this.value = value;
	}

	public List<ValueItem> getValue(){
		return value;
	}
}