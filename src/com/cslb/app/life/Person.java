package com.cslb.app.life;

public class Person {
	String name;
	String  age ;
    
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Person() {
      System.out.println("���� ���췽��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("���� ��ֵ����");
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void abc() {
		System.out.println("���� init ��ʼ������");

	}

	public void destroy() {
		System.out.println("���� destroy  ���ٷ���");
		
	
	}

}
