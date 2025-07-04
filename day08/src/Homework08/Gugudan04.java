package Homework08;

import java.util.Scanner;

//4) while문만 이용 구구단 출력(단별로 가로로 출력하기)
public class Gugudan04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int first = sc.nextInt();
		int second = sc.nextInt();
		while(true) {
		for(int i = 1; i < first + 1; i++) {
			for(int j = 1; j <= second; j++) {
				System.out.print(i + "단 : \n");
				System.out.println(i + " x " + j + " = "  + (i * j) + "     ");
				}
				System.out.println(" ");
			}
		}
	}
}
