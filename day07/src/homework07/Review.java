package homework07;

import java.util.Scanner;

public class Review {
		private static final Object X = null;

		@SuppressWarnings("unused")
		public static void main(String[] args) {
		/*
 * 1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)

	2. 한 개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
	
	3. 나이를 입력받아서 다음 기준으로 출력하기
		0 ~ 12	: 어린이입니다
		13 ~ 19	: 청소년입니다
		20 이상	: 성인입니다
		
		나이입력 : 00(숫자 쓰기)
		현재 나이는 00살이고 000입니다.
	
	4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
		단, 세 개의 정수는 모두 다른 숫자이어야한다 (중복값 사용 X)
	
		숫자 3개 입력 : 5 1 9
		정렬된 숫자 : 9 5 1 
	
	5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 
		출력하고 그 외에는 입력한 문자열을 출력하기(While문)
		X는 대소문자 상관없이 편한 문자 넣어서 작성
		 */
		Scanner sc = new Scanner(System.in);
	
// 1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		
		int number1 = 0, a = 0, b =0;
		System.out.println("입력받은 숫자 : ");
		number1 = sc.nextInt();
		if(number1 % 2 == 0) {
			System.out.println("입력하신 숫자 " + number1 + "는 짝수입니다");
		}else if (number1 % 2 == 1) {
			System.out.println("입력하신 숫자 " + number1 + "은(는) 홀수입니다 ");
		}


//		2. 한 개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		int num2 = 0, a2 = 0, b2 =0;
		System.out.println("입력받은 숫자 : ");
		num2 = sc.nextInt();
		if(num2 > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}else if (num2 < 0) {
			System.out.println("입력하신 숫자은(는) 음수입니다.");
		}else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//		0 ~ 12	: 어린이입니다
//		13 ~ 19	: 청소년입니다
//		20 이상	: 성인입니다
//		
//		나이입력 : 00(숫자 쓰기)
//		현재 나이는 00살이고 000입니다.
		
		int age = 0, child = 0, youth = 0, adult =0;
		System.out.println("입력하신 나이 : ");
		age = sc.nextInt(); //입력받을떄 0보다 큰 양수만 입력받게 만들기
		if(0 <= age && age <= 12) {
			System.out.println("어린이입니다");
		}else if(13 <= age && age <= 19) {
			System.out.println("청소년입니다");		
		}else {
			System.out.println("성인입니다");
		}
		
//		4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
//		단, 세 개의 정수는 모두 다른 숫자이어야한다 (중복값 사용 X)
//	
//		숫자 3개 입력 : 5 1 9
//		정렬된 숫자 : 9 5 1 
		
		
//		int num1 = 0;
//		int result2 = 0;  int a2 = 0;  int b2 = 0; int c2 = 0;
//			System.out.printf("숫자 3개 입력 : ");
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextInt();
//		sc.nextLine();
//		if(b2 < c2) {
//			System.out.println(" c2");
//		}else if(a2 < b2) {
//			System.out.println(" b2");
//		}else {
//			System.out.println(" a2");
//		}
//		System.out.println("정렬된 숫자" +  " : " + )
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		
		//3, 8, 7
//		if( a == b | b == c | a == c);
//		if (a > c);
//		if( c < b);
		
//			a = Integer.parseInt(sc.nextLine());
//			System.out.printf("정렬된 숫자 : ");
//			if(a > b);
//				System.out.println("숫자 정렬");
			
//		5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 
//		출력하고 그 외에는 입력한 문자열을 출력하기(While문)
//		X는 대소문자 상관없이 편한 문자 넣어서 작성
		
		//1) 문자열 변수 1개 선언 (X), 입력클래스 import
		//2) 반복문 while 무한반복(true)
		//3) while 중괄호 영역
		//		3-1) 입력메시지출력
		//		3-2) X 포함 유무 선언
		//		3-3) X인지 아닌지 출력
		//		3-4) X/noneX 입력받기
		//		3-5) 종료/유지 메시지 출력
		//		3-6)Syso(choice.eqauls.(X)) 선언
		//		4) 조건문 종료라면   {
		//		4-1) 종료메시지 출력
		//		4-2)break;
		//		5) 조건문 유지라면 choice.eqauls.|(X) {
		//		5-1) 유지메시지 출력
		//		5-2) continue;
		//	}
		//		5-3)프로그램 출력
		//	반복문을 종료합니다.
		//	sc.close();
		/*
		String key = "X";
		String key1 = sc.nextLine();
//	Scanner sc = new Scanner(System.in);
		while(true)	 {
			System.out.println("종료 여부를 입력해주세요.");
			System.out.println(key1.contains("X"));
			System.out.println("종료하시려면 X 를 눌러주세요");
			System.out.println(key1.equals(X))
				if (choice(key1.equals(X))) {
					System.out.println("종료");
					break;
				}
			if (choice(!key1.equals(X))) {
				System.out.println("계속");
				continue;
				}
				System.out.println("프로그램 종료.");
			}  
			sc.close();
		}
		*/
/*
		private static boolean choice(boolean equals) {
			// TODO Auto-generated method stub
			return false;
		}

		private static boolean choice(boolean equals) {
			// TODO Auto-generated method stub
			return false;
		}*/

		}
}


		
		
		
		
		
		
		
		

	
	
	
	
	

