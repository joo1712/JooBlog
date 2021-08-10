package com.kr.co.board.DTO;

import java.util.Date;

public class Board {
	/** 시퀀스   */
	private String idx;
	/** 제목   */
	private String title;
	/** 내용   */
	private String content;
	/** 작성자   */
	private String writer;
	/** 조회수   */
	private String viewCnt;
	/** 공지여부   */
	private String noticeYn;
	/** 비밀여부   */
	private String  secretYn;
	/** 삭제여부   */
	private String deleteYn;
	/** 등록일시   */
	private Date insertTime;
	/** 수정일시   */
	private Date updateTime;
	/** 삭제일시   */
	private Date deleteTime;
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(String viewCnt) {
		this.viewCnt = viewCnt;
	}
	public String getNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}
	public String getSecretYn() {
		return secretYn;
	}
	public void setSecretYn(String secretYn) {
		this.secretYn = secretYn;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getDeleteTime() {
		return deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	
}