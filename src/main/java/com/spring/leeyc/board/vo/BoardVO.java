package com.spring.leeyc.board.vo;

public class BoardVO {
	private Integer seqno;
	private String promise;
	private String ins_dt;
	private String ups_dt;

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
		return ups_dt;
	}

	public void setUps_dt(String ups_dt) {
		this.ups_dt = ups_dt;
	}
}
