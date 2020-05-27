package ex01_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class MainApp {

	public static void main(String[] args) {
		
		//1. 스프링 설정파일을 연결
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex01_xml1/applicationContext.xml");
				//ClassPathXmlApplicationContext("ex01_xml1/applicationContext.xml");
		
		System.out.println("start---------------");
		MessageBean bean = context.getBean("en", MessageBean.class);
		bean.sayHello("maria");
		MessageBean bean1 = context.getBean("en", MessageBean.class);
		bean1.sayHello("john");

		
		MessageBean bean2 = context.getBean("ko", MessageBean.class);
		bean2.sayHello("홍길숙");
		MessageBean bean3 = context.getBean("ko", MessageBean.class);
		bean3
		.sayHello("홍길자");

	}

}
