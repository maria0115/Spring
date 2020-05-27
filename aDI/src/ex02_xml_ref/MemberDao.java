package ex02_xml_ref;

public class MemberDao {
	
	private MemberBean member;

	//(1) constructor 이용
	public MemberDao(MemberBean member)
	{
		this.member = member;
	}
	//(2) setter 이용
	public void setMember(MemberBean member)
	{
		this.member = member;
	}
	public MemberDao() {}
	public void insert()
	{
		System.out.println("DB에 " + member.getName()+
				"을 입력합니다");
	}

}
