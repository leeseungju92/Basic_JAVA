package GuckBob;

import java.util.Scanner;

public class GugBobMain {

	public static void main(String[] args) {
		// 0. 주문하신 메뉴는 ~ 입니다./ 총 결제금액은 ~ 입니다. / 결제하시겠습니까?
		// 1. 메인메뉴 3가지 이름/ 가격
		// 2. 사이드메뉴 3가지 이름/ 가격
		// 3. 음료 3가지 이름/ 가격
		// 5. 결제금액 합
		// 6. 결제 yes or no / 초과지급/ 알맞게 지급/ 적게 지급 / 결제취소 /
		String[][] mainMenu = new String[3][2];
		mainMenu[0][0] = "머리국밥";
		mainMenu[1][0] = "순대국밥";
		mainMenu[2][0] = "모듬국밥";
		mainMenu[0][1] = "7000";
		mainMenu[1][1] = "7500";
		mainMenu[2][1] = "8000";

		String[][] sideMenu = new String[3][2];
		sideMenu[0][0] = "수육";
		sideMenu[1][0] = "순대";
		sideMenu[2][0] = "모듬수육";
		sideMenu[0][1] = "15000";
		sideMenu[1][1] = "4000";
		sideMenu[2][1] = "20000";

		String[][] drinkMenu = new String[3][2];
		drinkMenu[0][0] = "소주";
		drinkMenu[1][0] = "맥주";
		drinkMenu[2][0] = "콜라";
		drinkMenu[0][1] = "4000";
		drinkMenu[1][1] = "4500";
		drinkMenu[2][1] = "1300";

		while (true) {

			Scanner sc = new Scanner(System.in);
			int mainNum;
			int sideNum;
			int drinkNum;
			while (true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒국밥 주문 프로그램");
				System.out.println("▒▒국밥을 선택해 주세요");
				System.out.println("▒▒1. 머리국밥");
				System.out.println("▒▒2. 순대국밥");
				System.out.println("▒▒3. 모듬국밥");
				System.out.print("▒▒번호>>");

				mainNum = sc.nextInt();
				if (mainNum < 1 || mainNum > 3) {
					System.out.println("번호를 다시 입력해주세요");
					continue;
				} else {
					break;
				}

			}
			while (true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒사이드를 선택해 주세요");
				System.out.println("▒▒1. 수육");
				System.out.println("▒▒2. 순대");
				System.out.println("▒▒3. 모듬수육");
				System.out.print("▒▒번호>>");

				sideNum = sc.nextInt();
				if (sideNum < 1 || sideNum > 3) {
					System.out.println("번호를 다시 입력해주세요");
					continue;
				} else {
					break;
				}

			}
			while (true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒음료를 선택해 주세요");
				System.out.println("▒▒1. 소주");
				System.out.println("▒▒2. 맥주");
				System.out.println("▒▒3. 콜라");
				System.out.print("▒▒번호>>");

				drinkNum = sc.nextInt();
				if (drinkNum < 1 || drinkNum > 3) {
					System.out.println("번호를 다시 입력해주세요");
					continue;
				} else {
					break;
				}

			}
			int mainCost = 0;
			int sideCost = 0;
			int drinkCost = 0;
			int total = 0;

			mainCost = Integer.parseInt(sideMenu[sideNum - 1][1]);
			sideCost = Integer.parseInt(sideMenu[sideNum - 1][1]);
			drinkCost = Integer.parseInt(drinkMenu[drinkNum - 1][1]);
			total = mainCost + sideCost + drinkCost;
//			Integer.drinkMenu[drinkNum-1][1];

			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒주문서");
			System.out.println("▒▒국밥종류" + mainMenu[mainNum - 1][0]);
			System.out.println("▒▒사이드종류" + sideMenu[sideNum - 1][0]);
			System.out.println("▒▒음료 종류" + drinkMenu[drinkNum - 1][0]);
			System.out.println("▒▒총 주문하신 금액은" + total);
			System.out.print("결제하시겠습니까? y/n");
			while (true) {
				String order = sc.nextLine();

				if (order.equals("y")) {
					System.out.println("돈을 넣어주세요");
					int money = sc.nextInt();

					if (money > total) {
						System.out.println("거스름돈" + (money - total) + "받아가");
						break;
					} else if (money == total) {
						System.out.println("결제완료");
						break;
					} else {
						System.out.println("돈부족해");
						continue;
					}
//
//
				} else if (order.equals("n")) {
					System.out.println("결제가 취소 되었습니다. 처음으로 돌아갑니다.");
					break;
				} else {
					System.out.println("y,n 소문자를 입력해주세요.");
					continue;
				}

			}

			continue;
		}

	}

}
