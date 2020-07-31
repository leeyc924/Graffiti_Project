package com.spring.leeyc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.leeyc.board.service.BoardService;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/board/list")
	public ModelAndView listPromise() throws Exception {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("board/list"); 
		mv.addObject("list",service.listPromise());
		return mv;
	}
	
	@RequestMapping("/board/writeView")
	public String writePromise() throws Exception {
		return "board/writeView";
	}
	
	@RequestMapping("/write")
	public ModelAndView insPromise(HttpServletRequest req,HttpServletResponse res) throws Exception {
		ModelAndView mv = new ModelAndView();
//		req.getParameter("promise"); 
		mv.setViewName("/board/list"); 
		return mv;
	}
}
