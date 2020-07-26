package com.spring.leeyc.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.leeyc.board.vo.BoardVO;

@Repository
public interface BoardDao {
	public List<BoardVO> selList() throws Exception;
}
