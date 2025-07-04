package twoForTest;
//실습 : Gugudan01
import java.util.Scanner;

public class Gugudan01 {
	public static void main(String[] args) {
	
//		로직구성
//		바깥for문 초기식, 조건식, 증감식
//		안쪽for문 초기식, 조건식, 증감식
//		각 중괄호 영역 안에서의 출력문이 어떻게 될지 작성
//		
	/*	
	1) 단별로 세로로 출력하기
		2단
		2 x 1 = 2
		2 x 2 = 4
		...
		2 x 9 = 18

		3단
		3 x 1 = 3
		3 x 2 = 6
		...
		3 x 9 = 27
		...

		9단
		9 x 1 = 9
		...
		9 x 9 = 81
		*/
		
		Scanner sc = new Scanner(System.in);
//		1) 입력메소드 import, 바깥 for문 시작
//		System.out.println("구구단 숫자 : ");
//		int i = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println();
//		int b1 = 0;
//		for(int i = 0; i <= 10 && 1 <= i  ; i++) {
//			System.out.print(i);
//			for(int b = 0; b <= 9; b++);{
//				System.out.println(b);
//				System.out.println(i * b);
//				System.out.print("i : " + i + ", b :" + b + " ");
//				System.out.printf(a + " x " + b + " = " );
//			}
//			System.out.println();			
//		}
//		
		/*
		for(int i = 1; i <= 3;i++) { //바깥 for문(2행)
//			System.out.println(); //바깥for문 공간
			for(int j = 1; j <= i; j++) { //안쪽 for문(3열)
				System.out.print("i = " + i + ", j = " + j + " ");
//				헷갈릴때는 항상 ↑ 이걸 출력해서 확인해보기
//				System.out.print("*");
			}
			System.out.println(); //바깥 for문공간 
		}*/
//		System.out.println("숫자를 입력하세요");
//		int first = sc.nextInt();
//		int second = sc.nextInt();
//		for(int i = 1; i < first + 1; i++) {
//			for(int j = 1; j <= second; j++) {
//				System.out.print(i + "단 : \n");
//				System.out.println(i + " x " + j + " = "  + (i * j) + "     ");
//			}
//				System.out.println(" ");
//		}
//	
		
	       //이중for문
	       for(int dan = 2; dan <= 9; dan++) { //바깥for문 dan => 2 ~ 9
	    	   //dan의 범위를 2~9사이로 설정하고 1씩 증가시키기
	          System.out.println(dan + "단");
	          //안쪽for문 곱해질 변수 i => 1 ~ 9
	          for(int i = 1; i <= 9; i++) {
	             System.out.println(dan + " x " + i + " = " + (dan * i));
	          }
	          System.out.println();
	       }
	    }
	}
