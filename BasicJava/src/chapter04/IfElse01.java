package chapter04;

import java.util.Scanner;

public class IfElse01 {
	public static void main(String[] args) {
		// 제어문
		// 1. 조건문
		// - if ~ else
		// - switch ~ case (잘 사용 안함)
		// 2. 반복문
		// - for(반복횟수가 정해졌을때)
		// - while(반복횟수가 정해져 있지 않을때)

		// if(조건문) {
		// 조건문이 참인경우 실행
		// } else if {
		// else if 조건문이 참인경우 실행
		// {
		// } else {
		// 조건문결과 제외하고 전부 다 실행
		// {
		Scanner sc = new Scanner(System.in);

		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒군대갈래? ver 1.0");
		System.out.println("▒▒번호를 입력하세요.");
		System.out.print("▒▒(1:남성, 2:여성>>");
		int num = sc.nextInt();
		
		// 1:남성, 2:여성
		if(num == 1) {
			System.out.println("군대 잘 다녀와유 ...ㅠ_ㅠ");
			
		} else if (num == 2) { 
			System.out.println("군대 안가셔도 돼요~");
		} else {
			System.out.println("1 또는 2의 값을 입력해주세요.");
		}
		
	}
}
