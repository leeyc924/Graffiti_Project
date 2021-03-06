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
	
	// 다짐 상세 조회
	public BoardVO readPromise(int seqno) throws Exception;

	// 다짐 등록
	public void insPromise(BoardVO boardVO) throws Exception;

	// 다짐 삭제
	public void delPromise(int seqno) throws Exception;
	
	// 다짐 수정
	public void uptPromise(BoardVO boardVO) throws Exception;
}
