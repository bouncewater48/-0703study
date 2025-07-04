package MethodTest;
// 11번 : 메소드 호출방법
public class MethodTest02 {
	public static void main(String[] args) {
	
		//메소드 호출 시 2가지
		//1) 메소드 정의하는 부분에서 static키워드를 붙힌다
		//(static 키워드 배울때까지는 사용하지 않는다)
		//main메소드가 메모리에 할당될 때 해당 메소드도 같이 메모리 할당시키는 방법
		//과제할때 static 쓸 생각 말고 아래 2번 방식만 쓸것
		
		//2) 메인 메소드에 해당 메소드가 있는 클래스를 알려준다
		//클래스명 객체명 = new 클래스명();
		
		//1-2) mt라는 매개변수 작성
		MethodTest02 mt = new MethodTest02();
//		System.out.println(mt);
		//MethodTest.MethodTest02@1f32e575
		
		//매개변수x, 리턴값x 메소드 호출 => 객체명.메소드명();
		//1-3) 출력(호출)
		mt.printHello();
		//안녕하세요!
		
		//2-2)출력
		//매개변수o, 리턴값 x 메소드 호출 => 객체명.메소드명(실제값 (인수) 전달);
		mt.greet("강승훈"); //"강승훈"이라는 문자열을 greet안에 넣겠다
		mt.greet("짱구");
		mt.greet("철수");
		
//		매개변수x, 리턴값o 메소드 호출 => syso(객체명.메소드명());
//							or 리턴타입 변수명 = 객체명.메소드명();
		
		
//		mt.greet(null); null(문자열의 기본형)이라도 넣어야 출력이 됨,
//		String이라서 문자열밖에 안되고 다른 정수형이나 논리형은 오류 발생하고 호출 못함!
		//greet라는 메소드를 한번 만들었으면 몇번이든 사용가능함
		//동적메모리를 만들때마다 거기에 맞게 알아서 올라감
//		안녕하세요!
//		강승훈님 환영합니다!
//		짱구님 환영합니다!
//		철수님 환영합니다!

//		3-6
		System.out.println("1부터 10까지의 합 : " + mt.printTotal());
		int number = mt.printTotal();
		System.out.println(number);
//		1부1부터 10까지의 합 : 55
//		55
		
		
		//매개변수o, 리턴값o 메소드 호출 => syso(객체명.메소드명(인수));
//							or 리턴타입 변수명 = 객체명.메소드명(인수);
		System.out.println(mt.printNum(3));
		System.out.println(mt.printNum(100));
		System.out.println(mt.printNum(20));
		
		
	}
	
	//매개변수x, 리턴값x, 메소드 정의
	//1-1)"안녕하세요" 출력하는 메소드
	void printHello() { //mt.printHello라는 메소드를 찾아오겠다
		for(int i = 0; i <3; i++) {
//			안녕하세요가 3번 출력되게 만듦
//			안녕하세요!
//			안녕하세요!
//			안녕하세요!
		System.out.println("안녕하세요!"); //메소드 정의 끝
		}
	} // printHello라는 메소드를 찾아서 다시 올라감
	
	
	//매개변수 o, 리턴값 x 메소드 정의
	//2-1)이름 + 님 환영합니다! 출력하는 메소드
	void greet(String name) { //greet라는 메소드를 찾아오겠다
		System.out.println(name + "님 환영합니다!");
	} //이러고 여기서 출력이 아니라 다시 greet라는 메소드가 사용된 위쪽으로 다시 찾아올라감
	
	//매개변수 x, 리턴값 o 메소드 정의
	//1부터 10까지의 합을 반환하는 메소드
	
	int printTotal() {
		//3-1) 총합 구할 변수
		int total = 0;
		//3-2) for문 초기식 int i = 1; i <= 10; i++
		for(int i = 1; i <= 10; i++) {
			//3-3)	총합구할변수 += i;
			total += i;
		}
		//3-4) 출력x, 반환값으로 설정해야함
//		System.out.println("총합 : " + total); //출력하는거 아님!
		//3-5) 반환값
		return total;
	}
	
	
	
	//매개변수 o, 리턴값 o 메소드 정의
	//정수 1개를 넘겨받아 1부터 넘겨받은 정수까지의 합을 반환하는 메소드
	
	printNum(int num) {
		//1부터 num까지의 합 반환하는 기능
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total += i;
			// 합을 구하는 로직 구성
		}
		return total;
	}
	
	
	
	
	
	
}
