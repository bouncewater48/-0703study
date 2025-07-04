package MethodTest;

import java.util.Scanner;

public class MethodTask02_1 {
	public static void main(String[] args) {}
		Scanner sc = new Scanner(System.in);
//	}
	// 1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
	// 메소드명 : checkNum

//		while(true) {
//			System.out.println("숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//			if(num % 2 == 0) {
//				System.out.println("짝수입니다.");
//				}else {
//					System.out.println("홀수입니다.");
//			}break;
//		}	

//		 int checkNum(int num) {
//			return num % 2;
//		 }

	void checkNum(int[] ar) {
//		 int i = ' ';
//		String result = "";
//		int num1 = ar[0];
//		int num2 = ar[0]; {
		System.out.println("숫자를 입력하세요 : ");
		int num1 = 0;
		int i = sc.nextInt();
		int num1 = sc.nextInt();
			for (int i = 2; i < ar.length; i++) {
//				num1 = 2 % 2;
				if(i % 2 == 0) {
					System.out.println("짝수입니다");
				}else {
					result = "홀수입니다";
				}
			}
			System.out.println(i);
//			 return result;
//		}

//			}				
//		}
//	}
//}	
//		 MethodTask02_1 mt = new MethodTask02_1();

	}

}
