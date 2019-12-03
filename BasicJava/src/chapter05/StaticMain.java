package chapter05;

public class StaticMain {
	public static void main(String[]args) {
		/*
		 * 클래스가 같더라도 객체생성을 하게되면
		 * 결과물은 다른것으로 인식
		 * t1, t2는 StaticTest로 만든 결과물이지만 서로다름
		 * 각각의 인스턴스.
		 */
		StaticTest t1 = new StaticTest();
		StaticTest t2 = new StaticTest();
		t1.name = "수면";
		StaticTest.point =5000;
		//t1.point = 5000;
		// t2.point = 5000인 이유
		// 포인트 변수는 스태틱 선언되어 해당 클래스로 객체생성된 모든 인스턴스에서 공유하는 변수
		// 반드시 Class.point()
		t1.join();
		
		t2.name = "숙면";
		t2.join();
		
		//t1.search();
		StaticTest.search();
		
	}
}
