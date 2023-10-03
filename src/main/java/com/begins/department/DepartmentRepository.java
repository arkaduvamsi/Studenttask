package com.begins.department;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.begins.student.Student;

@Repository
public interface DepartmentRepository extends MongoRepository<Student,String> {

	

	

	
	
	

}
