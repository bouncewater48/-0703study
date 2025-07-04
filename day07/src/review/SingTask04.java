package review;

import java.util.Scanner;

public class SingTask04 {
	public static void main(String[] args) {
		
//		남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공
		
		
		//1) 입력클래스 import
		Scanner sc = new Scanner(System.in); 
		//2) 정수형 상수 2개 선언(한 곡당 금액, 음료금액), 정수형 6개 선언(금액입력1, 노래 곡 수2, 잔돈3, 
		final int PRICE = 200, PRICE_DRINK = 100;
		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0, bonus = 0;
		//final int에 여러개를 추가할수 있다!
		//음료마실경우노래곡수4, 음료마실경우잔돈5, 보너스곡6) 
		//3) 입력 메시지 출력
		System.out.println("금액 입력 : ");
		//4) 변수1 = 금액 입력 nextInt()
		money = sc.nextInt();
		//5) 변수2 = 변수1 / 상수1
		song = money / PRICE;
		//6) 변수3 = 변수1 % 상수1
		change = money % PRICE;
		//drinkSong = money % PRICE;		
		//맨위에 drinkSong = 0으로 초기화를 진행하지 않고 그냥 drinkSong으로만 작성한채 실행하려하면, 아래에서 충돌나서 오류남
		//7) 출력(몇곡 부를 수 있으며 잔돈은 얼마입니다)
		System.out.printf("%d곡을 부를 수 있고 잔돈은 %d원입니다.\n", song, change);
		/*
		 * 금액 입력 : 
			1100
			5곡을 부를 수 있고 잔돈은 100원입니다.
		 */
		//+) if 음료금액보다 잔액이 크거나 같을 경우
		if (change >= PRICE_DRINK) {
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.\n", song, change - PRICE_DRINK);
			/*
			 * 금액 입력 : 
				1100
				5곡을 부를 수 있고 잔돈은 100원입니다.
				음료를 마시고 싶으면 5곡을 부를 수 있으며 잔돈은 0원 입니다.
			 */
			/*
			 * 금액 입력 : 
				1000
				5곡을 부를 수 있고 잔돈은 0원입니다.
				출력
				음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
			 */
//			if문으로 잔돈처리까지 넣어줘서 정상적으로 나옴
		//8) 음료를 마시기 위해 한 곡을 줄이는 경우
		//	if(노래곡수 > 0) && (금액 - ((노래곡수 - 1) * 노래가격) >= 음료금액)){
			//						 여기 노래곡수-1을 drinkSong으로 바꿔서 넣어도 기본값0이라 문제없음
		}else if(song > 0 && (money - (song -1) * PRICE) >= PRICE_DRINK) {
			System.out.println("출력");
			//한곡을 줄이면 음료를 마실 수 있는지 물어보는 if문
			//9) 음료마실경우 노래곡수 = 노래곡수 - 1;		
			drinkSong = song - 1;
			//10) 음료마실경우의 잔돈 = 금액 - (음료마실경우노래곡수 * 노래가격 + 음료금액)
			drinkChange = money - (drinkSong * PRICE + PRICE_DRINK);
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다\n", drinkSong, drinkChange);
		// }
			//한줄로 작성하니까 println이 아니라 printf로 바꾸셈
			/*
			 * 조건
			 * +) if문이 추가되기 전 결과
			 * if(song > 0 && (money - (song -1) * PRICE) >= PRICE_DRINK) {
			 * 금액 입력 : 
				1100
				5곡을 부를 수 있고 잔돈은 100원입니다.
				출력
				음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 200원입니다
			 */
			}
		//11) 보너스곡 제공
		//	보너스곡 = 노래곡수 / 5;
		//12) if(보너스곡 > 0){
		//	보너스로 몇곡이 추가되어 총 몇곡을 부를 수 있습니다
		//}
		bonus = song / 5;
		if(bonus > 0) {
			System.out.printf("보너스로 %d곡이 추가되어 총 %d곡을 부를 수 있습니다\n", bonus, song + bonus);
		}
		/*
		 * 금액 입력 : 
			1000
			5곡을 부를 수 있고 잔돈은 0원입니다.
			출력
			음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
			보너스로 1곡이 추가되어 총 6곡을 부를 수 있습니다
		 */
		/*
		 * 금액 입력 : 
			1100
			5곡을 부를 수 있고 잔돈은 100원입니다.
			음료를 마시고 싶으면 5곡을 부를 수 있으며 잔돈은 0원 입니다.
			보너스로 1곡이 추가되어 총 6곡을 부를 수 있습니다
		 */
		//+)sc.close();
		sc.close();
	}
}
