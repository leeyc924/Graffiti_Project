package com.spring.leeyc.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.leeyc.board.vo.BoardVO;

@Repository
public interface BoardDao {
	
	// 다짐 목록
	public List<BoardVO> listPromise() throws Exception;
	
	// 다짐 추가
	public void insPromise(BoardVO boradVO) throws Exception;
	
}
