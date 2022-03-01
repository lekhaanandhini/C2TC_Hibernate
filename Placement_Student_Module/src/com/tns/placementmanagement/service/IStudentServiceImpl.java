package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.Student;
import com.tns.placementmanagement.repository.IStudentRepository;
import com.tns.placementmanagement.repository.IstudentRepositoryImpl;

public class IStudentServiceImpl implements IStudentService{

	private IStudentRepository dao;
	
	
	public IStudentServiceImpl() {
		dao=new IstudentRepositoryImpl();
	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public Student addCertificate(Student student) {
		dao.beginTransaction();
		dao.addCertificate(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateCertificate(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		return student;
	}
	
		
	}

