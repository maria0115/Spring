package com.javassem.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.dao.MemberDAO;
import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
@RequestMapping("/user")
public class MemberController {
	
	@RequestMapping("/{url}.do")
	public String regist(@PathVariable String url)
	{
		return "user/"+url;
	}	//WEB-INF/views/+ user/userJoin + .jsp
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/userInsert.do")
	public ModelAndView insert(MemberVO vo)
	{
		
		System.out.println("*******************"+vo.getUserName());
		int result = service.userInsert(vo);
		String message="가입되지 않았습니다";
		if(result==1)
		{
			message=vo.getUserName()+"님 가입을 축하드림";
		}
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("user/userJoin_ok");
		mv.addObject("message",message);
		mv.addObject("result",result);
		
		return mv;
		
	}
	
	@ResponseBody	//**********비동기 통신
	@RequestMapping(value="/idCheck.do",produces="applicaton/text; charset=UTF-8")
	public String check(MemberVO vo)
	{
		MemberVO result = service.idCheck_Login(vo);
		String message="ID 사용가능합니다";
		if(result!=null)message="중복된 아이디가 있습니다";

		return message;
				
	}
	/*
	 * Spring에서 String 을 리턴하면 뷰페이지 지정이 되어 버림
	 * 무조건 뷰페이지 지정되어서 화면이 변경됨(페이지 전환됨)
	 */

	@RequestMapping("/login.do")
	public String login(MemberVO vo, HttpSession session)
	{
		MemberVO result = service.idCheck_Login(vo);
		if(result==null ||result.getUserId()==null)
		{
			return "/user/userLogin";
		}else
		{
			session.setAttribute("sessionTime",new Date().toLocaleString());
			session.setAttribute("userName", result.getUserName());
		}
		
		return "/user/Main";
	}
	@RequestMapping("/memberInfo.do")
	public void info()
	{
		
	}


	
}
