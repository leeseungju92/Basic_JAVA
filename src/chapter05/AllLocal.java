package chapter05;

public class AllLocal {
	//클래스 내에서 모두 사용가능
	static int num = 5;
	
	public static void main(String[] args) {
		System.out.println(num);
		//지역변수는 지역내에서만 사용 가능
		int num = 10;
		
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
	
	}
}