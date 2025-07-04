package Oper;

import java.util.Scanner;

//6번 : 상향연산자 실습1
public class OperTask02 {
	public static void main(String[] args) {
		
		//두 수를 입력받아 비교
		//1.크다, 작다, 같다를 각각 상황에 맞게 출력되도록 로직 구성
		//1) 입력클래스 import
		//2) 입력 메시지 출력
		//3) 변수 선언, 입력메소드 사용
		//4) 입력 메시지 출력
		//5) 변수 선언, 입력메소드 사용
		//6) 삼항연산자 사용하여 출력 => 크다/작다/같다가 출력되어야함
		//조건식 ? 참일때의 값 : 거짓일때의 값
		//조건식1 ? 참일 떄의 값 : 조건식2 ? 참일때의 값 : 거짓일때의 값
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("비교할 숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		/*
		String result = num1 > num2 ? :;
		String result = num1 < num2 ? :;
		String result = num1 = num2 ? :;
		*/
//		String result = num1 > num2 ? "크다" :  +  num1 < num2 ? "작다" : +  num1 == num2 ? "같다" ;
//		System.out.println(num1 +  + num2 );
//		System.out.println(true ? num1 > num2 : "크다");
//		System.out.println(true ? num1 < num2 : "작다");
//		System.out.println(true ? num1 == num2 : "같다");
//		System.out.println(true ? num1 > num2 : "크다" ++ true ? num < num2 : "작다" + );
				
//		강사님 답안지
		System.out.println("크기 비교할 숫자 1 입력 : ");
		int num1 = sc.nextInt();
//		System.out.println("크기 비교할 숫자 2 입력 : ");
		int num2 = sc.nextInt();
		String result = num1 > num2 ? num1 + "가 큽니다" : (num1 == num2) ? "같은 수" : "큰 수 : " + num2;
//		String result = num1 > num2 ? num1 + "가 큽니다" : (num1 == num2) ? "같은 수" : "큰 수 : " + num2
//			:	? (num1 < num2) ? num2 + "가 작습니다"; 틀린건데 정확한 이유를 모르겠음, 작은거 어케 하냐
		//              num1 > num2가 참인가?를 물어봄
		//                                               num1==num2를 다시 한번 물어봄
		//                                                                   같은 수와 큰 수 중 참을 출력
		//				위에서 num1과 num2를 조건문 하나씩 선언해보고, 선언 결과 참이면 그대로 출력하고 아닐 시에는 뒤쪽을 출력
		//
		System.out.println(result);
		
//		System.out.println(result = num1 > num2 ? num1 + "가 큽니다" : (num1 == num2) ? "같은 수" : "큰 수 : " + num2 + "입니다"); 
		
		
		
		//2. 한개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		//짝수입니다 or 짝수가 아닙니다로 출력할 것
		
		//1) 입력 메시지 출력
		//2) 정수형 변수 1개(입력 메소드), 문자열변수 1개(삼항연산자, 나머지연산자)
		//3) 출력
		System.out.println("숫자 1개 입력 : ");
		int number = sc.nextInt();
		String result1 = (number % 2 == 0) ? "짝수입니다" : "짝수가 아닙니다";
		// number가 2로 나눠떨어지는 숫자(짝수)면 참이라 짝수입니다 가 출력, 아닌 숫자(홀수)면 짝수가 아닙니다 로 출력
		// 0은 원래는 짝수도 홀수도 아닌 숫자이나, 컴퓨터는 짝수로 인식함
		System.out.println("입력한 숫자는 " + result1);
//		System.out.println("입력한 숫자 " + number + result1); number가 뭔지도 알 수 있게 바뀜!
		sc.close();
		
		/*
		 * 크기 비교할 숫자 1 입력 : 
		1 2
		큰 수 : 2
		숫자 1개 입력 : 
		5
		입력한 숫자는 짝수가 아닙니다
		 */
		 
	}
}
