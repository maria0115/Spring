package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	
	@RequestMapping(value="/model.do")
	public void test(Model m)
	{
		m.addAttribute("message","팀원님들 뭐 하셈");
		m.addAttribute("addr","가산");
	}
	/*
	 * 기본적으로 뷰단으로 데이타 넘기는 방법
	 * 1. ModelAndView 객체
	 * 2. Map 객체(자바의 HashMap)
	 * 3. Model 객체************* return으로 넘기지 않고 인자로 지정
	 */

}
