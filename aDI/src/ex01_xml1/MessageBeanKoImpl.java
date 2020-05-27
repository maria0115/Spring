package ex01_xml1;

public class MessageBeanKoImpl implements MessageBean{

	@Override
	public void sayHello(String name) {
		System.out.println(name+"님 반갑습니다");
		
	}

	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl 객체생성");
	}

}
