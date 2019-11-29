package gugudan;

import java.util.Scanner;

public class GuGuMain {
	// 메서드를 다른 클래스에 작성해 놓고
	// public void dan(int num1, int num2) {
	// for (int dan = num1; dan <= num2; dan++) {
	// System.out.printf("%d 단\n", dan);
	// for (int i = 1; i <= 9; i++) {
	// System.out.printf("%d x %d = %d\n", dan, i, dan * i);
	// }
	// System.out.println();
	// }
	// }
	// Method 클래스 참조 타입의 Method 클래스 객체 참조 변수인 sc에
	// 객체 생성연산자 new 생성자메서드 Method(); 를 대입하고
	// 객체 참조 변수인 sc 에서 dan메서드를 호출 하여 인스턴스 생성
	// sc.dan(num1,num2);

	public static void main(String[] args) {
		// JAVA 는 프로그램 실행시 무조건
		// Main 메서드 부터 시작!!

		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 5 = 10
		// 2 x 6 = 12
		// 2 x 7 = 14
		// 2 x 8 = 16
		// 2 x 9 = 18

		// System.out.println("구구단 2단 출력");
		// int result;
		// for (int i = 1; i <= 9; i++) {
		// result = 2 * i;
		// System.out.println("2 x " + i + " = " + result);
		// }

		Scanner sc = new Scanner(System.in);
		System.out.print("몇단 ? : ");
		GuGuPrint ggp = new GuGuPrint();
		ggp.guGuDan(sc.nextInt());
		//호출문 갔다가 다시와
		
	}

}
