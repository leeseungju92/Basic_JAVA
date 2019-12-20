package problem;

import java.util.Scanner;

public class BigSmall01 {
	public static void main(String[] args) {
		// 사용자가 2개의 값을 입력
		// -- 입력 --
		// 번호 1 >> 5
		// 번호 2 >> 7
		// -- 조건 --
		// 번호 1 < 번호 2 보다 작으면
		// 번호 1의 값과 2의 값을 서로 교환하여
		// 번호 1이 항상 큰수를 가지게 만든다.
		// 번호 1 > 번호 2
		
		
		// 상수형 3과 4를 만들어서 1과 2의 값을 저장해놓은뒤
		// 조건문 안이 참이 된경우
		// 1의 값에 상수형 3
		// 2의 값에 상수형 4
//		Scanner sc = new Scanner(System.in);
//		System.out.print("번호 1 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("번호 2 >> ");
//		int num2 = sc.nextInt();
//		
//		final int num3 = num1;
//		final int num4 = num2;
//		
//		if(num1<num2) {				
//			num1 = num4;
//			num2 = num3;
//		}
//
//		System.out.println(num1 + ">" + num2);
//		// System.out.println(num1 + "," + num2);
//		
		
		// 정수형 temp 변수 선언 및 초기화
		// 1 과 2의 값이 조건문 안에서 참일경우
		// 1의 값을 temp에 대입
		// 2의 값을 1에 대입
		// 3의 값을 2에 대입
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 1 >> ");
		int num1 = sc.nextInt();
		System.out.print("번호 2 >> ");
		int num2 = sc.nextInt();
		int temp = 0;
				
		if(num1<num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + ">" + num2);
	}
}
