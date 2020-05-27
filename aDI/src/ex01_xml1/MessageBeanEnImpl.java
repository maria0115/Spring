package ex01_xml1;

public class MessageBeanEnImpl implements MessageBean{

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"GOOD Morning");
	}

	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl 객체생성");
	}

}
