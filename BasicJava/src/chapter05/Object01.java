package chapter05;

public class Object01 {
//	public 		static	 	void 			main			(String[] args) {
//	protected	final		기본자료형		첫글자 소문자	기본자료형
//	default		abstract	객체자료형		카밀표기법		객체자료형
//	private									예약어사용금지	변수명
//															객체참고변수	
//	접근제한자	지정어		데이터반환타입	메서드명	  	(매개변수)
//	}실행문; return;

	String sName;
	int sNum;
	String sGen;
	String sAddr;
	
	

	public static void main(String[] args) {
		Object01 si1 = new Object01();
		si1.sAddr = "광주광역시";
		si1.sGen = "남";
		si1.sNum = 1;
		si1.sName = "어떤이";
		//System.out.println();
		System.out.print(si1.sAddr);
	}
	
	
	
}
