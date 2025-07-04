package homework07;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
		/*
6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
	[조건]
	초기 잔액은 10,000으로 설정
	메뉴 선택에 따라 작업 수행
	종료시 프로그램 종료
	숫자(번호)로 입력받기

	String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요: "
		+ "\n1. 잔액조회"
		+ "\n2. 입금"
		+ "\n3. 출금"
		+ "\n4. 종료"
		+ "\n선택 : ";
	그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
		
	위에 String msg부터 "선택 : "; 까지 다 그냥 2번 출력용 메세지임
	번호 입력시 해당 메시지만 출력하고 끝
	      */
		Scanner sc = new Scanner(System.in);
		int FIRST = 10000; //초기 잔액
		String a = "1. 잔액조회 : ", b = "2. 입금 : ", c = "3. 출금", d ="4. 종료";
		int number =0;
		while (number < 1) {
			number++;
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요: "
				+ "\n1. 잔액조회"
				+ "\n2. 입금"
				+ "\n3. 출금"
				+ "\n4. 종료"
				+ "\n선택 : ";
		System.out.println("\nATM 기기의 메뉴 중 번호를 선택하세요");{
			if(a.equals(1)) {
				System.out.println("잔액조회");
				System.out.println(a + number +  "원 입니다");
		}
		
		}
	}
	}
}
		
		
		
		
	
