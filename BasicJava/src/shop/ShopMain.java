package shop;

import java.util.Scanner;

public class ShopMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ Shooooop ver 1.5");
		System.out.println("▒▒ 1. 회원가입");
		System.out.println("▒▒ 2. 회원수정");
		System.out.println("▒▒ 3. 회원탈퇴");
		while (true) {
			System.out.print("▒▒ 번호 >> ");
			num = sc.nextInt();
			if (num < 1 || num > 3) {
				System.out.println("1~3의 값을 입력하시오");
				continue;
			} else {
				break;
			}
		}
		Member mem = new Member();
		String val = "";
		if (num == 1) {
			String id = "cholong";
			String pw = "1234";
			String name = "초롱";
			val = mem.memInsert(id,pw,name);
		} else if (num == 2) {
			String id = "cholong";
			String pw = "1234";
			String name = "초롱";
			val = mem.memUpdate(id,pw,name);

		} else if (num == 3) {
			String id = "cholong";
			String pw = "1234";
			String name = "초롱";
			val = mem.memDelete(id,pw,name);
		}
		if (val.equals("success")) {
			System.out.println("위의 값 성공");
		} else {
			System.out.println("위의 값 실패");
		}

		int a=700/850*100;
		System.out.println(a);
	} 

}
