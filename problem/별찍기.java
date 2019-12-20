package problem;

import java.util.Scanner;

public class 별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			n = sc.nextInt();
			if(0<n&&n<101) {
				break;
			}
		}
		
		for(int i = 0 ; i <= n-1 ; i ++) {
			for(int j = n-i ; j >0 ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
