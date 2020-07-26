package com.spring.leeyc.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.leeyc.board.dao.BoardDao;
import com.spring.leeyc.board.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVO> selList() throws Exception{
		return boardDao.selList();
	}
}
