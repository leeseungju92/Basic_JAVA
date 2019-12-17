package problem.dotorybook;

import java.util.Scanner;

public class DotoryBookMain {
	public static void main(String[] args) {
		// 1.드라이버호출
		// 2.커넥션 생성
		// 3.쿼리문 작성하고
		// 4.쿼리문 실행하고
		// 5.클로즈
		int code;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
			System.out.println("◇◆◇◆도토리 서점 관리시스템 Ver1.2");
			System.out.println("◇◆◇◆1.도서등록");
			System.out.println("◇◆◇◆2.도서수정");
			System.out.println("◇◆◇◆3.도서삭제");
			System.out.println("◇◆◇◆4.도서조회");
			System.out.println("◇◆◇◆5.도서검색");
			System.out.println("◇◆◇◆6.만든이");
			System.out.println("◇◆◇◆7.프로그램종료");
			while (true) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.print("◇◆◇◆번호>>");
				code = sc.nextInt();
				if (0 < code && code < 8) {
					break;

				} else {
					System.out.println("1~7의값을 입력하시오");
					continue;
				}
			}
			DotoryBookDAO bDao = new DotoryBookDAO();
			if (code == 1) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.println("◇◆도서등록");
				System.out.print("◇◆◇◆도서명>>");
				sc.nextLine();
				String bname = sc.nextLine();
				System.out.print("◇◆◇◆가격>>");
				int price = sc.nextInt();
				System.out.print("◇◆◇◆출판사>>");
				sc.nextLine();
				String company = sc.nextLine();
				System.out.print("◇◆◇◆저자>>");
				String writer = sc.nextLine();

				DotoryBookDTO bDto = new DotoryBookDTO(bname, price, company, writer);

				bDao.insert(bDto);

			} else if (code == 2) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.println("◇◆도서수정");
				System.out.print("◇◆◇◆도서번호>>");
				sc.nextLine();
				String bno = sc.nextLine();
				System.out.print("◇◆◇◆도서명>>");
				String bname = sc.nextLine();
				System.out.print("◇◆◇◆도서가격>>");
				int price = sc.nextInt();
				System.out.print("◇◆◇◆출판사>>");
				sc.nextLine();
				String company = sc.nextLine();
				System.out.print("◇◆◇◆저자>>");
				String writer = sc.nextLine();

				DotoryBookDTO bDto = new DotoryBookDTO(bno, bname, price, company, writer, null);

				bDao.update(bDto);
			} else if (code == 3) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.println("◇◆도서삭제");
				System.out.print("◇◆◇◆도서번호>>");
				sc.nextLine();
				String bno = sc.nextLine();

				bDao.delete(bno);
			} else if (code == 4) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.println("◇◆현재 판매중인 도서목록을 출력합니다.");
				bDao.select();
			} else if (code == 5) {
				System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
				System.out.println("◇◆현재 판매중인 도서목록을 검색합니다.");
				System.out.print("◇◆책이름>>");
				sc.nextLine();
				String bname = sc.nextLine();
				bDao.search(bname);
			} else if (code == 6) {
				bDao.writer();
			} else if (code == 7) {
				System.exit(0);
			}
		}

	}
}
