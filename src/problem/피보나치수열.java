package problem;

import java.util.Scanner;

import chapter05.SingleTonTest;

public class 피보나치수열 {
	/*
	 * 피보나치수열: 키보드로 숫자값 =수열 depth 첫번째항과 두번째 항 더해서 세번째항 ex 4입력 > 치환
	 */
	public static void main(String[] args) {
		System.out.print("피보나치수열");
		Scanner sc = new Scanner(System.in);
		int 입력 = sc.nextInt()-2;

		int sum = 0;
		int first = 1;
		int end = 1;
		int 임시 = 0;
		int 답 = 0;
//		while(입력 == i의크기) {
		for (int i = 1; i <= 입력; i++) {
			sum = first + end;
			first = end;
			end = sum;
			답 += sum;
		System.out.println(sum);
		}
		System.out.println(답+2);
			
//			int num1 = 1+ 1
//			int num2 = num1+1
//			int num3 = num1 + num2;
//			int num4 = num2+ num3
//			int num5 = num3+ num4;
//			int i번째항 =int i-2번째항 +int i-1번째항;
//			피보나치 수열의 n번째항 = n-2번째항 +n-1번째항;	
//			피보나치수열[int i] = 피보나치수열[i-2] + 피보나치수열[i-1];
//		for(i=1 ;i<=입력;i++) {
//			int num[i] = 0;
//			num [i] = num[i-2] + num[i-1];

	}
}
