package problem;

import java.util.Scanner;

public class BigSmall02 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 1 >>");
		int num1 = sc.nextInt();
		System.out.print("번호 2 >>");
		int num2 = sc.nextInt();
		System.out.print("번호 3 >>");
		int num3 = sc.nextInt();

		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 < num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if (num2 < num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
//		if (num1 < num2) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//
//		if (num1 < num3) {
//			int temp = num3;
//			num3 = num1;
//			num1 = temp;
//		}
//		if (num2 < num3) {
//			int temp = num2;
//			num3 = num2;
//			num2 = temp;
//		} 

		System.out.println(num1 + "," + num2 + "," + num3);
		System.out.println(num1 + ">" + num2 + ">" + num3);
	}

}
