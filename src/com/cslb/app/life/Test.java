package com.cslb.app.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// �������� �� �� ���� --- ִ�� --- ����

		//
		// ioc ���� ���� ע�� person

		// Person per = new Person();
		//
		// per.setName("����");
		
//		   ioc ���� ����  ����  xml �ļ� �� ��ͨ��������� ����  bean ��id  ���� ���� ע��  �� 
		
//		   ioc ����  ���� ����  bean  ���� �������ڵĹ��� 
		   
//		   ��һ��bean ������������ʱ�� �ͻ� �����ڴ� �ռ䣬      Ϊ�� ��Լ �ڴ�  �� ��Ҫ��  ���� �� ������
		
//		  ��Ȼ Ҫ����   �����٣� ��Ҫ֪�� ���bean  Ҫִ�� ʲô���ķ���
		
//		   1 �� bean �� �� ���췽�� 
		
//		   2 �� bean �� ��ֵ����
		   
		    
//		   3 �� bean ��ʼ������ 
		
//		   4 �� ���� bean ��Ĳ��� 
		
//	       5 �� bean ���ٷ���
		
		
		
		
//		   1 �� bean �� �� ���췽�� 
		
//		   2 �� bean �� ��ֵ����
		   
//		   3��  ���� �������е�    before ���� 
		
//		   4  �� bean ��ʼ������                            ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean-life.xml");
		 
//		   5    ���� �������е�    after ���� 
	
//		   6  �� ���� bean ��Ĳ��� 	     System.out.println(per.getName());
		
//	       7 �� bean ���ٷ���
		
		
		
//		 �� ioc ����  ����  bean  ���� �����   ���� ���� ����  �� ֻҪ �����   ���� ���� ����  ���ڣ� 
		
//		����֪����Щ���� ʲô ʱ�򱻵��ã� ��ô �Ϳ����ڶ�Ӧ�ķ����� ��һЩ ����
		
		
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean-life.xml");

		Person per = (Person) con.getBean("per1");
	
		System.out.println(per.getName());
		
		con.close();
		
		//���������񡣡���������������������
				//���������񡣡���������������������
				//���������񡣡���������������������
				//���������񡣡���������������������
				//���������񡣡���������������������
//		
		
	
		
	
	}

}
