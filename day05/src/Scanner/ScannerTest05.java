package Scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTest05 {
	public static void main(String[] args) {
		//1. 본인의 이름과 성별을 입력받고 출력하기 (next()만 사용)
		//입력 예> 이름 입력 :
		//입력 예> 성별 입력 :
		//출력 예> 이름은 000이고 00입니다
		
		//로직 구성
		
//		내가 한것
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 입력 : .");
//		System.out.println("성별 입력 : .");
//		String name1 = sc.next(); //sc.next()의 소괄호는 무조건 비워두기!
//		String name2 = sc.next(); //sc.next()의 소괄호는 무조건 비워두기!
//		System.out.println("이름은 " + name1 + "이고 " + name2 + "입니다");
////								   +와 + 사이에 String 지정한 값을 채워넣기!
//		System.out.println(name1 + name2);
		
		
//		강사님꺼
//		1) 입력 클래스 선언 + 입력 클래스 import
		Scanner sc = new Scanner(System.in);
//		2) 이름과 성별 입력 메시지 출력
//		System.out.println("이름과 성별을 띄워쓰기로 입력하세요 : ");
		System.out.println("이름 입력하세요 : ");
//		3) 문자열 변수(name, gender) 선어
		String name, gender;
//		4)변수에 입력 메소드 사용(next())
//		String name = sc.next() 위에서 따로 선언했기에 여기선 초기화만 해야함
		name = sc.next();
//		5) 성별 입력 메시지 출력
//		gender = sc.next();
		System.out.println("성별을 입력하세요 : ");
		char gender2 = sc.next().charAt(0);
//		6) 결과 출력
		System.out.printf("이름은 %s이고, 성별은 %s입니다.", name, gender2);
//		이름과 성별을 띄워쓰기로 입력하세요 : 
//			강승훈 남성
//			이름은 강승훈이고, 성별은 남성입니다.
	
//	클래스 선언과 클래스 import를 하나로 묶고 변수 선언과 메소드 사용을 하나로 묶으면 더 줄이기 가능!
	}
}
