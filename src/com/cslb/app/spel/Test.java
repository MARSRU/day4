package com.cslb.app.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("bean-peron-spel.xml");
		
		
		Person per = (Person) con.getBean("person");
		
		System.out.println(per);
		//ÎÒÊÇÇØÐñÐñ¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£
				//ÎÒÊÇÇØÐñÐñ¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£
				//ÎÒÊÇÇØÐñÐñ¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£
				//ÎÒÊÇÇØÐñÐñ¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£
				//ÎÒÊÇÇØÐñÐñ¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£

	}

}
