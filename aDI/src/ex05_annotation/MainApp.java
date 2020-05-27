package ex05_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex05_annotation/applicationContext.xml");
		/*
		 * MemberBean member = context.getBean("member",MemberBean.class);
		 * System.out.println(member.getAge());
		 * 
		 * MemberBean member2 = context.getBean("member2",MemberBean.class);
		 * System.out.println(member2.getAge());
		 */

		MemberDao dao2 = context.getBean("memberDao",MemberDao.class);
		dao2.insert();
	}

}
