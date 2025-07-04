package review;

import java.util.Scanner;

//3) 복습 문제
public class Review01 {
	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기
		
		//1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		/*
		//2) 정수형 상수 선언
		int number = 0
		//3) 입력 메시지 출력
		System.out.printf("입력받은 숫자 : ");
		//4) 변수1 = 입력받은 숫자 nextInt();
		number = sc.nextInt();
		//5) 출력(사용자로부터 입력받은 숫자가 0이며 제곱은 0입니다)
		System.out.printf("사용자로부터 입력받은 숫자가 %d이며 제곱은 %d입니다");
		//+) if 숫자가 1~10인 경우
		if (number >= 1 && number <= 10); 
		//6) if else 숫자가 1~10이 아닌 경우
		if (number < 1 && number > 10); 		
		//7) 출력(숫자를 잘못 입력하셨습니다)
		//8) sc.close()
		 */
		
		//한글로만 로직구성
		//1) 입력클래스 import
		//2) 정수형 변수
		//3) 출력 메시지
		//4) 변수 정수형 입력메소드
		//5) if 조건식 1 <= 변수 && 변수 <=10 , 0 < 변수 && 변수 < 11
			//6) 변수 * 변수 출력, 제곱이니까
		//7) else
			//8) 잘못 입력했습니다 출력
		//9) sc.close();
		/*
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("1부터 10 사이의 숫자만 입력하세요");
		num = sc.nextInt();
		if ( 1<= num && num < 11) {
		System.out.println(num * num);
		/*
		1부터 10 사이의 숫자만 입력하세요
		9
		81
		*/
		/*
		1부터 10 사이의 숫자만 입력하세요
		11
		잘못 입력했습니다 
		 
//		System.out.println(num * 2); 제곱할땐 *2 쓰는거아님
		} else {
		System.out.println("잘못 입력했습니다");
		}
		*/
		
		
		//문자열끼리의 비교는 관계연산자(==)를 사용하지 않고
		//.equals() 메소드를 사용해서 비교한다!
		System.out.println("문자열1 입력 :");
		String data1 = sc.nextLine();
		System.out.println("문자열2 입력 :");
		String data2 = sc.nextLine();	
		System.out.println(data1.equals(data2)); //true
		if(data1.equals(data2)) {
			/*if(data1== data2)
			 * .equals가 아닌 ==을 사용하면 제대로 안나옴
			 * 문자열1 입력 :
			ksh
			문자열2 입력 :
			ksh
			true
			두 문자열은 같지 않습니다
			 */
			System.out.println("두 문자열 같습니다");
		}else {
			System.out.println("두 문자열은 같지 않습니다")
			;
			/*문자열1 입력 :
			ksh
			문자열2 입력 :
			ksh
			true
			두 문자열 같습니다
			*/
			
		}
		sc.close();
	}
}
