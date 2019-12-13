package problem;

import java.util.Scanner;

public class bubble2 {
	public static void main(String[] args) {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒ 임의의 숫자 5개");
		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();// 귀찮아

		int[] num = new int[5];
//		num[0] =sc.nextInt();
//		num[1] =sc.nextInt();
//		num[2] =sc.nextInt();
//		num[3] =sc.nextInt();
//		num[4] =sc.nextInt(); 귀찮아

		for (int i = 0; i < num.length; i++) {
			while (true) {
				System.out.println((i + 1) + "번째 배열의 숫자>>");
				int num1 = sc.nextInt();
				if (num1 != num[i]) {
					num[i] = num1;
					break;
				}else {
				System.out.println("중복값존재");
				}
			}
		}
		

//		근데 숫자가 임의의 값이어서 큰수가 가장 앞으로 나오게하고싶어
//		첫번째 숫자와 나머지 4개의 숫자를 비교해 4번
//		두번째 숫자와 나머지 3개의 숫자를 비교해 3번
//		세번째 숫자와 나머지 2개의 숫자를 비교해 2번
//		네번째 숫자와 나머지 1개의 숫자를 비교해 1번
//		총 10번의 비교를 하면 모든 숫자의 비교가 돼

//		이게 이해 안되면 
//		첫번째 숫자와 5개숫자 모두 다 비교 5번
//		두번째 숫자와 5개숫자 모두 다 비교 5번
//		세번째 숫자와 5개숫자 모두 다 비교 5번
//		네번째 숫자와 5개숫자 모두 다 비교 5번
//		다섯번째 숫자와 5개숫자 모두 다 비교 5번
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print(num[i] + "\t");
		}
	}
}
