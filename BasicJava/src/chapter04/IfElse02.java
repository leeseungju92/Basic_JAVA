package chapter04;

import java.util.Scanner;

public class IfElse02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score;
		while (true) {
			System.out.print("학생점수>>");
			score = sc.nextInt();

			if (score > 100 || score < 0) {
				System.out.println("0~100: 다시입력");
			} else {
				break;
			}
		}		
		String grade = "";
		if (90 <= score && score <= 100) {
			grade = "a";
			if (96 <= score) {
				grade = "a+";
			}
		} else if (80 <= score && score < 90) {
			grade = "b";
			if (86 <= score) {
				grade = "b+";
			}
		} else if (70 <= score && score < 80) {
			grade = "c";
			if (76 <= score) {
				grade = "c+";
			}
		} else if (60 <= score && score < 70) {
			grade = "d";
			if (66 <= score) {
				grade = "d+";
			}
		} else if (0 <= score && score < 60) {
			grade = "f";
		} else {
			System.out.println("0~100의 점수를 주입해 주세요.");
		}
		System.out.println("당신은"+grade+"입니다");
	}
	}
