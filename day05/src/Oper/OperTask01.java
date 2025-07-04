package Oper;

import java.util.Scanner;

//13번 : 산술연산자 응용
public class OperTask01 {
	public static void main(String[] args) {
		
		//코인노래방 프로그램
		//사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
		//금액입력 : 1000
		//[출력]
		//3곡을 부를 수 있으며 잔돈은 100원입니다
		
		//로직구성
//		입력클래스, 입력클래스 import, 정수형 변수 금액입력, 곡수, 잔돈, 산술연산자(/,%), 출력메소드
		
//		Scanner sc = new Scanner(System.in);
//		int address;
//		int number1 = sc.nextInt();
//		int number2 = sc.nextInt();
//		int number3 = sc.nextInt();
//		System.out.println(number1);
//		System.out.printf("금액입력 : " + "number1");
//		System.out.println(number2);
//		System.out.println("number2" + "곡을 부를 수 있으며");
//		System.out.println(number3);
//		System.out.printf("잔돈은" + "number3" +  "입니다");
//		int result = Integer.parseInt(number1);		
//		System.out.println(number1);
//		System.out.print(number2);
//		System.out.println(number3);
//		System.out.println(name2 + "%s곡을 부를 수 있으며" + name3 " 잔돈은 %d입니다",
//				Integer.parseInt(name2), Integer.parseInt(name3));
//		
		
		//1) 입력클래스 import
		//2) 금액을 입력하세요 메시지 출력
		//3) 정수형 변수 = 입력메소드(nextInt())
		//4) 상수 = 300
		//5) 정수형 변수(곡수 저장할 변수)2 = 변수1 / 상수명
		//6) 정수형 변수3 = 변수1 % 상수명
		//7) 출력
		//8) Scanner 해제
		
		Scanner sc = new Scanner(System.in); //입력클래스 작성
		System.out.println("금액을 입력하세요 : "); //문자열 전체 입력
		int money = sc.nextInt(); // money를 int로 변경, 정수로 변경한다는 의미
		System.out.println(money);
		final int PRICE = 300; // PRICE의 상수를 300으로 확정
		int song = money / PRICE; // song값은 money를 PRICE로 나눈다
		int change = money % PRICE; // change값은 money를 PRICE로 나누고 남은 나머지다
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원입니다");
		//song 곡을 부를 수 있으며 잔돈은 change 원입니다
		sc.close(); //아래 콘솔에 작성하게 해주는 입력클래스를 해제하고 작성하지 못하게 한다.
				
	}
}
