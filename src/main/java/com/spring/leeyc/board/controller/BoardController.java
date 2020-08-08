package com.spring.leeyc.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.spring.leeyc.board.service.BoardService;
import com.spring.leeyc.board.vo.BoardVO;

/**
 * 다짐 Controller
 * @author leeyc
 */
@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService service;
	
	// 다짐 목록
	@RequestMapping("/board/list")
	public ModelAndView listPromise() throws Exception {
		logger.info("list");
		ModelAndView mv =new ModelAndView();
		mv.setViewName("board/list"); 
		mv.addObject("list",service.listPromise());
		return mv;
	}
	
	// 다짐 목록 상세조회
	@RequestMapping("/board/readView")
	public ModelAndView readPromise(BoardVO boardVO) throws Exception{
		logger.info("readView");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/readView");
		mv.addObject("list",service.readPromise(boardVO.getSeqno()));
		return mv;
	}
	
	// 다짐 등록 jsp 이동
	@RequestMapping("/board/writeView")
	public String writePromise() throws Exception {
		logger.info("writeView");
		return "board/writeView";
	}
	
	// 다짐 등록
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String insPromise(BoardVO boardVO) throws Exception {
		logger.info("write");
		service.insPromise(boardVO);
		return "redirect:/board/list";
	}
}
