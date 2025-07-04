package Scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask01 {
	public static void main(String[] args) {
		
		//1. 줄 단위로 입력받아 출력하기
		//(입력은 반드시 3번 입력받을것, 출력은 1번만 사용해서 출력형태만들기)
		//입력1 : 자바는 
		//입력2 : 객체지향
		//입력3 : 언어입니다
		//[출력]
		// 자바는
		// 객체지향
		// 언어입니다
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("자바는");
//		System.out.println("객체지향");
//		System.out.println("언어입니다");		
//		String name, number;
//		String number1 = sc.nextLine();
//		String number2 = sc.nextLine();
//		String number3 = sc.nextLine();	
//		name = sc.next();
//		name = sc.next();
//		name = sc.next();
//		System.out.println("자바는");
//		System.out.println("객체지향");
//		System.out.println("언어입니다");		
		
		//1) 입력클래스 import
		//2) 출력메시지1
		//3) 문자열 변수 선언, next()
		//4) 출력메시지2
		//5) 문자열 변수2 선언, next()
		//6) 출력메시지3
		//7) 문자열 변수3 선언, next()
		//8) 출력 println
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력1 : ");
//		String str1 = sc.nextLine();
//		System.out.println("입력2 : ");
//		String str2 = sc.nextLine();
//		System.out.println("입력3 : ");
//		String str3 = sc.nextLine();
//		System.out.println(str1 + "\n" + str2 + "\n" + str3);
	
		
//		입력1 : << 이거 한번에 입력 1,2,3 다 나오는거 아니고 입력1부터 입력해야 아래가 입력된다
//		자바는
//		입력2 : 
//		객체지향
//		입력3 : 
//		언어입니다
//		자바는
//		객체지향
//		언어입니다

		
		
		
		//2. 이름과 나이, 취미를 순서대로 입력받기
				// (입력메소드 이름과 취미 nextLine()사용,나이는 next()사용)				
				//출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것, 덧셈연산자 사용
				
				//이름입력 : 홍길동
				//나이입력 : 20
				//취미입력 : 여행
				//홍길동은 20살이고 취미는 여행입니다.
				//홍길동은 2026년에 21살입니다.
//	본인	
//		System.out.printf("은 20살이고 " + "는 여행입니다");
//		System.out.printf("은 2026년에 " + "살입니다");
//		String name2 = sc.next();
//		String age = sc.next();		
//		String con = sc.next();		
//		System.out.println(name2);
//		System.out.println(age);	
//		System.out.println(con);	
//		char name2 = sc.next().charAt(0);
//		System.out.printf("name2" +"은 20살이고" + "con" +"은 여행입니다" );
//		System.out.printf("name2" +"은 2026년에" + "age" +  "살입니다");
//		홍길동
//		20
//		여행
//		은 20살이고 는 여행입니다은 2026년에 살입니다
		
		//1) 입력 클래스, import
		//2) 입력 메시지 출력
		System.out.print("이름 입력 :");
		//3) String 변수 3개,
		String name, age, hobby;
		//4) name 변수 = nextLine()
		name = sc.nextLine();
		//5) 입력 메시지 출력
		System.out.print("\n나이 입력 : ");
		//6) age 변수 = next()
		age = sc.next();
		//7) 버퍼 비우기
		sc.nextLine();
		//8) 입력메시지 출력
		System.out.print("\n취미 입력 : ");
		//9) hobby 변수 = nextLine()
		hobby = sc.nextLine();
		//10) 결과 출력 printf(), 형변환 덧셈연산 후 출력
		System.out.printf("%s의 나이는 %d이고 취미는 %s입니다\n", name, Integer.parseInt(age), hobby);
		System.out.printf("%s은 2026년에 %d입니다", name, Integer.parseInt(age) + 1);
		//여기서 보여주는 빨간줄(에러)표시는 컴파일러
		
//		이름 입력 : 홍길동
//
//		나이 입력 :  20
//
//		취미 입력 :  여행
//		 홍길동의 나이는 20이고 취미는  여행입니다
//		 홍길동은 2026년에 21입니다
	}
}
