package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entity.Student;

public class IStudentRepositoryImpl implements IStudentRepository{

	EntityManager entityManager;
	
	//Started Life Cycles
	public IStudentRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = entityManager.find(Student.class,hallTicketNo );
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		entityManager.remove(student);
		return student;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();;
		
	}

	@Override
	public Student addCertificate(Student student) {
		entityManager.persist(student);
		return student;
	}

}
