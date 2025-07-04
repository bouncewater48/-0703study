package SingTask;

import java.util.Scanner;

//과제 : 코인 노래방 프로그램
public class SingTask03 {
	public static void main(String[] args) {
//		한 곡당 300원인 코인노래방이다. 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
//		금액입력 : 1000
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
		
//		클래스명 : SingTask03
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공
//		(6일차에 배운 내용만 사용)
		
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("총 부른 곡 수에 따른 보너스 곡 지급");
		choice = sc.nextInt();
		if(choice <= 4) {
			System.out.println("보너스 곡이 없습니다");
		}else if(choice > 4){
			System.out.println("보너스 1곡 추가 제공");
			
		}	
	  }
	} 

