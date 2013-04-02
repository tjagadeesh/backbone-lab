package org.techiekernel.backbone.repository;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.techiekernel.backbone.model.Student;

public class Repository{
	public static long STUDENTS_ID_STORE;
	public static Set<Student> STUDENTS_REPO;

	static {
		STUDENTS_REPO = new HashSet<Student>();
		STUDENTS_ID_STORE = 0;
		
		Student student = new Student();
		student.setId(getId());
		student.setRollNo("200130364");
		student.setName("Satish Kumar");
		student.setStandard("1st");
		
		STUDENTS_REPO.add(student);
	}
	
	public static long getId() {
		return ++STUDENTS_ID_STORE;
	}
}
