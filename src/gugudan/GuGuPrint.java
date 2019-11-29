package gugudan;

public class GuGuPrint {
	public void guGuDan(int dansu) {
		int result1;
		for (int i = 1; i <= 9; i++) {
		System.out.println("구구단 " + dansu + "단 출력 ");
			result1 = dansu * i;
			System.out.println(dansu + " x " + i + " = " + result1);
		}
		// 메서드가 끝나는 경우 리턴 혹은 중괄호 끝
		// 돌아갈때 값을 주고싶으면 리턴을 사용
	}
	
}