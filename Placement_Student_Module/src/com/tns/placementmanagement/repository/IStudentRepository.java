package com.tns.placementmanagement.repository;

import com.tns.placementmanagement.entity.Student;

public interface IStudentRepository {

	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int ticketNo);
	public Student deleteStudent(Student student);
	public Student addCertificate(Student student);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
