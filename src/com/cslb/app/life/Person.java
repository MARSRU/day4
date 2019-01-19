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
      System.out.println("我是 构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("我是 传值方法");
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void abc() {
		System.out.println("我是 init 初始化方法");

	}

	public void destroy() {
		System.out.println("我是 destroy  销毁方法");
		
	
	}

}
