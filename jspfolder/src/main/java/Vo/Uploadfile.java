package Vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 게시글 첨부파일 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Uploadfile implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 첨부파일 번호. */
	private Integer fno;

	/** 첨부파일 실제이름. */
	private String frealnm;

	/** 첨부파일 원본이름. */
	private String foriginnm;

	/** 첨부파일 등록일. */
	private Date frdate;

	/** 게시글. */
	private Board board;

	/**
	 * 생성자.
	 */
	public Uploadfile() {
	}

	/**
	 * 첨부파일 번호을 설정합니다..
	 * 
	 * @param fno
	 *            첨부파일 번호
	 */
	public void setFno(Integer fno) {
		this.fno = fno;
	}

	/**
	 * 첨부파일 번호을 가져옵니다..
	 * 
	 * @return 첨부파일 번호
	 */
	public Integer getFno() {
		return this.fno;
	}

	/**
	 * 첨부파일 실제이름을 설정합니다..
	 * 
	 * @param frealnm
	 *            첨부파일 실제이름
	 */
	public void setFrealnm(String frealnm) {
		this.frealnm = frealnm;
	}

	/**
	 * 첨부파일 실제이름을 가져옵니다..
	 * 
	 * @return 첨부파일 실제이름
	 */
	public String getFrealnm() {
		return this.frealnm;
	}

	/**
	 * 첨부파일 원본이름을 설정합니다..
	 * 
	 * @param foriginnm
	 *            첨부파일 원본이름
	 */
	public void setForiginnm(String foriginnm) {
		this.foriginnm = foriginnm;
	}

	/**
	 * 첨부파일 원본이름을 가져옵니다..
	 * 
	 * @return 첨부파일 원본이름
	 */
	public String getForiginnm() {
		return this.foriginnm;
	}

	/**
	 * 첨부파일 등록일을 설정합니다..
	 * 
	 * @param frdate
	 *            첨부파일 등록일
	 */
	public void setFrdate(Date frdate) {
		this.frdate = frdate;
	}

	/**
	 * 첨부파일 등록일을 가져옵니다..
	 * 
	 * @return 첨부파일 등록일
	 */
	public Date getFrdate() {
		return this.frdate;
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
		result = prime * result + ((fno == null) ? 0 : fno.hashCode());
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
		Uploadfile other = (Uploadfile) obj;
		if (fno == null) {
			if (other.fno != null) {
				return false;
			}
		} else if (!fno.equals(other.fno)) {
			return false;
		}
		return true;
	}

}