package Oper;
//13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		double num3 = 5.5, num4 = 2.5;
		

//		System.out.println("=====덧셈=====");
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num4));
//		=====덧셈=====
//				10 + 20 = 30
//				5.5 + 2.5 = 8.0
//				10 + 20 = 12.5

//		System.out.println("\n=====뺄셈=====");
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num4));
//		=====뺄셈=====
//				10 - 20 = -10
//				5.5 - 2.5 = 3.0
//				10 - 20 = 7.5
	
		
//		System.out.println("\n=====곱셈=====");
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num4));
//		=====곱셈=====
//				10 * 20 = 200
//				5.5 * 2.5 = 13.75
//				10 * 20 = 25.0
		

//		System.out.println("\n=====나눗셈=====");
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num4));
//		=====나눗셈=====
//				10 / 20 = 0
//				5.5 / 2.5 = 2.2
//				10 / 20 = 4.0
		

//		System.out.println("\n=====나머지=====");
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num4));
//		=====나머지=====
//				10 % 20 = 10
//				5.5 % 2.5 = 0.5
//				10 % 20 = 0.0

		
		//복합대입연산자
		int num = 10;
		System.out.println("num의 현재 값 : " + num);
		num = num + 5;
		//괄호 안 먼저 계산
		// 좌측 num : 계산결과 , 우측 num : 값
		System.out.println("num의 현재 값 : " + num);
		num = num + 15;
		System.out.println(num);
		num += 5; //num = num + 5
		//num 2번 쓰는거보다 간단하게 계산하는법, 15+15=30에 +5를 한것
		System.out.println(num);
		num -= 2.5; 		
		System.out.println(num); 
		//32, 35-2.5=32.5가 되어야하나,int 변수에 저장해서 정수가 되었기에 소수점 0.5가 버려짐
		//즉 정수로 강제형변환이 이루어짐
		System.out.println(35-2.5); // 정수 - 실수 = 실수
		num *= 2;
		System.out.println(num); //실수 32.5가 아닌 정수 32로 저장되었기에 *2를 해도
		// 65가 아닌 64가 출력된다.
		
		
		
		
		
		
		
	}
}
