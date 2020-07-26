package com.spring.leeyc.board.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao {
	String selectNow();
}
