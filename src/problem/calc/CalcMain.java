package problem.calc;

import java.util.Scanner;

//사칙연산이 가능한 계산기 프로그램
public class CalcMain {
	int result=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		while (true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 더하고 나누고 ver1.0");
			System.out.print("▒▒ 숫자 >>");
			int result=0;
			int first = sc.nextInt();
			System.out.print("▒▒ 연산자(+,-,x,/) >>");
			sc.nextLine();
			String oper = sc.nextLine();
			System.out.print("▒▒ 숫자 >>");
			int second = sc.nextInt();
			
			// System.out.println(first+","+oper+","+second);
				
			if (oper.equals("+")) {
				 result=calc.sum(first, second);

			} else if (oper.equals("-")) {
				 result=calc.sub(first, second);

			} else if (oper.equals("*")) {
				 result=calc.mux(first, second);

			} else if (oper.equals("/")) {
				result=calc.div(first, second);
			}
			
			System.out.println(first+oper+second+"="+result);
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.print("▒▒ 끌래? (y/n)");
			sc.nextLine();
			String 끌래 = sc.nextLine().toLowerCase();
			if (끌래.equals("y")) {
				break;
			}
			
		}

	}

}
