package problem.bank;

import java.util.Scanner;

public class BMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int code;
		DAO dao = new DAO();
		while (true) {
			System.out.println("은행업무시스템");
			System.out.println("0.생성");
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.조회");
			System.out.println("4.검색");
			System.out.println("5.종료");
			while (true) {
				System.out.print("수행업무 번호>");
				code = sc.nextInt();
				if (0 <= code && code <= 5) {
					break;
				}
			}
			if (code == 0) {
				System.out.println("계좌생성");
				System.out.print("예금주 입력");
				sc.nextLine();
				String bname = sc.nextLine();
				System.out.print("비밀번호 입력");
				String pw = sc.nextLine();
				System.out.print("계좌생성시 입금액");
				int money = sc.nextInt();

				DTO dto = new DTO(bname, pw, money);
				dao.insert(dto);
			} else if (code == 1) {
				System.out.println("입금");
				System.out.print("계좌번호 입력");
				int bno = sc.nextInt();
				System.out.print("입금액 입력");
				int money = sc.nextInt();

				DTO dto = new DTO(bno, money);
				dao.updateI(dto);
			} else if (code == 2) {
				System.out.println("출금");
				System.out.print("계좌번호 입력");
				int bno = sc.nextInt();
				System.out.print("비밀번호 입력");
				sc.nextLine();
				String pw = sc.nextLine();

				int conf = dao.confirm(bno, pw);
				if (conf == 0) {
					System.out.println("계좌번호 또는 비밀번호 오류");
					continue;
				}
				System.out.print("출금액 입력");

				int confmoney = dao.confM(bno);

				int money = sc.nextInt();
				if (confmoney >= money) {
					DTO dto = new DTO(bno, -money);
					dao.updateI(dto);
				} else {
					System.out.println("잔고가 부족합니다.");
					continue;
				}

			} else if (code == 3) {
				System.out.println("전체고객정보 조회");
				dao.select();
			} else if (code == 4) {
				System.out.print("조회할 고객 이름");
				sc.nextLine();
				String bname = sc.nextLine();
				dao.search(bname);
			} else if (code == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
