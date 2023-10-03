package com.begins.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data

@Document(collection = "Task1")
public class Student {

	@Id
	public String id;

	private int stuNo;
	private String stuName;
	private String stuDep;
	

public Student(String id, int stuNo, String stuName, String stuDep) {
	this.id = id;

	this.stuNo = stuNo;
	this.stuName = stuName;
	this.stuDep = stuDep;
}
}


