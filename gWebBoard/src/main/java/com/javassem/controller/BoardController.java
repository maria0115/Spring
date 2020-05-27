package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
		
		@RequestMapping("/getBoardList.do")
		public void getBoardList(BoardVO vo, Model model)
		{
			//검색기능 때문에 BoardVO를 지정했지만 지금은 필요없음
			List<BoardVO> list = service.getBoardList(vo);
			model.addAttribute("boardList",list);
		
		}	//view page : get BoardList.jsp
		
		@RequestMapping("/{step}.do")
		public String insertBoard(@PathVariable String step)
		{
			return step;
		}
		
		@RequestMapping("/saveBoard.do")
		public String saveBoard(BoardVO vo)
		{
			service.insertBoard(vo);
			
			return "redirect:getBoardList.do";
		}
		@RequestMapping("/getBoard.do")
		public void getBoard(BoardVO vo, Model m ){
			m.addAttribute("board",service.getBoard(vo));
		}
		
		@RequestMapping("/deleteBoard.do")
		public String deleteBoard(BoardVO vo)
		{
			service.deleteBoard(vo);
			return "redirect:getBoardList.do";
		}
		
		@RequestMapping("/updateBoard.do")
		public String updateBoard(BoardVO vo)
		{
			service.updateBoard(vo);
			return "redirect:getBoardList.do";
		}


}
