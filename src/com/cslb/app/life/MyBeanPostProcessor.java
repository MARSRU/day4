package com.cslb.app.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// ���ô�����  �� �� 
public class MyBeanPostProcessor implements BeanPostProcessor{
	// �� ʵ�ֽӿڣ� ���� ���ýӿ��з���
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
//		object  arg0    ��� �� һ�� person ����
		
//		bean �е�  id ��
		System.out.println("init ֮�� ִ�е� ���Ƕ���  ������ "+arg0 );
		System.out.println(arg1 );
		
		
//		  ���� ͨ��   arg1    �ж� �� ��һ��  bean ����  ���� ����  
		if (arg1 .equals("per1")) {
			// ͨ�� arg0  ǿ�� תΪ ��Ӧ�Ķ���  ���� ��  �������  ���� �� �� ����
			Person per = (Person) arg0 ; 
			
			per.setName("����");
			
		}
		
		
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("֮ǰ    ���Ƕ���  ������"+arg0 );
		System.out.println(arg1 );
		return arg0;
	}

}
