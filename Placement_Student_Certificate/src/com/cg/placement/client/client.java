package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.entities.Certificate;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class client 
{
	public static void main(String[] args) 
	{
		// Creating an object of all entity files
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
		
		student.setName("TOkir");
		student.setCollege("Delhi University");
		student.setRoll(55);
		student.setQualification("BCA");
		student.setCourse("CIS");
		student.setYear(2022);
		student.setHallTicketNo(321);
		
		Certificate certificate = new Certificate();

		certificate.setCyear(2020);
		certificate.setCcollege("Mumbai");
		
		// One to One ( Writing data to DB in One to One Mapping
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		
		service.addStudent(student);
		
		System.out.println("one student entry and one certificate entry is completed");
		
		
	}

}
