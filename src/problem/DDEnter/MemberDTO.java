package problem.DDEnter;

import java.sql.Date;

public class MemberDTO {
	// 1.변수 디비테이블 참조
	private String ano;
	public MemberDTO(String ano, String aname, String major, String groupyn, String groupnm, int sal) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.major = major;
		this.groupyn = groupyn;
		this.groupnm = groupnm;
		this.sal = sal;
	}

	private String aname;
	private String major;
	private String groupyn;
	private String groupnm;
	private int sal;
	private Date regdate;

	// 2.생성자 (default, 전역변수all)
	public MemberDTO() {
	}

	public MemberDTO(String ano, String aname, String major, String groupyn, String groupnm, int sal, Date regdate) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.major = major;
		this.groupyn = groupyn;
		this.groupnm = groupnm;
		this.sal = sal;
		this.regdate = regdate;
	}

	public MemberDTO(String aname, String major, String groupyn, String groupnm, int sal) {
		super();
		this.aname = aname;
		this.major = major;
		this.groupyn = groupyn;
		this.groupnm = groupnm;
		this.sal = sal;
	}

	// 3. 게터세터

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGroupyn() {
		return groupyn;
	}

	public void setGroupyn(String groupyn) {
		this.groupyn = groupyn;
	}

	public String getGroupnm() {
		return groupnm;
	}

	public void setGroupnm(String groupnm) {
		this.groupnm = groupnm;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	// 4. 투스트링

	@Override
	public String toString() {
		return "MemberDTO [ano=" + ano + ", aname=" + aname + ", major=" + major + ", groupyn=" + groupyn + ", groupnm="
				+ groupnm + ", sal=" + sal + ", regdate=" + regdate + "]";
	}
}
