package aop2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_annotation/applicationContext.xml");
		MessageBean bean = (MessageBean)context.getBean("targetbean");

		bean.sayHello();
		System.out.println("-----------------------");
		bean.test();
		System.out.println("-----------------------");
		bean.engSayHello();


	}

}
