package ex04_xml_list;

public class MemberBean {
	
	private String name;
	private int age;
	private String message;
	
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
