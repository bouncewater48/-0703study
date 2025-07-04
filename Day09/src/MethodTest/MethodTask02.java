package MethodTest;

import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
		//메소드명 : checkNum
		
//		MethodTask02 mt = new MethodTask02();
//		
//		 changeSign(int num) { //void를 int로 체인지
//			int checkNum = 0;
//			for(int i = 1; 1 <= num; i++)
//		}
//		return num;
		
		
		//1)
//		리턴타입 : int
//		메소드명 : checkNum
//		매개변수 : num1, num2 (정수형 2개)
//		실행할문장 : 짝수, 홀수를 0번쨰 인덱스로 저장하고 반복문을 통해 비교
//		0번쨰 인덱스에서 2로 나눠지는 값과 안나눠지는 값을 각각 짝수입니다, 홀수입니다 출력
		
//			void printcheckNum(int[] ar) {
//				int num1 = 0;
//				int num2 = 0;
//				for(int i = 0; i < arr)		
//			}
	
        if (number % 2 == 0) {
            return "짝수입니다";
        } else {
            return "홀수입니다";
        }
    }
			
	
		
		
		
		
		
		//2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
		//메소드명 : getSum
		
		//3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		//메소드명 : reverseStr
		// hello => olleh
		
		//4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true를 반환하는 메소드 만들기
		//메소드명 : contains
		//배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//		syso(메소드명(배열명, 10)) => true
// 		return타입 : boolean 타입
		
		//5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)를 출력하는 메소드
		//메소드명 : printGugudan
		// 3 x 1 = 3
		// ...
		// 3 x 19 =_ 까지 출력, println으로 출력해도 상관없음
		
		//6. 두 개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
		//메소드명 : compareLegnth
		
		//7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
		//메소드명 : loginTry
	}
}
