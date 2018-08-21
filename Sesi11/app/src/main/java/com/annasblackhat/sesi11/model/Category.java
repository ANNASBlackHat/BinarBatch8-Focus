package com.annasblackhat.sesi11.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category{

	@SerializedName("attributes")
	private List<AttributesItem> attributes;

	@SerializedName("variants")
	private List<VariantsItem> variants;

	@SerializedName("status")
	private String status;

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}


	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}