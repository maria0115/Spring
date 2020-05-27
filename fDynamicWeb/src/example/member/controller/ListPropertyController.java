package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVoList;

@Controller
public class ListPropertyController {

	
	@RequestMapping("/multiInsert.do")
	public void test(MemberVoList list)
	{
		
		
	}
}
