package problem.fafatouch;

import java.util.Scanner;

public class FaFaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] mainMenu = new String[5][2];
		mainMenu[0][0] = "파파버거";
		mainMenu[1][0] = "맥치킨버거";
		mainMenu[2][0] = "와퍼버거";
		mainMenu[3][0] = "싸이버거";
		mainMenu[4][0] = "빅맥버거";
		mainMenu[0][1] = "4500";
		mainMenu[1][1] = "5500";
		mainMenu[2][1] = "6000";
		mainMenu[3][1] = "4700";
		mainMenu[4][1] = "5500";
		String[][] sideMenu = new String[5][2];
		sideMenu[0][0] = "감자튀김";
		sideMenu[1][0] = "양념감자";
		sideMenu[2][0] = "치즈스틱";
		sideMenu[3][0] = "맥너겟";
		sideMenu[4][0] = "스위트콘";
		sideMenu[0][1] = "1500";
		sideMenu[1][1] = "2000";
		sideMenu[2][1] = "2000";
		sideMenu[3][1] = "2500";
		sideMenu[4][1] = "1700";
		String[][] drinkMenu = new String[5][2];
		drinkMenu[0][0] = "코카콜라";
		drinkMenu[1][0] = "스프라이트";
		drinkMenu[2][0] = "마운틴듀";
		drinkMenu[3][0] = "오렌지쥬스";
		drinkMenu[4][0] = "초코쉐이크";
		drinkMenu[0][1] = "38000";
		drinkMenu[1][1] = "42000";
		drinkMenu[2][1] = "50000";
		drinkMenu[3][1] = "53000";
		drinkMenu[4][1] = "70000";
//		String[] mainMenu = { "파파버거", "맥치킨버거", "와퍼버거", "싸이버거", "빅맥버거" };
//		String[] sideMenu = { "감자튀김", "양념감자", "치즈스틱", "맥너겟", "스위트콘" };
//		String[] drinkMenu = { "코카콜라", "스프라이트", "마운틴듀", "오렌지쥬스", "초코쉐이크" };
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 파파터치 주문 프로그램 ");
		System.out.println("▒▒ ==메인메뉴==");
		System.out.println("▒▒ 1.파파버거");
		System.out.println("▒▒ 2.맥치킨버거");
		System.out.println("▒▒ 3.와퍼버거");
		System.out.println("▒▒ 4.싸이버거");
		System.out.println("▒▒ 5.빅맥버거");
		System.out.print("▒▒ 번호>> ");
		int mainNum = sc.nextInt();

		System.out.println("▒▒ ==사이드메뉴==");
		System.out.println("▒▒ 1.감자튀김");
		System.out.println("▒▒ 2.양념감자");
		System.out.println("▒▒ 3.치즈스틱");
		System.out.println("▒▒ 4.맥너겟");
		System.out.println("▒▒ 5.스위트콘");
		System.out.print("▒▒ 번호>> ");
		int sideNum = sc.nextInt();
		System.out.println("▒▒ ==음료==");
		System.out.println("▒▒ 1.코카콜라");
		System.out.println("▒▒ 2.스프라이트");
		System.out.println("▒▒ 3.마운틴듀");
		System.out.println("▒▒ 4.오렌지쥬스");
		System.out.println("▒▒ 5.초코쉐이크");
		System.out.print("▒▒ 번호>> ");
		int drinkNum = sc.nextInt();

		int mainPrice = Integer.parseInt(mainMenu[mainNum - 1][1]);
		int sidePrice = Integer.parseInt(sideMenu[mainNum - 1][1]);
		int drinkPrice = Integer.parseInt(drinkMenu[mainNum - 1][1]);
		int totPrice = mainPrice + sidePrice + drinkPrice;

		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 고객님께서 주문하신 메뉴는 ");
		System.out.println("▒▒ " + mainMenu[mainNum - 1][0]);
		System.out.println("▒▒ " + sideMenu[sideNum - 1][0]);
		System.out.println("▒▒ " + drinkMenu[drinkNum - 1][0]);

		System.out.println("▒▒ 입니다. 총 주문가격은" + totPrice + "원 입니다");
		System.out.print("주문하시겠습니까?(y/n)");
		sc.nextLine();
		String order = sc.nextLine();
		// 엔터키 1. 입력 + 2. 한줄개행\n
		// 넥스트 인트는 정수값만 받기 때문에 \n을 받지 않음
		// 넥스트 라인은 다음 한줄 문자열을 받으므로
		// \ n을 입력 받음
		// sc.nextline() 을사용하여 한줄개행 입력을 받아주는 부분 생성
		System.out.println(order);
		if (order.equals("y")) {
			while (true) {
				// 결제금액 입력
				System.out.print("▒▒ 결제금액 >>");
				int money = sc.nextInt();
				if (money < totPrice) {
					System.out.println("금액이 부족합니다.");
					continue;
				}else {
					if(money==totPrice) {
						System.out.println("결제가 완료되었습니다.");
					} else {
						System.out.println((money-totPrice)+"거스름돈 받아가세요");
					}
					break;
				}
			}
		} else {
			// 시스템에 처음으로 돌아가세요.
		}
	}

}
