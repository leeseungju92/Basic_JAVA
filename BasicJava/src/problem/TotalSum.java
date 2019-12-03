package problem;

public class TotalSum {
	public static void main(String[] args) {
//		1~100까지 더해서 출력하시오.
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println(total);

//		1~100까지 짝수만 더해서 출력하시오
		total = 0;
		for (int i = 1; i <= 100; i++) {
			total += ++i;
		}
		System.out.println(total);
//		1~100까지 홀수만 더해서 출력하시오
		total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i++;
		}
		System.out.println(total);

		int totalE = 0;
		int totalO = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				totalE += i;
			} else {
				totalO += i;
			}
		}System.out.println(totalE+":짝수합\n"+totalO+":홀수합");
	}
}
