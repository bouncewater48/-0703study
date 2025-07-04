package SingTask;

import java.util.Scanner;

//과제 : 코인 노래방 프로그램
public class SingTask02 {
	public static void main(String[] args) {
//		한 곡당 300원인 코인노래방이다. 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
//		금액입력 : 1000
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
		
//		클래스명 : SingTask02
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		(음료는 무조건 1잔만 가능)
//		금액입력 : 1000원
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액입력 : ");
//		1000원, 200원, 100원
		int money = sc.nextInt();
		int number = sc.nextInt();
		int number2 = sc.nextInt();
		final int PRICE = 200;
		int pay = money % PRICE;
//		4곡부르고 남은 200-100, number2 = 4
		int pay2 = (money - (PRICE * number2))/2;
		System.out.println(number + "곡을 부를 수 있으며 잔돈은 " + pay + "원입니다." +
		"\n음료를 마시고 싶으면 " + number2 + "곡을 부를 수 있으며 잔돈은 " + pay2 + "원입니다.");
	/*
	금액입력 : 
		1000
		5
		4
		5곡을 부를 수 있으며 잔돈은 0원입니다.
		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다.
	*/
	}
}
