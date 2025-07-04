package review;
// 0번 : 복습 2번
import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
		
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		[조건]
//		초기 잔액은 10,000으로 설정
//		메뉴 선택에 따라 작업 수행
//		종료시 프로그램 종료
//		숫자(번호)로 입력받기
//
//		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요: "
//			+ "\n1. 잔액조회"
//			+ "\n2. 입금"
//			+ "\n3. 출금"
//			+ "\n4. 종료"
//			+ "\n선택 : ";
//		그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//			
//		위에 String msg부터 "선택 : "; 까지 다 그냥 2번 출력용 메세지임
//		번호 입력시 해당 메시지만 출력하고 끝
		
		//1) 입력 클래스 import
		//2) 정수형 변수 choice,Money , 문자열 메시지(msg) 변수
		//3) 반복문(while문 true) < 언제 끝날지 모르니까 무한반복문 사용
		//	3-1) 입력메시지 출력
		//	3-2) choice 입력메소드 nextInt()
		//	4) switch문
		//	4-1) case 1
		//		4-1-1) 	잔액조회 출력
		//		4-1-2)	break;
		//	4-2) case 2
		//		4-2-1)	입금 출력
		//	4-3) case 3
		//		4-3-1)	출금 출력
		//	4-4) case 4
		//		4-4-1)	종료 출력
		//		4-4-2) sc.close();
		//		4-4-3)	return; < break가 아니라 프로그램을 완전히 멈추는 명령어
		//	4-5) default;
		//		4-5-1)	다시선택 출력
		//		4-5-2)	break;
		
		Scanner sc = new Scanner(System.in);
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요: "
				+ "\n1. 잔액조회"
				+ "\n2. 입금"
				+ "\n3. 출금"
				+ "\n4. 종료"
				+ "\n선택 : ";
//		final int MONEY = 10000; <얘를 상수로 설정하면 나중에 입금/출금 후 잔액이 바뀌는걸 설정하지 못함, 이대로 고정된 상태
		int money = 10000, choice = 0;
		boolean isTrue = true;
		while (isTrue) {
			System.out.println(msg); //무한루트 입력
			choice = sc.nextInt(); //무한루트 멈추고 고정
			
			switch(choice) { 
			case 1:
				System.out.println("잔액조회 기능입니다.");
				break;//  중괄호에서 아예 탈출이 아니라 switch에서 다음으로만 넘어간다, 중괄호 탈출 아님!
			case 2:
				System.out.println("입금 기능입니다.");
				break;// 중괄호에서 아예 탈출이 아니라 switch에서 다음으로만 넘어간다, 중괄호 탈출 아님!
			case 3:
				System.out.println("출금 기능입니다.");
				break;// 중괄호에서 아예 탈출이 아니라 switch에서 다음으로만 넘어간다, 중괄호 탈출 아님!
			case 4:
				System.out.println("ATM 프로그램을 종료합니다.");
				sc.close();
				isTrue = false;
//				return; //main 종료 => 프로그램 완전히 종료
				break; // 제대로 된 탈출이 아니기에 오류 발생
					
				default:
					System.out.println("다시 선택하세요");
					break; // switch문의 끝을 의미
			}//switch 중괄호 끝
			System.out.println("while문 중괄호 영역 안");
		}//while문 중괄호 끝
		System.out.println(money); //while문 자체가 true로 작성되어있기에 안에서 false가 나올때까지 무한루프인데
		//이렇게 중괄호 밖으로 나갔으면 while문에 해당하지 않음
		//대신 boolean타입을 사용하면 "isTrue ="로 조건을 확인하고, false가 뜨면 자동으로 while문을 탈출하기에
		//while문 바깥의 메소드도 정상작동함
		System.out.println("while문 중괄호 영역 밖");
		
	}//main중괄호 영역
}

//switch라는 메소드 안에서 return이라는 명령어를 만나면 프로그램이 완전히 종료, return 아래에 적힌 모든 메소드는 실행조차 안되서 출력이 불가능해짐
//따라서 메소드 바깥의 메소드도 출력하고싶으면 break문을 사용해야하며, while(true)로만 사용하면 또
//true가 false로 바뀌게 됐을 경우 충돌이 일어나기에 바깥 메소드를 사용하지 못하게됨
//이때 boolean(isTrue)를 사용하면 isTrue가 false로 바뀌게 될 시 단순히 {}를 탈출하기만 하기에
//중괄호 영역 밖의 메소드도 출력이 정상적으로 이루어짐!                                                                                                      
