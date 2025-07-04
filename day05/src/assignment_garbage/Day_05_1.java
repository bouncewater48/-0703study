package assignment_garbage;

public class Day_05_1 {
	public static void main(String[] args) {
		
//	1. 물건값과 지불 금액을 입력받아 거스름돈을 출력하기
//	단, 거스름돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요.
//	클래스명 : Day05-1
//
//	[입출력 예시]
//	물건값 : 2700
//	지불금액 : 5000
//	거스름돈은 2300원입니다.
//	1000원 : 2개
//	500원 : 0개
//	100원 : 3개
	
	Scanner sc = new Scanner(System.in); // 입력메소드 선언
	 // "물건값 : n"을 의미
	int money = sc.nextInt(); //money를 정수형으로 형변환
	final int PRICE = 5000;
	final int PAY = 2700;
	int remain = PRICE - PAY;
	System.out.println(remain);
	}
}
