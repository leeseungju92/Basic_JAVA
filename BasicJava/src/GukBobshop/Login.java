package GukBobshop;

import java.util.Scanner;

public class Login {
	public static void main(String[]args) {
		System.out.println("로그인");
		Scanner sc1 = new Scanner(System.in);

		System.out.print("아이디입력");
		String id = sc1.nextLine();

		System.out.print("비번 적립");
		String pw = sc1.nextLine();
		

		GukBobDAO dao = new GukBobDAO();
		GukBobDTO dto = new GukBobDTO(id, pw);

		int result = dao.point(dto);

		if (result == 0) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인성공");
		}
	}

}
