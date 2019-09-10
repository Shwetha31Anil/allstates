package com.allstate.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.allstate.training.entities.Address;
import com.allstate.training.entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration con=new Configuration()
					.configure()
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Address.class);
SessionFactory sessionFactory=con.buildSessionFactory();

	Session session=sessionFactory.openSession();
	Student st=(Student)session.get(Student.class, 12);
	System.out.println(st);
	//Address ad=(Address)session.get(Address.class, 100);



	}

}
