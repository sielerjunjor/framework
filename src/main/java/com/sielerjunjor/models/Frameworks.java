package com.sielerjunjor.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Frameworks {

	@Id
	public ObjectId _id;

	public String name;
	public String type;
	public String description;
	
	public Frameworks() {
		
	}
		
	public Frameworks(ObjectId _id, String name, String type, String description) {
		super();
		this._id = _id;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
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
