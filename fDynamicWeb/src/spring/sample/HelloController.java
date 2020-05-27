package spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/start.do")
	public ModelAndView start()
	{
		System.out.println("start요청되었습니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");	///WEB-INF/view/+hello+.jsp
		mv.addObject("message","즐거운 스프링");
		return mv;
	}
	
	

}
