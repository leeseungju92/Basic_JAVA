package problem;

import java.util.Scanner;

public class 버블정렬 {
	static int[] data = new int[5];
	static Scanner sc = new Scanner(System.in);
	static int num = 0;
	public static void main(String[] args) {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒5개의 입력수중 큰수가 가장뒤로가는");
		inputData();
		arrNum();
	}
		public static void inputData() {
		for (int i = 0; i < data.length; i++) {
			while (true) {
				System.out.print("▒▒" + (i + 1) + "번째 배열의 숫자");
				num= sc.nextInt();
				if (dupNum(num)) {
					break;
				data[i] = num;	
				}
				
			}

		}
	}

	public static void arrNum() {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(data[i]);
		}
	}

	public static boolean dupNum(int um) {
		boolean dup = true;
		for (int i = 0; i < data.length; i++) {
			if (um == data[i]) {
				dup = false;
			}
		}
		return dup;
	}
}
