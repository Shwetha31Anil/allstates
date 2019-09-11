package com.allstate.training.conf;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.allstate.training.entities.Account;
import com.allstate.training.entities.Book;
import com.allstate.training.entities.CurrentAccount;
import com.allstate.training.entities.Library;
import com.allstate.training.entities.SavingsAccount;

public class HibernateUtil {
	private static SessionFactory sessionFactroy=null;
	
	public static SessionFactory getSessionFactory() {
		Configuration con=new Configuration();
		Properties props=new Properties();
		props.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.put(Environment.URL, "jdbc:mysql://localhost:3306/alls");
		props.put(Environment.USER, "root");
		props.put(Environment.PASS, "admin");
		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		props.put(Environment.HBM2DDL_AUTO, "create");
		props.put(Environment.SHOW_SQL, "true");
		props.put(Environment.FORMAT_SQL, "true");
		props.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
		props.put(Environment.CACHE_REGION_FACTORY, 
				"org.hibernate.cache.ehcache.EhCacheRegionFactory");
		
		con.setProperties(props);	
		/*con.addAnnotatedClass(Library.class);
		con.addAnnotatedClass(Book.class);*/
		con.addAnnotatedClass(Account.class);
		con.addAnnotatedClass(SavingsAccount.class);
		con.addAnnotatedClass(CurrentAccount.class);
		
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
												.applySettings(con.getProperties());
		sessionFactroy= con.buildSessionFactory(builder.build());
		return sessionFactroy;
	}
}
