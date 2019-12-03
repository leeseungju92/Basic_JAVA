package gugudan;

import java.util.Scanner;

public class MethodV1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void dan(int num1, int num2) {
		for (int dan = num1; dan <= num2; dan++) {
			System.out.printf("%d 단\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
	}

	public void dan(int num) {
		int dan = num;

		System.out.printf("%d 단\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}

	}

	public void dan() {
		System.out.println("매개변수에 정수값 하나 이상을 입력하시오");
	}
}
