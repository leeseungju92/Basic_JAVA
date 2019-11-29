package problem;

import java.util.Scanner;

public class ReversePrint {
	public static void main(String[] args) {

		/*
		 * 1. 사용자가 임의의 정수를 입력 2. 사용자가 입력한 정수를 역으로 1까지 출력 출력 예제 입력 >> 5 5 4 3 2 1
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.print("▒임의의정수입력>");
//		int num = sc.nextInt();
//		for (int i = num; i > 0; i--) {
//			System.out.println(i);
//		}

		Scanner sc = new Scanner(System.in);
		int j = 0;
		//실수값 입력시 오류해결 ? 
		while (true) {
			System.out.print("▒▒ 임의의 정수 역으로 출력 >> ");
			j = sc.nextInt();
			if (j <= 0) {
				System.out.println("정수 값을 입력하시오");
				continue;
			} else {
				break;
			}

		}
		for (int i = j; i > 0; i--) {
			System.out.println(i);
		}
	}
}
