package com.springcore.javaconfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	
	
	@Bean
	public Student getStudent() {
		//Creating a new student object
		Student student=new Student(getSamosa());
		return student;
	}

}
