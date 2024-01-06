package Vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 지역 댓글 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Reply implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 댓글 번호. */
	private Integer rno;

	/**  댓글 내용. */
	private String rcontent;

	/** 댓글 작성일. */
	private Date rrdate;

	/** 회원정보. */
	private Member member;

	/** 게시글. */
	private Board board;

	/**
	 * 생성자.
	 */
	public Reply() {
	}

	/**
	 * 댓글 번호을 설정합니다..
	 * 
	 * @param rno
	 *            댓글 번호
	 */
	public void setRno(Integer rno) {
		this.rno = rno;
	}

	/**
	 * 댓글 번호을 가져옵니다..
	 * 
	 * @return 댓글 번호
	 */
	public Integer getRno() {
		return this.rno;
	}

	/**
	 *  댓글 내용을 설정합니다..
	 * 
	 * @param rcontent
	 *             댓글 내용
	 */
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	/**
	 *  댓글 내용을 가져옵니다..
	 * 
	 * @return  댓글 내용
	 */
	public String getRcontent() {
		return this.rcontent;
	}

	/**
	 * 댓글 작성일을 설정합니다..
	 * 
	 * @param rrdate
	 *            댓글 작성일
	 */
	public void setRrdate(Date rrdate) {
		this.rrdate = rrdate;
	}

	/**
	 * 댓글 작성일을 가져옵니다..
	 * 
	 * @return 댓글 작성일
	 */
	public Date getRrdate() {
		return this.rrdate;
	}

	/**
	 * 회원정보을 설정합니다..
	 * 
	 * @param member
	 *            회원정보
	 */
	public void setMember(Member member) {
		this.member = member;
	}

	/**
	 * 회원정보을 가져옵니다..
	 * 
	 * @return 회원정보
	 */
	public Member getMember() {
		return this.member;
	}

	/**
	 * 게시글을 설정합니다..
	 * 
	 * @param board
	 *            게시글
	 */
	public void setBoard(Board board) {
		this.board = board;
	}

	/**
	 * 게시글을 가져옵니다..
	 * 
	 * @return 게시글
	 */
	public Board getBoard() {
		return this.board;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rno == null) ? 0 : rno.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Reply other = (Reply) obj;
		if (rno == null) {
			if (other.rno != null) {
				return false;
			}
		} else if (!rno.equals(other.rno)) {
			return false;
		}
		return true;
	}

}