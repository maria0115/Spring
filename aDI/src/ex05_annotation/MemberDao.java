package ex05_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //이거 클래스 객체야 applicationContext.xml에서 알수있게 스티커붙임
public class MemberDao {
	
	@Autowired//니가 알아서 생성자 만들어라
	private MemberBean member;
	//생성자와 setter 없는 상태

//	//(1) constructor 이용
//	public MemberDao(MemberBean member)
//	{
//		this.member = member;
//	}
//	//(2) setter 이용
//	public void setMember(MemberBean member)
//	{
//		this.member = member;
//	}
//	public MemberDao() {}
	public void insert()
	{
		System.out.println("DB에 " + member.getName()+
				"을 입력합니다");
	}

}
