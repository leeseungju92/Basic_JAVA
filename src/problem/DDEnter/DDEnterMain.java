package problem.DDEnter;

import java.util.Scanner;

public class DDEnterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		while (true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒더블디 엔터 관리 시스템");
			System.out.println("▒▒1.아티스트 등록");
			System.out.println("▒▒2.아티스트 수정");
			System.out.println("▒▒3.아티스트 해지");
			System.out.println("▒▒4.아티스트 조회");
			System.out.println("▒▒5.아티스트 검색");
			System.out.println("▒▒6.프로그램 종료");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			while (true) {
				System.out.print("번호>>");
				code = sc.nextInt();
				if (1 <= code && code <= 6) {
					break;
				} else {
					System.out.println("1~6만입력해라");
				}
			}
			MemberDAO mDao = new MemberDAO();
			// 사용자가 1~6까지 입력하기 전까지 계속 번호를 입력하게
			if (code == 1) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒계약 할 아티스트 정보 입력");

				System.out.print("▒▒이름>>");
				sc.nextLine();
				String aname = sc.nextLine();
				System.out.print("▒▒분야>>");
				String major = sc.nextLine();
				System.out.print("▒▒그룹여부>>");
				String groupyn = sc.nextLine();
				System.out.print("▒▒그룹이름>>");
				String groupnm = sc.nextLine();
				System.out.print("▒▒연봉>>");
				int sal = sc.nextInt();

				MemberDTO mDto = new MemberDTO(aname, major, groupyn, groupnm, sal);
				mDao.memInsert(mDto);
			} else if (code == 2) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒수정 할 아티스트 번호 입력");
				System.out.print("▒▒번호>>");
				sc.nextLine();
				String ano = sc.nextLine();
				
				System.out.print("▒▒이름>>");
				String aname = sc.nextLine();
				System.out.print("▒▒분야>>");
				String major = sc.nextLine();
				System.out.print("▒▒그룹여부>>");
				String groupyn = sc.nextLine();
				System.out.print("▒▒그룹이름>>");
				String groupnm = sc.nextLine();
				System.out.print("▒▒연봉>>");
				int sal = sc.nextInt();

				MemberDTO mDto = new MemberDTO(ano,aname, major, groupyn, groupnm, sal);
				mDao.memUpdate(mDto);
			} else if (code == 3) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒계약 해지할 아티스트 번호 입력");
				System.out.print("▒▒번호>>");
				sc.nextLine();
				String ano = sc.nextLine();
				mDao.memDelete(ano);
			} else if (code == 4) {
				mDao.memSelect();
			} else if (code == 5) {
				mDao.memSearch();
			} else if (code == 6) {
				System.out.println("<프로그램종료>");
				System.exit(0);
			}
			
		}
	}

}
