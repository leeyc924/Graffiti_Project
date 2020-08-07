package com.spring.leeyc.board.vo;

import java.util.Date;

/**
 * promise_note 테이블 VO
 * @author leeyc
 */
public class BoardVO {
	private Integer seqno;	// 일련번호
	private String promise;	// 다짐
	private Date ins_dt;	// 등록일
	private Date upt_dt;	// 수정일

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getPromise() {
		return promise;
	}

	public void setPromise(String promise) {
		this.promise = promise;
	}

	public Date getIns_dt() {
		return ins_dt;
	}

	public void setIns_dt(Date ins_dt) {
		this.ins_dt = ins_dt;
	}

	public Date getUpt_dt() {
		return upt_dt;
	}

	public void setUpt_dt(Date upt_dt) {
		this.upt_dt = upt_dt;
	}
}
