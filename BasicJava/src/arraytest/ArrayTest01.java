package arraytest;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 배열 : 1 개이상의 값을 담을 때 사용
		// 변수 : 1개의 값만 저장 가능

		// 배열생성방법
		// 1.배열 선언
		int[] arrNum = new int[3];
		// 객체생성 연산자 를 사용해 정수형 배열 3개를 갖는 객체 하나 를 생성하여
		// 정수형 배열 형 객체 참조 타입 의 정수형배열 객체참조 변수 arrNum 에 대입

		// 초기화
		arrNum[0] = 0;
		arrNum[1] = 0;

		// 2. 배열 선언 및 초기화
		int[] arrNum2 = { 4, 8, 12, 16 };

		// 배열의 특징
		// 1. 배열공간의 수를 반드시 지정해야함
		// 2. 배열공간은 같은 자료형 값만 저장 가능
		// 3. 배열은 공간마다 index 번호를 가짐(0부터 시작)
		// ※ 배열의 모든 공간을 꼭 사용해야하는 건 아님!!

		// 배열공간에 값을 입력
		arrNum[2] = 3;
		// 배열공간에 값을 출력
		System.out.println(arrNum[2]);

		// 5명 학생이름을 저장하는 배열 생성

		String[] arrName = new String[5];
		arrName[0] = "오동선";
		arrName[1] = "김혜원";
		arrName[2] = "백진주";
		arrName[3] = "진미경";
		arrName[4] = "이승주";

		// System.out.println(arrName[2]);

		for (int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i]);
		}
		
	}
}
