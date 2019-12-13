package chapter12;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("복숭아"); // 값 입력
		list.add("수박");
		list.add("딸기");
		list.add(1, "망고");
		list.remove(1);
		
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String val : list) {
			System.out.println(val);
		}
		
		list.set(1, "포도");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println(list.get(2));

	}
}
