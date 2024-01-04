package tableVo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 장비게시판 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Gear implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 게시글 번호. */
	private Integer grno;

	/** 게시글 제목. */
	private String grtitle;

	/** 게시글 내용. */
	private String grcontent;

	/** 게시글 등록일. */
	private Date grrdate;

	/** 게시글 조회수. */
	private Integer grhit;

	/** 게시글 장비 종류. */
	private String grtype;

	/** 회원정보. */
	private Member member;

	/** 장비게시판 첨부파일 목록. */
	private Set<GearFile> gearFileSet;

	/** 장비게시판 댓글 목록. */
	private Set<GearReply> gearReplySet;

	/**
	 * 생성자.
	 */
	public Gear() {
		this.gearFileSet = new HashSet<GearFile>();
		this.gearReplySet = new HashSet<GearReply>();
	}

	/**
	 * 게시글 번호을 설정합니다..
	 * 
	 * @param grno
	 *            게시글 번호
	 */
	public void setGrno(Integer grno) {
		this.grno = grno;
	}

	/**
	 * 게시글 번호을 가져옵니다..
	 * 
	 * @return 게시글 번호
	 */
	public Integer getGrno() {
		return this.grno;
	}

	/**
	 * 게시글 제목을 설정합니다..
	 * 
	 * @param grtitle
	 *            게시글 제목
	 */
	public void setGrtitle(String grtitle) {
		this.grtitle = grtitle;
	}

	/**
	 * 게시글 제목을 가져옵니다..
	 * 
	 * @return 게시글 제목
	 */
	public String getGrtitle() {
		return this.grtitle;
	}

	/**
	 * 게시글 내용을 설정합니다..
	 * 
	 * @param grcontent
	 *            게시글 내용
	 */
	public void setGrcontent(String grcontent) {
		this.grcontent = grcontent;
	}

	/**
	 * 게시글 내용을 가져옵니다..
	 * 
	 * @return 게시글 내용
	 */
	public String getGrcontent() {
		return this.grcontent;
	}

	/**
	 * 게시글 등록일을 설정합니다..
	 * 
	 * @param grrdate
	 *            게시글 등록일
	 */
	public void setGrrdate(Date grrdate) {
		this.grrdate = grrdate;
	}

	/**
	 * 게시글 등록일을 가져옵니다..
	 * 
	 * @return 게시글 등록일
	 */
	public Date getGrrdate() {
		return this.grrdate;
	}

	/**
	 * 게시글 조회수을 설정합니다..
	 * 
	 * @param grhit
	 *            게시글 조회수
	 */
	public void setGrhit(Integer grhit) {
		this.grhit = grhit;
	}

	/**
	 * 게시글 조회수을 가져옵니다..
	 * 
	 * @return 게시글 조회수
	 */
	public Integer getGrhit() {
		return this.grhit;
	}

	/**
	 * 게시글 장비 종류을 설정합니다..
	 * 
	 * @param grtype
	 *            게시글 장비 종류
	 */
	public void setGrtype(String grtype) {
		this.grtype = grtype;
	}

	/**
	 * 게시글 장비 종류을 가져옵니다..
	 * 
	 * @return 게시글 장비 종류
	 */
	public String getGrtype() {
		return this.grtype;
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
	 * 장비게시판 첨부파일 목록을 설정합니다..
	 * 
	 * @param gearFileSet
	 *            장비게시판 첨부파일 목록
	 */
	public void setGearFileSet(Set<GearFile> gearFileSet) {
		this.gearFileSet = gearFileSet;
	}

	/**
	 * 장비게시판 첨부파일를 추가합니다..
	 * 
	 * @param gearFile
	 *            장비게시판 첨부파일
	 */
	public void addGearFile(GearFile gearFile) {
		this.gearFileSet.add(gearFile);
	}

	/**
	 * 장비게시판 첨부파일 목록을 가져옵니다..
	 * 
	 * @return 장비게시판 첨부파일 목록
	 */
	public Set<GearFile> getGearFileSet() {
		return this.gearFileSet;
	}

	/**
	 * 장비게시판 댓글 목록을 설정합니다..
	 * 
	 * @param gearReplySet
	 *            장비게시판 댓글 목록
	 */
	public void setGearReplySet(Set<GearReply> gearReplySet) {
		this.gearReplySet = gearReplySet;
	}

	/**
	 * 장비게시판 댓글를 추가합니다..
	 * 
	 * @param gearReply
	 *            장비게시판 댓글
	 */
	public void addGearReply(GearReply gearReply) {
		this.gearReplySet.add(gearReply);
	}

	/**
	 * 장비게시판 댓글 목록을 가져옵니다..
	 * 
	 * @return 장비게시판 댓글 목록
	 */
	public Set<GearReply> getGearReplySet() {
		return this.gearReplySet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grno == null) ? 0 : grno.hashCode());
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
		Gear other = (Gear) obj;
		if (grno == null) {
			if (other.grno != null) {
				return false;
			}
		} else if (!grno.equals(other.grno)) {
			return false;
		}
		return true;
	}

}
