package problem.board;

import java.sql.Date;
import java.util.Scanner;

public class Board {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code;
		BoardDAO bDao = new BoardDAO();
		BoardDTO bDto;
		while (true) {
			System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
			System.out.println("▨▨게시판 읽고 쓰고 삭제하고 수정하는.Ver1.0");
			bDao.select();
			System.out.println("▨▨1. 조회");
			System.out.println("▨▨2. 등록");
			System.out.println("▨▨3. 삭제");
			System.out.println("▨▨4. 수정");
			System.out.println("▨▨5. 검색");
			System.out.println("▨▨6. 정렬");
			System.out.println("▨▨7. 상세");
			System.out.println("▨▨8. 만든이");
			System.out.println("▨▨9. 나가기");
			while (true) {
				System.out.print("▨▨번호>>");
				code = sc.nextInt();
				if (0 < code && code < 10) {
					break;
				} else {
					System.out.println("1~9의 값을 넣어주세요");
					continue;
				}
			}
			if (code == 1) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 조회 ");
				bDao.select();
			} else if (code == 2) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 등록 ");
				System.out.println("▨▨게시글 제목");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("▨▨게시글 내용");
				String content = sc.nextLine();
				System.out.println("▨▨게시글 쓴이 ");
				String writer = sc.nextLine();
				bDto = new BoardDTO(title, content, writer);
				bDao.insert(bDto);
			} else if (code == 3) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 삭제");
				System.out.println("▨▨삭제할 게시글 번호");
				int bno = sc.nextInt();

				bDao.delete(bno);
			} else if (code == 4) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 수정 ");
				System.out.println("▨▨수정할 게시글 번호 ");
				int bno = sc.nextInt();
				System.out.println("▨▨게시글 제목");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.println("▨▨게시글 내용");
				String content = sc.nextLine();
				System.out.println("▨▨게시글 쓴이 ");
				String writer = sc.nextLine();
				bDto = new BoardDTO(bno, title, content, writer);

				bDao.update(bDto);
			} else if (code == 5) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 검색 ");
				sc.nextLine();
				String title = sc.nextLine();
				bDao.search(title);

			} else if (code == 6) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 정렬 ");
				bDao.sort();
			} else if (code == 7) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨게시글 상세 ");
				int bno =sc.nextInt();
				bDao.view(bno);
			} else if (code == 8) {
				System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
				System.out.println("▨▨ Name:Board");
				System.out.println("▨▨ Version 1.0");
				System.out.println("▨▨ Use: JAVA, ORACLE");
				System.out.println("▨▨ Date : 2019.12.17");
				System.out.println("▨▨ By SJLee");
				System.out.println("▨▨ leeseungju92@gmail.com");
				
			} else if (code == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}

	}
}