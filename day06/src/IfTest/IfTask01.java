package IfTest;

import java.util.Scanner;

//11번 : if~else문 실습1
public class IfTask01 {
	public static void main(String[] args) {
		
		//1. 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		//로직구성
		//1) 입력 클래스 import
		//2) 정수형 변수 선언
		//3) 입력 메시지 출력
		//4) 변수 입력메소드 사용
		//5) 조건문(if~else)문
			//if 조건식 (산술연산자(%), 관계연산자(!=))
			//	출력메소드
			//else 
			//	출력메소드
		//6) 스캐너 닫기
//		Scanner cs = new Scanner(System.in);
//		System.out.println("출력 시작");
//		if(true) {
//		System.out.println("짝수입니다");
//		}else{
//		System.out.println("홀수입니다");
//		}
//		System.out.println("출력 끝");
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		//굳이 =을 안적고 choice;로 적어도 문제없음, 그러면 기본값이 알아서 들어감
		//자료형들의 기본값
		//정수 0, 실수 0.0, 문자형 ' ', 문자열 "" or null, 논리형 false
		System.out.println("숫자 1개 입력 : ");
		choice = sc.nextInt();
		if(choice % 2 == 0) { // 2 == 0에서 0을 1이나 2로 바꾸면 음수 양수가 반전됨
			System.out.println("짝수입니다");
		}else { //else문을 쓰면 조건식이 2개 이상인걸 확인할 수 있음!
			System.out.println("홀수입니다");
//			숫자 1개 입력 : 
//				10
//				짝수입니다
			
//			숫자 1개 입력 : 
//				-17
//				짝수입니다
		}
		sc.close();
		
		
		//삼항연산자
		System.out.println((choice % 2 != 1) ? "짝수입니다" : "홀수입니다");
						//해당값이 짝수면 짝수입니다, 아니라면 홀수입니다를 출력하겠다
	}
}