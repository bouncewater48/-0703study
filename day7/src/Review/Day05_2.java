package Review;
//2번 : 과제2
import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) { //main 시작
	/*
		2. 이름과 나이를 입력받아 내년 나이를 출력하기(nextInt() 사용금지)
		클래스명 : Day05_2
		
		[입출력 예시]
		이름 : 홍길동
		나이 : 20
		홍길동님의 내년 나이는 21살입니다.
		만 나이는 19살입니다.
		(생일 안 지났다 가정하고 만 나이 작성)	
	*/
		
		//1) 입력 클래스 import
		//2) 정수형 변수 2개 선언
		//3) 입력 메시지
		//4) 이름변수 = nextLine() 사용 int로 형변환 필요
		//5) 입력메시지
		//6) 나이변수 = nextLine() 사용 int로 형변환 필요
		//7) 출력
		//8) 메모리 해제
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println(name + "님의 내년 나이는 " + (age + 1) + "살 입니다.");
		System.out.println("만 나이는" + (age - 2) + "살 입니다.");
		sc.close();
		
	/*
		 * 이름 입력 : 
		강승훈
		나이 입력 : 
		27
		강승훈님의 내년 나이는 28살 입니다.
		만 나이는25살 입니다.
	*/
	} //main 끝
}
