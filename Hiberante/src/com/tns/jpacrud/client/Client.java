package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentservice=new StudentServiceImpl();
		Student student1=new Student();
		//insert operation 
		student1.setSid(103);
		student1.setSname("sudeep");
		studentservice.addStudent(student1);

	}

}
  