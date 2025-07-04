package SingTask;

import java.util.Scanner;

//과제 : 코인 노래방 프로그램
public class SingTask01 {
	public static void main(String[] args) {
//		한 곡당 300원인 코인노래방이다. 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
//		금액입력 : 1000
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//		클래스명 : SingTask01(1,2번 같이 묶기)
//		1) 한 곡당 금액도 입력받기
//		금액입력 : 1000
//		곡 당 가격 입력 : 300
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//
//		2) 잔돈이 부족할 경우 안내하기
//		금액입력 : 100
//		곡 당 가격 입력 :
//		[출력]
//		입력한 금액은 100원입니다. 
//		곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액입력 : ");
		System.out.println("곡 당 가격 입력 : ");
		int money1 = sc.nextInt();
		int N = sc.nextInt();
		final int PRICE = 300;
		int N1 = money1 / N;
		int change1 = money1 % PRICE;
		System.out.println("금액입력 : " + money1 + "원"+ "\n곡 당 가격 입력 : " + PRICE + "원" + "\nN1" + "곡을 부를 수 있으며 잔돈은 " + change1 + "입니다.");
		/*
		금액입력 : 
		곡 당 가격 입력 : 
		1000
		금액입력 : 1000원
		곡 당 가격 입력 : 300원
		3곡을 부를 수 있으며 잔돈은 100입니다.
		*/
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("금액입력 : ");
		System.out.println("곡 당 가격 입력 : ");
//		 1000원, 300원, 100원
		int money2 = sc.nextInt();
		final int PRICE2 = 300;
		int change2 = money2 % PRICE2;
		System.out.println("입력한 금액은 " + money2 + "원입니다.\n" + "곡 당 가격은 " + PRICE2 
		+ "원으로 " + change2 + "원이 부족하여 노래를 부를 수 없습니다.");
		
		/*
		
		금액입력 : 
		곡 당 가격 입력 : 
		1000
		입력한 금액은 1000원입니다.
		곡 당 가격은 300원으로 100원이 부족하여 노래를 부를 수 없습니다.
		 */
		
	}
}
