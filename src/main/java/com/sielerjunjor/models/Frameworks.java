package com.sielerjunjor.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Frameworks {

	@Id
	public ObjectId id;

	public String name;
	public String type;
	public String description;
	
	public Frameworks() {
		
	}
		
	public Frameworks(ObjectId id, String name, String type, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	public String getId() {
		return id.toHexString();
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
