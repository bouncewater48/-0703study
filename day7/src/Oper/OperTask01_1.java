package Oper;

import java.util.Scanner;

//4-1번 : ~논리연산자까지 복습문제
public class OperTask01_1 {
	public static void main(String[] args) {
		
		//사용자가 입력한 값 2개의 값을 서로 비교하기(관계연산자 3개 확인)
		//nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		//변수 만들 때 의미있는 문자로 사용
		//로직 구성부터!
		
		Scanner sc = new Scanner(System.in);
		//입력메소드 선언
		int num1, num2;
		//num1, num2 라는 정수 선언
		System.out.println("숫자 2개를 서로 비교하세요 : ");
		//콘솔창에 기본으로 띄울 문구
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//num1, num2를 입력가능하게 만드는 선언, 기본적인 로직구성
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		System.out.println(num1 + " > " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " > " + num2 + " : " + 
		" || " + num1 + " < " + num2 + " : " +  (num1 > num2 || num1 < num2));
		// 먼저 10 > 20을 확인, 그다음 10 < 20을 확인
		// 그리고 10 > 20 과 10 < 20 중 하나라도 참이면 true가 출력되게 작성
		
		/*
		숫자 2개를 서로 비교하세요 : 
			10
			20
			10 > 20 : false
			10 > 20 : true
			10 > 20 :  || 10 < 20 : true
		*/
	}
}
