package Homework;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		
//[과제 제출 기한] 매일 pm 11시 30분까지 제출
//* 코드 해석 - TypeCasting02, ScannerTask02,ScannerTest03, OperTask01~03
//* 코드 작성 2문제(로직구성 필수)
		
//2. 이름과 나이를 입력받아 내년 나이를 출력하기(nextInt() 사용금지)
//클래스명 : Day05_2
//
//[입출력 예시]
//이름 : 홍길동
//나이 : 20
//홍길동님의 내년 나이는 21살입니다.
//만 나이는 19살입니다.
//(생일 안 지났다 가정하고 만 나이 작성)		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		System.out.println("나이 : ");
		System.out.println("님의 내년 나이는 " + "살 입니다.");	
		System.out.println("만 나이는 " + "살입니다.");
//		String name = "홍길동"; //뭘 작성하든 홍길동만 작성된다 이거
		String name = sc.nextLine(); //이름 작성한거 그대로 출력되게 하는거
//		String name2 = sc.next();
		int age = 27;
		int age1 = --age;
		sc.next();
//		sc.next();
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n" +  name  
		+ "님의 내년 나이는 " + ++age +  "살입니다." + "\n만 나이는 " + age1  + "살입니다.");
		
//		이름 : 
//			나이 : 
//			님의 내년 나이는 살 입니다.
//			만 나이는 살입니다.
//			홍길동
//			20
//			이름 : 홍길동
//			나이 : 20
//			홍길동님의 내년 나이는 21살입니다.
//			만 나이는 20살입니다.
	
	}
}
