package Oper;

import java.util.Scanner;

//5번 : 삼항연산자
public class OperTest02 {
	public static void main(String[] args) { //main 시작
		
	//조건식 ? 참일때의 값 : 거짓일때의 값;
	//조건식은 반드시 boolean 결과를 반환해야한다 (true,false)
	//삼항 연산자는 값을 반환하므로 변수에 저장하거나 바로 출력할 수 있다	
		
	System.out.println(true ? "참입니다" : "거짓입니다");
	//조건식 작성, 앞에 true를 작성해서 참인 값만 반환
	System.out.println(false ? "참입니다" : "거짓입니다");
	//조건식 작성, 앞에 false를 작성해서 거짓인 값만 반환
	
	System.out.println(10 > 5 ? "10이 더 큰 수입니다" : "10이 큰 수가 아닙니다");
	//조건식에서 10 > 5가 참인지 확인, 더 큰 수이므로 앞쪽만 출력
	System.out.println(10 > 5 && 10 == 5 ? "true입니다" : "false입니다");
	//조건식에서 10 > 5와 10 == 5를 확인, 둘 다 true 일때만 true가 나오나 하나가 거짓이므로 false입니다 출력
	
	int number = 1 < 2 ? 1 : -1;
	System.out.println(number);
	
	
	
	//정수 2개를 입력받아서 큰 수 구하기
	//입력클래스 import
	//입력 메시지 출력
	//정수형 변수 2개 선언
	//문자열 변수 1개 선언, 삼항연산자 대입 (입력받은걸 확인해서 변수에 저장 -> 매번 변수 작성할 필요 사라짐)
	//출력
	//sc.close();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("비교할 두 숫자를 입력하세요");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
//	String result = num1 < num2 ? : ;
	//5가 1보다 큽니다 를 출력하고싶음
	String result = num1 < num2 ? num2 + "가 큽니다" : num2 + "가 크지 않습니다" ;
	System.out.println(num1 + "과" + num2 + "비교 결과는 " + result);
	
	/*
	비교할 두 숫자를 입력하세요
	5 1
	5과1비교 결과는 1가 크지 않습니다
	*/
	
	/*
	비교할 두 숫자를 입력하세요
	1 1
	1과1비교 결과는 1가 크지 않습니다
	*/
	
	} // main 끝
}
