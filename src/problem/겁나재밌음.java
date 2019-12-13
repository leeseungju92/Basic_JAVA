package problem;

import java.util.Scanner;

public class 겁나재밌음 {
	public static void main(String[] args) {

		System.out.print("입력>>");
		Scanner sc = new Scanner(System.in);
		int 입력 = sc.nextInt();
		
		int 결과 = 입력/100+입력%10+((입력%100-입력%10)/10);
		
		

		System.out.println(결과
				);

		// 첫번째 숫자 받고 / 두번째 숫자 받고 / 세번째 숫자 받고 합

	}
}
