package com.spring.leeyc.board.vo;

public class BoardVO {
	private Integer seqno;
	private String promise;
	private String ins_dt;
	private String upt_dt;

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

	public String getIns_dt() {
		return ins_dt;
	}

	public void setIns_dt(String ins_dt) {
		this.ins_dt = ins_dt;
	}

	public String getUps_dt() {
		return upt_dt;
	}

	public void setUps_dt(String upt_dt) {
		this.upt_dt = upt_dt;
	}
}
