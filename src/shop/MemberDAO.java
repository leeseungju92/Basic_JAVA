package shop;

public class MemberDAO {
	// 데이터베이스
	String id = "admin";
	String pw = "1234";

	// 회원 유무 판별기능
	int result = 0;

	public int loginCHeck(MemberDTO mDto) {
		if (id.equals(mDto.getId()) && pw.equals(mDto.getPw())) {
			result = 1;
		} else {
			result = 0;

		}

		return result;
	}
}
