package problem;

import java.util.Scanner;

public class Bubble {
	static int[] data = new int[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		
		System.out.println("임의의 수 5개를 입력하세요");
		for (int i = 0; i < data.length; i++) {
			while (true) {
				System.out.print((i + 1) + "번째 수 >> ");
				int num = sc.nextInt();
				if (duplicateNum(num)) {
					data[i] = num;
					break;
				} else {
					System.out.println("동일한 값이 존재합니다. 값을 다시 입력하세요");
				}
			}
		}
		System.out.print("입력받은 수는 >> ");
		viewData();
		System.out.println();
		
		
		
//		for (int i = 0; i < data.length  ; i++) {
//			for (int j = 0; j < data.length; j++) {
//				if (data[i] < data[j]) {
//					temp = data[i];
//					data[i] = data[j];
//					data[j] = temp;
//				}
//			}
//		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length-i-1; j++) {
				if(data[j]>data[j+1]) {
					temp = data[j];
					data[j]=data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		System.out.print("버블정렬 결과 >> ");viewData();
	}

	public static boolean duplicateNum(int num) {
		boolean flag = true;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == num) {
				flag = false;
			}
		}return flag;
	}

	public static void viewData() {
		for (int i : data) {
			System.out.println(i);
		}
	}
}
