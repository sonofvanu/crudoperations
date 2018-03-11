package com.niit.backend.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

@Configuration
public class DataBaseConfiguration {
	
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUsername("niit");
		dataSource.setPassword("niit");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/106s229");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getDataSource());
		sessionBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		sessionBuilder.setProperty("hibernate.show_sql", "true");
		sessionBuilder.setProperty("hibernate.hbm2ddl.auto", "update");
		sessionBuilder.scanPackages("com.niit.backend.model");
		return sessionBuilder.buildSessionFactory();
		
		
	}

}
