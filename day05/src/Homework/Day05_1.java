package Homework;

import java.util.Scanner;

public class Day05_1 {
	public static void main(String[] args) {
		
	
//	[과제 제출 기한] 매일 pm 11시 30분까지 제출
//	* 코드 작성 2문제(로직구성 필수)
//
//	1. 물건값과 지불 금액을 입력받아 거스름돈을 출력하기
//	단, 거스름돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요.
//	클래스명 : Day05_1
//
//	[입출력 예시]
//	물건값 : 2700
//	지불금액 : 5000
//	거스름돈은 2300원입니다.
//	1000원 : 2개
//	500원 : 0개
//	100원 : 3개
		
		Scanner sc = new Scanner(System.in); //입력메소드 선언
		System.out.println("물건값 : ");
		System.out.println("지불금액 : ");
		System.out.println("거스름돈 : ");
		System.out.println("1000원 : ");
		System.out.println("500원 : ");
		System.out.println("100원 : ");
		int money = sc.nextInt(); //money를 정수형으로 형변환
//		System.out.println(money);	
		sc.next();
		sc.next();
		sc.next();
		sc.next();
		sc.next();
		final int PRICE = 5000; //PRICE의 정수를 5000으로 확정
		int change = PRICE % 2700;
//		int change = sc.nextInt();
		int PAY = PRICE - change; //PAY의 정수를 2700 확정
		int one_thousand =  2300 / 1000 ; // 2
		int five_hundrad =  300 / 500;
		int one_hundrad = 300 / 100;
//		int change = PRICE - PAY; // change는 price - pay의 정수값
		System.out.println("물건값 : " + PAY + "\n지불금액 : " 
		+ PRICE + "\n거스름돈 : " + change + "\n1000원 : " 
		+ one_thousand + "\n500원 : " + five_hundrad + 
		"\n100원 : " + one_hundrad);
		sc.close();
		
		
//		물건값 : 
//			지불금액 : 
//			거스름돈 : 
//			1000원 : 
//			500원 : 
//			100원 : 
//			2700
//			5000
//			2300
//			2
//			0
//			3
//			물건값 : 2700
//			지불금액 : 5000
//			거스름돈 : 2300
//			1000원 : 2
//			500원 : 0
//			100원 : 3
	}
}
	
