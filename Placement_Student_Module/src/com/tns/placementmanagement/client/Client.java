package com.tns.placementmanagement.client;

import com.tns.placementmanagement.entity.Student;
import com.tns.placementmanagement.service.IStudentService;
import com.tns.placementmanagement.service.IStudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
		
		// Create
				
		student.setId(100);
				student.setName("Dhoni");
				student.setRoll(49);
				student.setQualification("MS");
				student.setCourse("EC");
				student.setYear(2023);
				student.setCertificate("ST");
				student.setHallTicketNo(111);
				student.setCollege("Ranchi University");
				service.addStudent(student);
		
		// Retrieve
				
				student	= service.searchStudentById(100);
				System.out.println("ID is:"+student.getId());
				System.out.println("Roll is:"+student.getRoll());
				System.out.println("College is:"+student.getCollege());
		
				// Update
				student	= service.searchStudentById(100);
				student.setCollege("Mumbai University");
				service.updateStudent(student);
				System.out.println("Update is successful");
				
				
				
				student	= service.searchStudentById(100);
				service.deleteStudent(student);
				System.out.println("Delete is successful");
				
				/*
				 * student = service.searchStudentByHallTicket(111);
				 * service.deleteStudent(student); System.out.println("Delete is successful");
				 */
				

	}

}
