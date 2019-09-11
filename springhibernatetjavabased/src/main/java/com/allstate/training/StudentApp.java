package com.allstate.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.allstate.training.conf.AppConfig;
import com.allstate.training.dao.StudentDao;
import com.allstate.training.entities.Address;
import com.allstate.training.entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao studentDao=(StudentDao) context.getBean("studentDaoImpl");
		Student st=new Student();
		st.setAdarNum(3223);
		st.setStudentId(1);
		st.setStudentName("Shwetha");
		studentDao.addStudent(st);

	}

}
