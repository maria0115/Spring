package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVo;

@Controller
public class ModelAttrController {
	
	/*
	 * 기본적으로 뷰단으로 데이타 넘기는 방법
	 * 1. ModelAndView 객체
	 * 2. Map 객체(자바의 HashMap)
	 * 3. Model 객체************* return으로 넘기지 않고 인자로 지정
	 * 4. @ModelAttribute
	 */
	
	@ModelAttribute("message")
	public String hihi()
	{
		return "오늘은 어디까지";
	}
	@ModelAttribute("vo")
	public MemberVo haha()
	{
		MemberVo vo = new MemberVo();
		vo.setAge(22);
		vo.setId("hihi");
		vo.setName("예은");
		return vo;
	}
	
	@RequestMapping("/modelAttr.do")
	public String test()
	{
		return "modelAttribute";
	}

}
