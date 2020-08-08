package com.spring.leeyc.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.leeyc.board.dao.BoardDao;
import com.spring.leeyc.board.vo.BoardVO;

/**
 * 다짐 service
 * @author leeyc
 */

@Service
public class BoardServiceimpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	// 다짐 목록
	@Override
	public List<BoardVO> listPromise() throws Exception {
		return boardDao.listPromise();
	}
	
	// 다짐 상세 조회
	@Override
	public List<BoardVO> readPromise(int seqno) throws Exception {
		return boardDao.readPromise(seqno);
	}
	// 다짐 등록
	@Override
	public void insPromise(BoardVO boardVO) throws Exception {
		boardDao.insPromise(boardVO);
	}

}
