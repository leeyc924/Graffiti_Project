package com.spring.leeyc.board.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.spring.leeyc.board.vo.BoardVO;

/**
 * 다짐 Dao
 * @author leeyc
 */
@Repository
public interface BoardDao {

	// 다짐 목록
	public List<BoardVO> listPromise() throws Exception;
	
	// 다짐 상세 조회
	public BoardVO readPromise(int seqno) throws Exception;

	// 다짐 등록
	public void insPromise(BoardVO boradVO) throws Exception;
	
	// 다짐 삭제
	public void delPromise(int seqno) throws Exception;
	
	// 다짐 등록
	public void uptPromise(BoardVO boradVO) throws Exception;
}
