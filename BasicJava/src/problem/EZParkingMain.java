/*
 * desc : Array를 사용하여 주차공간을 만들고
 * 		  차량을 입고 또는 출고하는 주차타워 프로그램
 * writer : sj.L
 * date : 2019.12.03 
 */

package problem;

import java.util.Scanner;

public class EZParkingMain {

	public static void main(String[] args) {
		//메인메서드 갔더니
		Scanner sc = new Scanner(System.in);
		//스캐너 만들어놨네 ( 키보드입력받는거를 도와주는)
		Parking park = new Parking();
		// 파킹생성자 메서드네? 파킹클래스로 가서 쭉 읽어
		// 힙영역 "어떠한주소"에 파킹클래스 설계도면 다 저장해
		// 객체생성 다 해놨어
		// 파킹생성자 실행해야돼
		// 파킹생성자 만들지 않았어
		// 디폴트 생성자 만들어줘
		// 디폴트 생성자 실행해
		// 뭐없어
		// 파크에 파킹클래스 설계도면이 저장된 "어떠한주소"를 저장해놔
		// 파킹 생성자메서드를 객체생성 연산자를 이용해 만든후
		// 파킹 클래스객체참조타입 파크 객체참조변수명 안에 대입

		//와일 만났네요
		// 트루만났으면 계속 반복해
		while (true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ EZ Parking ver 1.0");
			System.out.print("▒▒ Car Number >>");
			//뷰단 입력
			int car = sc.nextInt(); // 주차타워를 이용할 차량번호
			//카라는 변수를 만들고 다음 입력값을 카에 저장
			int code = 0; // 사용자가 선택한 번호
			//코드변수 만들고 0으로 초기화
			//지역변수니까 초기화 해줘야해
			while (true) {
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("1. 차량입고");
				System.out.println("2. 차량출고");
				System.out.println("3. 취소");
				System.out.print("▒▒ 선택>>");
				//뷰단
				code = sc.nextInt();
				//다음 입력값을 코드에 저장
				
				//이프 조건문 만났네요
				//조건문 안이 참일때
				if (code < 1 || code > 3) {
					System.out.println("▒▒올바른 값을 입력하쇼");
					//경고문 실행해주고
					continue;//차량입출고하는 와일문으로 가줘
				} else {// code가 1,2,3 인 경우
					break;//입력잘했으니 반복문 깨고 나와서다음진행
				}
			} // 브레이크 걸리면 일루와
			
			if (code == 1) {// 입고
				park.inParking(car);
			} else if (code == 2) {// 출고
				park.outParking(car);
			} else if (code == 3) {// 취소
				car=0; //기입력 차량번호 초기화
				System.out.println("프로그램 초기화면으로 돌아갑니다.");
				continue;
			}
		}

	}

}
