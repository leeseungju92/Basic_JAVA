package chapter10;

public class PoohToyImpl implements IMoveArmleg {
	public PoohToyImpl() {
		System.out.println("푸예요.");
		canMoverArmleg();
		System.out.println("=======================================");
	}

	@Override
	public void canMoverArmleg() {
		// TODO Auto-generated method stub
		System.out.println("불곰국 곰이 쫓아옵니다.");
	}

}
