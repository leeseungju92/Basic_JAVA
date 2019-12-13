package chapter08;

public class ChildMain {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.sum(3, 2);
		
		//부모클래스의 메서드를 그대로 사용 :메서드실행 > 자식클래스에 있으면 오버라이딩
		//부모클래스의 메서드를 재정의 해서 사용:메서드실행 > 자식클래스에 없으면 부모클래스
		//부모클래스에 메서드와 재정의한 메서드를 2개다 사용.
	}
}
