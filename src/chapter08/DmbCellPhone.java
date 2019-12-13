package chapter08;
//자식클래스
// java는 단일상속만 가능!
public class DmbCellPhone extends CellPhone{//상위 클래스 하위클래스 상속하겠다 명시일뿐
											//객체 생성해주는 것 이 아님.
	int channel;
	
	public DmbCellPhone(String model ,String color, int channel){
		super();//부모생성자 호출 ( 부모객체 생성)
		 		//=>CellPhone(); 생성자메서드
				//부모객체 생성 후 자식객체 생성됨
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	public void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
		
		
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 변경합니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB방송수신을 중단합니다.");
	}
}
