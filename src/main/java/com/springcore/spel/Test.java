package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.stereotype.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
        Demo d1=context.getBean("demo",Demo.class);
        System.out.println(d1);


		// TODO Auto-generated method stub

	}

}
