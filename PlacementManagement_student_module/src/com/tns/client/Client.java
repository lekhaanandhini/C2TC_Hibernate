package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.IStudentService;
import com.tns.service.IStudentServiceImpl;


public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
		
		// Create
		/*
		 * student.setId(101); student.setName("Sachin"); student.setRoll(30);
		 * student.setQualification("BCA"); student.setCourse("CS");
		 * student.setYear(2021); student.setCertificate("JFS");
		 * student.setHallTicketNo(112); student.setCollege("Mumbai University");
		 * service.addStudent(student);
		 */
				
						// Retrieve
						
						student	= service.searchStudentById(100);
						System.out.println("ID is:"+student.getId());
						System.out.println("Roll is:"+student.getRoll());
						System.out.println("College is:"+student.getCollege());
						
						// Update
						student	= service.searchStudentById(100);
						student.setCollege("VIT University");
						service.updateStudent(student);
						System.out.println("Update is successful");
						
						
						
						student	= service.searchStudentById(101);
						service.deleteStudent(student);
						System.out.println("Delete is successful");
						
	}

}
