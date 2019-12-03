package problem;

import java.util.Scanner;

public class BigSmallEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("번호 1: ");
		int num1 = sc.nextInt();
		System.out.print("번호 3: ");
		int num2 = sc.nextInt();
		System.out.print("번호 2: ");
		int num3 = sc.nextInt();

		while (num1 < num2 || num1 < num3 || num2 < num3) {
			if (num1 < num2) {
				int temp= num1;
				num1 = num2;
				num2 = temp;
			}
			if (num1 < num3) {
				int temp= num1;
				num1 = num3;
				num3 = temp;
			}
			if (num2 < num3) {
				int temp= num2;
				num2 = num3;
				num3 = temp;
			}
		}

		System.out.println(num1 + ">" + num2 + ">" + num3);

	}
}
