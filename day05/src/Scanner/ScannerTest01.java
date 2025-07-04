package Scanner;

import java.util.Scanner;

//5번 : 입력클래스(Scanner)
public class ScannerTest01 {
	public static void main(String[] args) {
		
//		System.out.println();
//		String name = "강승훈"
		
		//입력 클래스
		//입력 메소드를 사용하기 위해서 11번 라인의 한줄이 반드시 작성되어야한다 ↓
		//자동 import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in); //Scanner의 S는 무조건 대문자!!
		//import를 한번만 받으면 scanner를 여러번 사용가능!
		System.out.println("이름 입력 : ");
//		String name = sc.next(); //next() 입력 메소드(이름뒤에 소괄호):
		// 콘솔창에서 입력을 받고 입력받은 값을 String 타입으로 가져오는 기능을 한다
//		System.out.println(name + "님 환영합니다.");
		//콘솔에 빨간색 정지표시(Terminate)가 떠있을때는 콘솔창에 직접 입력 가능
		//이 상태에서 콘솔창에 작성하고 엔터 누르면 콘솔창에 결과 나옴
		// 띄워쓰기를 하면 띄워쓰기 전 내용만 입력되고 나머지는 입력되지 않음
		
		String name1 = sc.nextLine();
		String name2 = sc.next();
//		String name3 = sc.next();
		System.out.println(name1);
		System.out.println(name2);
//		System.out.println(name3);
//		String name4 = sc.next();
		//next는 스페이스바와 엔터를 처리하는 역할
		//nextLine : 문자열로 반환
//		System.out.println(name4);
		
		
		//sc.next();
		//이 상태로 실행하면 콘솔창 입력대기상태
		//next 메소드의 숫자만큼 입력문을 추가로 작성가능!
		//이 상태로 작성시에 띄워쓰기를 포함한 모든게 buffer에 저장됐다가 출력됨
	}
}
