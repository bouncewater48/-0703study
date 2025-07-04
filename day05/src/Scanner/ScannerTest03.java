package Scanner;

import java.util.Scanner;

//7번 : 입력클래스, 입력메소드 연습
public class ScannerTest03 {
	public static void main(String[] args) {
		//1. 사용자로부터 입력받아 주소를 출력하기
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import(불러오기), 입력 클래스를 불러와서 콘솔창에 입력이 가능해진 상태
//			ctrl + shift + o
				
		//3) 문자열 변수 선언
		String address;
		//address 라는 문자열 변수를 추가하겠다는 선언
		
		//+) 출력 메시지
		System.out.println("주소를 입력하세요.");
		// 콘솔창에 "주소를 입력하세요." 출력
		
		//4) 입력메소드 사용
//		address = "서울시 강남구 역삼동"; 
		address = sc.next(); // 서울시만 출력되게 하고싶으면 next()만 사용해야함, 공백 뒷부분은 버퍼에 저장하고 출력이 안되므로
//		address = sc.nextLine(); // 서울시 강남구 역삼동이 모두 출력되게 하고싶으면 nextLine()을 사용해야함, 공백을 포함한 줄 전체를 출력해주므로
//		주소를 입력하세요.
//		서울시 강남구 역삼동
//		주소는 서울시입니다 < next() 입력메소드를 사용해서 나온 결과
//		address라는 문자열에 "서울시 강남구 역삼동"이라는 내용을 입력하고 저장함
		
		//5) 결과출력
//		System.out.println("주소는 " + address + "입니다");
//		주소를 입력하세요.
//		서울시 강남구 역삼동 
//		주소는 서울시 강남구 역삼동입니다 < nextLine() 입력메소드를 사용해서 나온 결과

		System.out.printf("주소는 %s입니다.", address);
//		주소를 입력하세요.
//		코리아IT아카데미
//		주소는 코리아IT아카데미입니다. < nextLine() 메소드가 4)에서 next 위가 아닌 아래로 내려와야 같이 출력됨
		
		 //6) 입력클래스 해제
	      sc.close();
	      // 입력 클래스를 해제해서 콘솔에 더이상 작성하지 못하게 만듦
//		↑위에 과정이 Logic임
	}
}
