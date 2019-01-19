package com.cslb.app.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// 后置处理器  的 类 
public class MyBeanPostProcessor implements BeanPostProcessor{
	// 类 实现接口， 可以 调用接口中方法
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
//		object  arg0    这个 是 一个 person 对象
		
//		bean 中的  id 名
		System.out.println("init 之后 执行的 我是对象  ：：： "+arg0 );
		System.out.println(arg1 );
		
		
//		  可以 通过   arg1    判断 对 哪一个  bean 进行  后置 处理，  
		if (arg1 .equals("per1")) {
			// 通过 arg0  强制 转为 对应的对象，  可以 对  这个对象  进行 在 次 处理
			Person per = (Person) arg0 ; 
			
			per.setName("李四");
			
		}
		
		
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("之前    我是对象  ：：："+arg0 );
		System.out.println(arg1 );
		return arg0;
	}

}
