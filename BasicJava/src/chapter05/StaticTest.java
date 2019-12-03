package chapter05;

public class StaticTest {
	// static 지정어
	// 1. 객체생성 없이 사용 할 수 있다.
	// 2. 공유(공용)의 개념으로 사용한다.
	// ※ static을 남발해서 사용하면 메모리에 부하

	// static으로 선언된 변수나 메서드는
	// 인스턴스명이 아닌 클래스명으로 호출해서 사용할 것!!
	String name = "체리"; // 일반변수, 전역변수, 멤버변수, 인스턴스 변수
	static int point = 3000; // static 변수, 클래스 변수

	public StaticTest() {
	}// 기본 생성자 메서드

	public void join() { // 일반 메서드
		System.out.println(name);
		System.out.println(point);

	}

	public static void search() { // static 메서드
//		스태틱 메서드 내에서는 지역변수와 스태틱 변수만 사용가능
//		System.out.println(name);
		String hobby = "영화감상";
		System.out.println(hobby);
		/*
		 * 전역변수는 객체를 생성해야만 사용가능, 
		 * 스태틱메서드는 객체 생성없이 사용 가능 
		 * 객체생성없이 사용 가능한 스태틱 매서드를실행하는데 
		 * 내부에서 객체생성이 필요한 전역변수를 사용하면
		 * 스태틱을 사용하는 의미가 없음
		 */
		System.out.println(point);
	}
	
}
