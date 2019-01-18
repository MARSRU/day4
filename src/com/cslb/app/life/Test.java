package com.cslb.app.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 生命周期 ， 从 创建 --- 执行 --- 销毁

		//
		// ioc 容器 数据 注入 person

		// Person per = new Person();
		//
		// per.setName("张三");
		
//		   ioc 容器 对象  调用  xml 文件 。 在通过这个对象 调用  bean 的id  进行 数据 注入  ， 
		
//		   ioc 容器  可以 对象  bean  进行 生命周期的管理 
		   
//		   当一个bean 被创建出来的时候， 就会 消耗内存 空间，      为了 节约 内存  ， 就要有  创建 ， 有销毁
		
//		  既然 要创建   到销毁， 就要知道 这个bean  要执行 什么样的方法
		
//		   1 、 bean 类 的 构造方法 
		
//		   2 、 bean 中 传值方法
		   
		    
//		   3 、 bean 初始化方法 
		
//		   4 、 对于 bean 类的操作 
		
//	       5 、 bean 销毁方法
		
		
		
		
//		   1 、 bean 类 的 构造方法 
		
//		   2 、 bean 中 传值方法
		   
//		   3、  后置 处理器中的    before 方法 
		
//		   4  、 bean 初始化方法                            ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean-life.xml");
		 
//		   5    后置 处理器中的    after 方法 
	
//		   6  、 对于 bean 类的操作 	     System.out.println(per.getName());
		
//	       7 、 bean 销毁方法
		
		
		
//		 让 ioc 容器  对于  bean  产生 具体的   生命 周期 方法  ， 只要 具体的   生命 周期 方法  存在， 
		
//		并且知道这些方法 什么 时候被调用， 那么 就可以在对应的方法中 做一些 操作
		
		
		
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("bean-life.xml");

		Person per = (Person) con.getBean("per1");
	
		System.out.println(per.getName());
		
		con.close();
		
		//我是秦旭旭。。。。。。。。。。。。
				//我是秦旭旭。。。。。。。。。。。。
				//我是秦旭旭。。。。。。。。。。。。
				//我是秦旭旭。。。。。。。。。。。。
				//我是秦旭旭。。。。。。。。。。。。
//		
		
	
		
	
	}

}
