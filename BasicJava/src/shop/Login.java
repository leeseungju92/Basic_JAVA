package shop;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. view 단
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒==LOGIN SYSTEM==");
		System.out.print("▒▒ id >> ");
		String id = sc.nextLine();
		System.out.print("▒▒ pw >> ");
		String pw = sc.nextLine();
		
		//System.out.println(id + " , " + pw);
		
		// 2. 로그인 기능을 구현 (business logic)
		// id , pw -> 데이터 베이스에서 사용자가 입력한
		//				id, pw가 같은 유저가 있는지 확인
		//				-> yes or no
		//				-> yes : 환영합니다 회원님~
		//				-> no : id or pw가 틀렸습니다.
		
		// 로그인시 회원 판별기능을 사용하기 위한 객체 생성
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = new MemberDTO(id, pw);
		int result = mDao.loginCHeck(mDto);
		if(result==0) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
			
		}
		
				
	}

}
