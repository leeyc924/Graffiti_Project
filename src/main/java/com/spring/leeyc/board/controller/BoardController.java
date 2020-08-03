package com.spring.leeyc.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.spring.leeyc.board.service.BoardService;
import com.spring.leeyc.board.vo.BoardVO;

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
	
	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public String writePromise() throws Exception {
		return "board/writeView";
	}
	
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String insPromise(BoardVO boardVO) throws Exception {
		service.insPromise(boardVO);
		return "redirect:/board/list";
	}
}
