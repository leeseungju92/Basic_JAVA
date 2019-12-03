package chapter05;

//싱글톤패턴
//: 객체생성은 1회만 하고 생성된 인스턴스를 빌려서 사용하는 방법
public class SingleTonTest {
	
	// 객체생성 1회 진행 => st인스턴스 생성
	// 앞으로 객체생성을 하지않고 st인스턴스를 빌려서 사용하여 만듦
	private static SingleTonTest instance = new SingleTonTest();
	//프라이빗 으로 묶는 이유 ? 객체생성을 외부에서 하지 못하게 하기위해
	// 1 생성자를 private으로 선언하여 외부에서 객체생성 불가.
	//스태틱으로 묶는 이유 ? 
	//생성된 메서드를 객체생성하지 않고 바로 사용하기위해  스태틱 매서드 생성하려면?(인스턴스 객체생성없이 사용)
	//스태틱 매서드 안에 스태틱변수만 사용가능
	private SingleTonTest() {
	}

	// 3. 생성된 인스턴스를 리턴으로 빌려서 사용할수있게 스태틱매서드 생성
	
	public static SingleTonTest getInstance() {
		if (instance == null) {
			instance = new SingleTonTest();
		}
		return instance;
	}

	public void test() {

	}

}
