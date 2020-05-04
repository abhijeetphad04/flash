package com.javabykiran.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.jbk.hibernate.Download;
import com.jbk.hibernate.Operators;
import com.jbk.hibernate.Statetable;
import com.jbk.hibernate.Users;

@Configuration
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {
	@Autowired
	ApplicationContext context;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setAnnotatedClasses(Users.class,Statetable.class,Operators.class,Download.class);
		return factoryBean;
	}
}
