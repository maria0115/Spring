package ex02_xml_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex02_xml_ref/applicationContext.xml");
		/*
		 * MemberBean member = context.getBean("member",MemberBean.class);
		 * System.out.println(member.getAge());
		 * 
		 * MemberBean member2 = context.getBean("member2",MemberBean.class);
		 * System.out.println(member2.getAge());
		 */

		MemberDao dao = context.getBean("memdao",MemberDao.class);
		dao.insert();
		
		MemberDao dao2 = context.getBean("memdao2",MemberDao.class);
		dao2.insert();
	}

}
