package chapter05;

public class SingleTonMain {

	public static void main(String[] args) {
		//SingleTonTest st= new SingleTonTest();
		SingleTonTest st1 = SingleTonTest.getInstance();
		SingleTonTest st2 = SingleTonTest.getInstance();
		
		System.out.println(st1==st2);
		
	}

}
