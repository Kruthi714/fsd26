package com.test.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.test")
@PropertySource("classpath:database.properties")
public class DBConfig {
	@Autowired
	private Environment environment;
	private final String URL="url";
	private final String USER="dbuser";
	private final String PASSWORD="dbpassword";
	private final String DRIVER="driver";
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl(environment.getProperty(URL));
		datasource.setUsername(environment.getProperty(USER));
		datasource.setPassword(environment.getProperty(PASSWORD));
		datasource.setDriverClassName(environment.getProperty(DRIVER));
		return datasource;
	}

}
