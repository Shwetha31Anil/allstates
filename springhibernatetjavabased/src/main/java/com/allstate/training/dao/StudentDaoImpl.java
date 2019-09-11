package com.allstate.training.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.allstate.training.entities.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;


	public void addStudent(Student st) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(st);//insert statement
		
		session.getTransaction().commit();//for committing
		session.close();
		
	}

	public void updateStudent(int id,int marks) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	Student st1=(Student)session.get(Student.class, id);
	st1.setMarks(marks);
		session.update(st1);//update student set stname=?, marks=? where studentId=?;
		
		session.getTransaction().commit();//for committing
		session.close();

	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Student st=(Student)session.get(Student.class, id);//select * from student where studentId=?id;
		session.delete(st);//delete from student where studentid=?
		
		session.getTransaction().commit();//for committing
		session.close();

	}

	public Student getStudentById(int id) {
		Session session=sessionFactory.openSession();
		Student st=(Student)session.get(Student.class, id);
		session.close();
		return st;
	}

	public List<Student> getAll() {
		Session session=sessionFactory.openSession();
		List<Student> students=session.createCriteria(Student.class).list();
		return students;
	}

}
