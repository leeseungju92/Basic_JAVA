package chapter09;

public class AnimalMain {
	public static void main(String[] args) {
		// Animal ani = new Animal(); 추상메서드는 객체생성 불가
		// 추상클래스는 사용하기위해서는 반드시 자식에게
		// 추상클래스를 상속받는 자식을 통해서만 사용가능
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.kind);
		System.out.println(cat.kind);
		
		dog.sound();
		cat.sound();
		System.out.println("==================================");
		
		Animal animal = null;//추상클래스는 객체생성이 불가능하다했는데 가능해?
		// 객체생성 아니야 new Animal(); 이어야해 
		// 나는 애니몰 객체 참조형 타입의 변수 애니몰을 생성하고 그값에 null을 넣어 heap영역을 못가르키게해놨어
		
		animal = new Dog();//객체참조형 타입과 생성자메서드가 달라도 에러가 안나네?
						   // 다형성 때문이야
						   // 상속관계일때 상위클래스 객체참조형 타입으로 생성 가능해
						   // 도그 클래스는 애니몰 클래스를 상속받고있고
		animal.sound();
//		animal = new Cat();
		animal.sound();
		
		animalSound(animal);
		
		
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
