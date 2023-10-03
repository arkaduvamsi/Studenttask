package com.begins.department;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Task2")
public class Department {

	@Id
	public String id;
	
	private  int depId;
	private String depName;
	private String clgName;
	
	public Department(String id, int depId,String depName, String clgName) {
		this.id = id;
				
		this.depId = depId;
	this.depName = depName;
	this.clgName = clgName;
	
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	
}
