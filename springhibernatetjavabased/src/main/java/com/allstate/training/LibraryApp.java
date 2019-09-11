package com.allstate.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.allstate.training.conf.HibernateUtil;
import com.allstate.training.entities.Book;
import com.allstate.training.entities.Library;

public class LibraryApp {

	public static void main(String[] args) {
	/*SessionFactory sessionFactory=	HibernateUtil.getSessionFactory();*/
	
	/*Session session=sessionFactory.openSession();
	Book lib=(Book)session.get(Book.class, "Bo12");
	System.out.println(lib);
	
	Book lib1=(Book)session.get(Book.class, "Bo13");
	System.out.println(lib1);
	
	session.close();
	Session session1=sessionFactory.openSession();
	Book lib2=(Book)session1.get(Book.class, "Bo12");
	System.out.println(lib2);
	session1.close();
	*/
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	Library lib=new Library();
	lib.setLname("E books");
	lib.setLibrarian("Rajath");
	
	Book book=new Book();
	book.setBookId("Bo12");
	book.setBookName("Hibernate in Action");
	book.setAuthor("XYZ");
	book.setLibrary(lib);
	Book book1=new Book();
	book1.setBookId("Bo13");
	book1.setBookName("Hibernate in Action");
	book1.setAuthor("XYZ");
	
	book1.setLibrary(lib);
	lib.getBooks().add(book);
	lib.getBooks().add(book1);
	
	session.beginTransaction();
	session.save(book);
	session.save(book1);

	session.getTransaction().commit();
	session.close();
	}

}
