package Oper;
//7번 : 비트연산자
public class BitOper {
	public static void main(String[] args) {
		/*
		System.out.println(10 & 11); //1010 & 1011 => 1010
		//두개 다 1이 있는거만 1로 표현
		System.out.println(10 | 11); //1010 | 1011 => 1011
		//두 비트 중 하나라도 1이 있으면 1로 표현
		System.out.println(10 ^ 11); //1010 ^ 1011 => 0001
		//
		System.out.println(~10);     //-11
		//
		*/
		
		System.out.println("십진수 : " + 10 + " => 이진수 : " 
		+ Integer.toBinaryString(10));
		//십진수 : 10 => 이진수 : 1010
		System.out.println("십진수 : " + 10 + " => 이진수 : " 
		+ Integer.toBinaryString(11));
		//십진수 : 10 => 이진수 : 1011
		
		//& 두 비트가 모두 1이면 1
		System.out.println("10 $ 11의 십진수 : " + (10 & 11));
		//10 $ 11의 십진수 : 10
		System.out.println("10 $ 11의 이진수 : " + Integer.toBinaryString(10 & 11));
		//10 $ 11의 이진수 : 1010
		
		//| 두 비트 중 하나라도 다르면 1
		System.out.println("10 | 11의 십진수 : " + (10 | 11));
		//10 | 11의 십진수 : 11
		System.out.println("10 | 11의 이진수 : " + Integer.toBinaryString(10 | 11));
		//10 | 11의 이진수 : 1011

		//^ 두 비트가 서로 다르면 1
		System.out.println("10 ^ 11의 십진수 : " + (10 ^ 11));
		//10 ^ 11의 십진수 : 1, 앞의 0은 생략
		System.out.println("10 ^ 11의 이진수 : " + Integer.toBinaryString(10 ^ 11));
		//10 ^ 11의 이진수 : 1, 앞의 0은 생략
		
		//~ 0을 1로, 1을 0으로 바꿔줌
		//~x = -(x+1)
		System.out.println("~10의 십진수 : " + ~10);
		//~10의 십진수 : -11
		System.out.println("~10의 이진수 : " + Integer.toBinaryString(~10));
		//~10의 이진수 : 11111111111111111111111111110101
		System.out.println("~5의 십진수 : " + ~5);
		//~5의 십진수 : -6
		System.out.println("~5의 이진수 : " + Integer.toBinaryString(~5));
		//~5의 이진수 : 11111111111111111111111111111010	
	}
}
