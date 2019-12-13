package chapter09;


public abstract class Animal {
	//추상메서드가 포함된 클래스는 반드시 추상클래스로 만들어져야함.
	//추상클래스는 부모클래스로만 사용가능
	
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");	}
	//public abstract void sound(); //추상메서드가 없어도 추상클래스로 만들수 있음.
	public abstract void sound();
	
	
}
