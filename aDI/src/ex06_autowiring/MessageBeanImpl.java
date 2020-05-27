package ex06_autowiring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String message;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * @Autowired	//생성자나 setter도 없이 DI (주입) 해주는 어노테이션
	 * 
	 * @Qualifier("outputer2")//동일한 클래스의 빈이 여러개인 경우 선택한느 어노테이션
	 */
	@Resource(name="outputer2")	//@Autowired+@Qualifier
	private Outputer outputer;

	@Override
	public void sayHello() {
		
		System.out.println(name+"님께"+message);
		try {
			outputer.write(name+"님께"+message);
		} catch (Exception e) {
			System.out.println("에러"+e.getMessage());
		}
	}

}
