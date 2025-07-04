package WhileTest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 {
	public static void main(String[] args) {
		
		//2개의 정수를 입력받아서 합을 출력
		//0을 입력하면 프로그램 종료, 1을 입력하면 계속 반복
		//while문 사용
		//기타제어문 사용
		
		//1) 정수형 변수 2개 선언(두 정수 합 구할 변수,종료/반복 입력받을 변수), 입력 클래스 import
		//2) 반복문 while 무한반복(true)
		//3) while 중괄호 영역
		//		3-1) 입력메시지출력
		//		3-2) 변수2개 선언 입력메시지 입력받기
		//		3-3) 두 정수 합 구할변수 덧셈연산
		//		3-4) 두 정수의 합 출력
		//		3-5) 종료/계속할 지 출력 메시지
		//		3-6) 종료/반복 입력받기
		//		4) 조건문 if 종료라면 == 0{
		//		4-1)	종료 메시지 출력
		//		4-2)	break;}
		//		5)	조건문 if 계속이라면 ==1{
		//		5-1)	계속 진행합니다 메시지 출력
		//		5-2)	continue;
		//			}		
		//		5-3)프로그램 출력
		//}
		//반복문을 종료합니다
		//sc.close();
		
		
	      int result = 0, choice = 0; 
	      // result 정수형 변수와 choice 정수형 변수를 추가
	      Scanner sc = new Scanner(System.in);
	      // 입력 메소드 import
	      while (true) {
	    	//반복문 while을 true(일치함)일때 무한 반복하겠다
	         System.out.println("2개의 정수 입력(입력시 1, 0 제외) : ");
	         // 출력 메소드 작성
	         int num1 = sc.nextInt();
	         int num2 = sc.nextInt();
	         //정수형 변수 2개 선언
	         result = num1 + num2;
	         //두 정수형 변수의 합을 선언
	         System.out.println(num1 + " + " + num2 + " = " + result);
	         //두 정수의 합 = result로 표기하겠다
	         System.out.println("계속 : 1, 종료 : 0을 누르세요 : ");
	         // 유지/종료 입력받기
	         choice = sc.nextInt();
	         if (choice == 0) {
	        // 0(종료)를 선택했을때의 조건문 작성
	       System.out.println("종료");
           break;
        }//"종료"조건문 출력, 여기서 조건문이 만족했다면 추가로 출력하지 않겠다
        if (choice == 1) {
           System.out.println("계속 진행합니다");
           continue;
        }//"계속 진행합니다" 조건문 출력, 이번 조건문이 만족했다면 다시 입력받기로 돌아가겠다
        System.out.println("프로그램");
     }
     System.out.println("반복문을 종료합니다");
     //"반복문을 종료합니다" 출력 선언
     sc.close();
     //"입력 콘솔창에 추가 입력 정지"
  }
}
