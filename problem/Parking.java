package problem;

public class Parking {
	int[] space = new int[5]; // 주차공간 [5대]
	// 힙영역에 스페이스[5] 5가지 공간을 만든후 초기화시켜줘
	// 왜? 전역변수는 자바에서 초기화까지 해줘
	int carCnt; // 현재 주차된 차량수
	// 힙영역에 카씨엔티변수 저장하고 초기화해줘
	// 1. 주차현황

	// 힙영역에 뷰파킹 메서드 저장해
	public void viewParking() {
		System.out.println("============"); // 이쁘게
		for (int j = 0; j < space.length; j++) {// 포문 한번 더 돌려서 전체 층에 주차돼있는차 보고싶어서
			System.out.println("||" + (j + 1) + "층" + space[j] + "차||");

		}
		System.out.println("============");
	}

	// 힙영역에 인파킹 메서드 저장해
	public void inParking(int car) {
		if (carCnt == space.length) {
			System.out.println("차 만땅");
			return;
		}
		
		if(searchCar(car)) {
			System.out.println("기등록번호차");
			return;
		}
		

		for (int i = 0; i < space.length; i++) {// 주차공간의 배열의 수 만큼 반복문 실행
			if (space[i] == 0) {// i번째 배열의 주차공간에 0이 할당 되었느냐? 트루 or 폴스
				space[i] = car;// 트루인 i번째 배열에 car자동차 번호를 할당하라.
				carCnt++;// 차 댓수 카운트를 해야 나중에 입고못하게 할수 있어
				System.out.println("▒▒" + (i + 1) + "에" + car + "있어");// 차 입고된 층 보여주고싶어
				viewParking();
				break;// 할당했으믄 포 조건문을 뿌셔라.
			}
		}
	}

	// 3.출고
	public void outParking(int car) {
		if (carCnt == 0) {
			System.out.println("입고된 차가 0대");
			return;
		}

		for (int i = 0; i < space.length; i++) {// 주차공간의 배열의 수 만큼 반복문 실행
			if (space[i] == car) {// i번째 배열의 주차공간에 입력한 자동차 번호가 같느냐? 트루 or 폴스
				space[i] = 0;// 트루면 차 에 0값으로 초기화 해줘서 주차공간을 비워주고
				carCnt--;// 차 댓수 카운트를 빼줘야 나중에 입고하게 할수 있어
				System.out.println("▒▒" + (i + 1) + "에" + car + "빼는중");// 차 뺀다
				viewParking();
				return;// 할당했으믄 포 조건문을 뿌셔라.
			}

		}
		System.out.println(car + " 없어");
	}
	// 4. 검색기능: 현재 차량번호와 기등록된 차량번호의 중복체크

	public boolean searchCar(int car) {
		boolean flag = false;
		for (int i = 0; i < space.length; i++) {
			if (space[i] == car) {
				flag = true;
			}

		}
		return flag  ;
	}

}
