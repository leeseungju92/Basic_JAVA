package chapter08;

public class Child extends Parent{
	
	
	//메서드 재정의 ( 오버라이딩)
	// 부모클래스의 메서드를 그대로 사용하는게 아니고
	// 내 입맛에 맞게 바꾸어 사용하는것.!
	
	public void sum() {
		
	}
	
	//어노테이션
	@Override
	public int sum(int a, int b) {
		super.sum(2, 3);
		System.out.println("합:"+(a+b));
		return super.sum(a, b);
	}
}
