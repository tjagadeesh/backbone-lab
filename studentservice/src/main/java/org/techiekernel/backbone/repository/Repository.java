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
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130365");
		student.setName("Priyam Chaudhari");
		student.setStandard("1st");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130366");
		student.setName("Pritam Ghost");
		student.setStandard("2nd");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130367");
		student.setName("Jagadeesh Tellakula");
		student.setStandard("10th");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130368");
		student.setName("Rajkiran Yampaty");
		student.setStandard("-1th");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130369");
		student.setName("Rajkiran Yampaty");
		student.setStandard("-1st");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130369");
		student.setName("Sahithya Kattakam");
		student.setStandard("1st");
		
		STUDENTS_REPO.add(student);
        
        student = new Student();
		student.setId(getId());
		student.setRollNo("200130371");
		student.setName("Saravanan J");
		student.setStandard("1st");
		
		STUDENTS_REPO.add(student);
	}
	
	public static long getId() {
		return ++STUDENTS_ID_STORE;
	}
}
