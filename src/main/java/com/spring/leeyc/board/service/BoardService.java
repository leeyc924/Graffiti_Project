package com.spring.leeyc.board.service;

import java.util.List;
import com.spring.leeyc.board.vo.BoardVO;
/**
 * 다짐 service interface
 * @author leeyc
 */
public interface BoardService {

	// 다짐 목록
	public List<BoardVO> listPromise() throws Exception;

	// 다짐 등록
	public void insPromise(BoardVO boardVO) throws Exception;
}
