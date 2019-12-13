package chapter10;

public class MazingerToyImpl implements IMissile,IMoveArmleg{

		public MazingerToyImpl() {
			System.out.println("마징가입니다.");
			canMissile();
			canMoverArmleg();
			System.out.println("===================");
		}
	@Override
	public void canMissile() {
		System.out.println("피슝");
		
	}

	@Override
	public void canMoverArmleg() {
		// TODO Auto-generated method stub
		System.out.println("우웅 츠큭");
	}

	
	

}
