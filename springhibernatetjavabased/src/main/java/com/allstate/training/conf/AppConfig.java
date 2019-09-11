package com.allstate.training.conf;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages="com.allstate.training")
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/allss");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		return dataSource;
	}
	
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		Properties props=new Properties();
		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		props.put(Environment.HBM2DDL_AUTO, "create");
		props.put(Environment.SHOW_SQL, "true");
		props.put(Environment.FORMAT_SQL, "true");
		props.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
		props.put(Environment.CACHE_REGION_FACTORY, 
				"org.hibernate.cache.ehcache.EhCacheRegionFactory");
		
		sessionFactory.setHibernateProperties(props);
		//sessionFactory.setAnnotatedPackages("com.allstate.training.entities");
		sessionFactory.setPackagesToScan("com.allstate.training.entities");
		return sessionFactory;
	}

}
