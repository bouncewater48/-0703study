package WhileTest;

import java.util.Scanner;

//11번 : do ~ while문
public class DowhileTest {
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 3) {
//			System.out.println("i의 값 : " + i);
//			i++; //무한루프에 안빠지게 하기 위해 넣은 증감식
//		}
		
//		i = 1;
//		do	{
//			System.out.println("i의 값 : " + i);
//			i++; //while문의 증감식과 같은 역할!
//		}while(i <= 3); //조건식의 결과가 false면 {}안으로 안들어가고 true일때만 들어감
//		위쪽 일반 while문도 주석처리 해제하고 실행시키면 i의 값 : 4도 출력되는데,
//		이유는 위쪽 while문의 i++;가 아래 do while문까지 침범해서 실행되기 때문이다
		
		//사용자가 100보다 큰 수를 입력할 때까지 반복(=100 이하의 수를 입력하면 계속 반복하겠다)
		Scanner sc = new Scanner(System.in);
		int num;//입력만 하면 do while문에선 무한루프가 터짐
		do {
			System.out.println("100보다 큰 수를 입력해야 반복문 탈출합니다.");
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			System.out.println("입력한 수는 " + num + "입니다.");
		}while(num <= 100);
		
		//중괄호 안을 먼저 실행, 그 후 num <= 100을 확인, false가 떴으면 다시 중괄호 안을 실행... 반복
		
		/*
		100보다 큰 수를 입력해야 반복문 탈출합니다.
		숫자를 입력하세요 : 
		10
		입력한 수는 10입니다.
		100보다 큰 수를 입력해야 반복문 탈출합니다.
		숫자를 입력하세요 : 
		1
		입력한 수는 1입니다.
		100보다 큰 수를 입력해야 반복문 탈출합니다.
		숫자를 입력하세요 : 
		100
		입력한 수는 100입니다.
		100보다 큰 수를 입력해야 반복문 탈출합니다.
		숫자를 입력하세요 : 
		1000
		입력한 수는 1000입니다.
		*/
		
		
		
	}
}
