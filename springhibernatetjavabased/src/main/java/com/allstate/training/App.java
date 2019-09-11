package com.allstate.training;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.allstate.training.dao.StudentDao;
import com.allstate.training.dao.StudentDaoImpl;
import com.allstate.training.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("Welcome to StudentApp");
        StudentDao studentDao=new StudentDaoImpl();
    	Scanner sc=new Scanner(System.in);
    	do {
    		System.out.println("1. Add Student \n 2.Update Student \n 3. Delete Student "
    				+ "4. GetStudentBY Id \n 5. List All Students \n 6.Exit");
    	int option=sc.nextInt();
    	switch(option) {
    	
    	}
    	}while(true);
    	
    	
        /*Student st=new Student();
        st.setStudentId(13);
        st.setStudentName("Rahul");
        //st.setMarks(99);
        st.setAdarNum(677777l);
        st.setDob("12-12-07");*/
        
        
        // System.out.println(studentDao.getStudentById(12));
     //   Student st=studentDao.getStudentById(13);
    
        //studentDao.updateStudent(st);
      /* List<Student> sts=studentDao.getAll();
       sts.forEach((st1)->System.out.println(st1));*/
        
       /* Configuration con=new Configuration()
        						.configure()
        						.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory=con.buildSessionFactory();
        
        Session session=sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        
        session.beginTransaction();
        st.setMarks(99);
        session.update(st);
        session.getTransaction().commit();
        session.close();
        
        */
        
        
    }
}
