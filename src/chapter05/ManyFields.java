package chapter05;

public class ManyFields {
	// 지역변수는 반드시 초기화 하여야함.
	// 전역변수는 초기화 하지않고 사용 가능(자바가 자동으로 초기화 해줌)
	//
	// 필드,생성자,메서드
	int all; // 필드( 멤버변수) 전역변수 
	static String stt; // 필드( 멤버변수) 전역변수 스태틱(정적)변수 클래스변수
	
	public void sum(int a, int b) {// 지역변수, 매개변수
		int localNum = 30;// 지역변수
	}
	
	public void test() {
		ManyFields mf = new ManyFields();
		//mf//인스턴스 객체
		mf.all = 5; //인스턴스변수
		
	}
	
}
