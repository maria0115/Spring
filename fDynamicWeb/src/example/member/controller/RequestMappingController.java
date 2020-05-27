package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.member.model.MemberVo;

@Controller
@RequestMapping("/board")
public class RequestMappingController {
	
	@RequestMapping(value= {"/a.do","/b.do"})
	public String test()
	{
		System.out.println("a.do와 b.do 요청합니다");
		return "hello";		//WEB-INF/view/hello.jsp
	}
	//***********리턴형이 String인 경우 : 뷰 페이지 지정
	
	@RequestMapping(value= "c.do", params= {"id=maria"})
	public void test2(String id)
	{
		System.out.println(id);
	}
	//**********리턴형이 void 인 경우 : 요청과 동일한 이름의 뷰페이지를 지정됨
	
	@RequestMapping(value = "/request.do", method=RequestMethod.POST)
	public void test3(MemberVo vo)
	{
		System.out.println("request.do 요청"+vo.getName());
	}
}
