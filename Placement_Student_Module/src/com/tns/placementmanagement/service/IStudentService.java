package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.Student;

public interface IStudentService {

public Student addStudent(Student student);  // C
public Student updateStudent(Student student);  // U
public Student searchStudentById(int id);  // R

public Student searchStudentByHallTicket(int hallTicketNo); // R

public Student addCertificate(Student student); // C
public Student updateCertificate(Student student); // U
public Student deleteStudent(Student student); // D
}
