/*
 * 
 * 		  차량을 입고 또는 출고하는 주차타워 프로그램
 * writer : sj.L
 * date : 2019.12.03 
 */
// car:1965 입고 ->주차타워 주차되어있는 차량번호를 검색해서
//			있다 :중복된차량입니다 다시입력
//			없다 : 입고
//		
package problem;

import java.util.Scanner;

public class EZParkingMain2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Parking park = new Parking();
		while (true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ EZ Parking ver 1.0");
			System.out.print("▒▒ Car Number >>");

			int car = sc.nextInt();
			
			
			
			int code = 0;

			while (true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("1. 차량입고");
				System.out.println("2. 차량출고");
				System.out.println("3. 취소");
				System.out.print("▒▒ 선택>>");

				code = sc.nextInt();

				if (code < 1 || code > 3) {
					System.out.println("▒▒올바른 값을 입력하쇼");

					continue;
				} else {
					break;
				}
			}

			if (code == 1) {
				
				park.inParking(car);
			} else if (code == 2) {
				park.outParking(car);
			} else if (code == 3) {
				car = 0;
				System.out.println("프로그램 초기화면으로 돌아갑니다.");
				continue;
			}
		}

	}

}
