package tableVo;

import java.io.Serializable;
import java.util.Date;

/**
 * 장비게시판 댓글 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class GearReply implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 댓글 번호. */
	private Integer grrno;

	/** 댓글 내용. */
	private String grcontent;

	/** 댓글 작성일. */
	private Date grrdate;

	/** 회원정보. */
	private Member member;

	/** 장비게시판. */
	private Gear gear;

	/**
	 * 생성자.
	 */
	public GearReply() {
	}

	/**
	 * 댓글 번호을 설정합니다..
	 * 
	 * @param grrno
	 *            댓글 번호
	 */
	public void setGrrno(Integer grrno) {
		this.grrno = grrno;
	}

	/**
	 * 댓글 번호을 가져옵니다..
	 * 
	 * @return 댓글 번호
	 */
	public Integer getGrrno() {
		return this.grrno;
	}

	/**
	 * 댓글 내용을 설정합니다..
	 * 
	 * @param grcontent
	 *            댓글 내용
	 */
	public void setGrcontent(String grcontent) {
		this.grcontent = grcontent;
	}

	/**
	 * 댓글 내용을 가져옵니다..
	 * 
	 * @return 댓글 내용
	 */
	public String getGrcontent() {
		return this.grcontent;
	}

	/**
	 * 댓글 작성일을 설정합니다..
	 * 
	 * @param grrdate
	 *            댓글 작성일
	 */
	public void setGrrdate(Date grrdate) {
		this.grrdate = grrdate;
	}

	/**
	 * 댓글 작성일을 가져옵니다..
	 * 
	 * @return 댓글 작성일
	 */
	public Date getGrrdate() {
		return this.grrdate;
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
	 * 장비게시판을 설정합니다..
	 * 
	 * @param gear
	 *            장비게시판
	 */
	public void setGear(Gear gear) {
		this.gear = gear;
	}

	/**
	 * 장비게시판을 가져옵니다..
	 * 
	 * @return 장비게시판
	 */
	public Gear getGear() {
		return this.gear;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grrno == null) ? 0 : grrno.hashCode());
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
		GearReply other = (GearReply) obj;
		if (grrno == null) {
			if (other.grrno != null) {
				return false;
			}
		} else if (!grrno.equals(other.grrno)) {
			return false;
		}
		return true;
	}

}
