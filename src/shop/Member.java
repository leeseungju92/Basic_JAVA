package shop;

public class Member {

	// 회원가입
	public String memInsert(String id, String pw, String name) {
		System.out.printf("%s , %s , %s 로 회원가입\n", id, pw, name);
		String status1 = "success";
		return status1;
	}

	// 회원수정
	public String memUpdate(String id, String pw, String name) {
		System.out.printf("%s , %s , %s 로 회원정보\n", id, pw, name);
		String status = "success";
		return status;
	}

	// 회원탈퇴
	public String memDelete(String id, String pw, String name) {
	System.out.printf("%s , %s , %s 로 회원탈퇴\n",id,pw,name);
	String status = "success";
	return status;
	}
}
