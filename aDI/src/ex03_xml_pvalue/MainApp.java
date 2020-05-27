package ex03_xml_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex03_xml_pvalue/applicationContext.xml");
		/*
		 * MemberBean member = context.getBean("member",MemberBean.class);
		 * System.out.println(member.getAge());
		 * 
		 * MemberBean member2 = context.getBean("member2",MemberBean.class);
		 * System.out.println(member2.getAge());
		 */

		MemberDao dao = context.getBean("memdao",MemberDao.class);
		dao.insert();
		

	}

}
