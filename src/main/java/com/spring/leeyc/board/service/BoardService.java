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
	
	// 다짐 목록
	public List<BoardVO> listPromise() throws Exception{
		return boardDao.listPromise();
	}
	
	// 다짐 조회
	public void insPromise(BoardVO boardVO) throws Exception{
		boardDao.insPromise(boardVO);
	}
}
