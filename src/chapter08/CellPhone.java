package chapter08;

//부모클래스
public class CellPhone {
	 String model;
	 String color;
	 
	 public void powerOn() {
		 System.out.println("다라라랑 다당");
	 }
	 public void powerOff() {
		 System.out.println("빠바바밤");
	 }
	 public void bell() {
		 System.out.println("띠링띠링");
	 }
	 public void sendVoice(String message) {
		 System.out.println("나:"+message);
	 }
	 public void receiveVoice(String message) {
		 System.out.println("너:"+message);
	 }
	 public void hang() {
		 System.out.println("뚜뚜");
	 }
}
