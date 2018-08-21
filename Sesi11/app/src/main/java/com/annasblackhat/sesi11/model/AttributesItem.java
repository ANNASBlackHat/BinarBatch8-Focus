package com.annasblackhat.sesi11.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class AttributesItem{

	@SerializedName("fieldName")
	private String fieldName;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("options")
	private List<String> options;

	@SerializedName("inputType")
	private String inputType;

	@SerializedName("required")
	private boolean required;

	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	public String getFieldName(){
		return fieldName;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setOptions(List<String> options){
		this.options = options;
	}

	public List<String> getOptions(){
		return options;
	}

	public void setInputType(String inputType){
		this.inputType = inputType;
	}

	public String getInputType(){
		return inputType;
	}

	public void setRequired(boolean required){
		this.required = required;
	}

	public boolean isRequired(){
		return required;
	}
}