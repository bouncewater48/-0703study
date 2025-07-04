package variable;
//6번 : 변수를 사용하는 이유
public class Valiable05 {
	public static void main(String[] args) {
//		1) 반복되는 값을 쉽게 관리하기 위해서(값을 재사용하기 위함)
//		같은 값을 여러곳에서 사용하거나 변경해야할 때 변수에 저장하면 코드 수정이 간편해진다
//		변수값을 변경하면 해당 변수를 참조하는 모든 코드에 변경사항이 자동으로 적용된다
		
		int price = 100, quantity = 5; //가격은 100원, 수량은 5개
		System.out.println("가격 : " + price); //가격 :100, 문자형과 정수형을 +로 묶으면 같이 출력 
		System.out.println("수량 : " + quantity); //수량 : 5
		System.out.println("총 가격 : " + (price * quantity)); //*를 사용하면 곱셈한 값이 출력  
//		기본적으로 오른쪽에서 왼쪽으로 출력되나, 일반 수학과 같이 *,/가 +,-보다 우선순위가 높다.
//		price * quantity는 (price * quantity)와 동일한 상태다.
//		변수를 바꾸면 해당 내용은 즉시 반영됨!
		
		price = 200;
		System.out.println("가격 : " + price); //가격 :100, 문자형과 정수형을 +로 묶으면 같이 출력 
		System.out.println("수량 : " + quantity); //수량 : 5
		System.out.println("총 가격 : " + (price * quantity)); //*를 사용하면 곱셈한 값이 출력  
//		프로그램은 항상 위에서 아래로 실행되므로, 아래에서 수정해도 위에는 영향이 안간다.
//		변수는 하나의 값만 저장하므로 바꾸면 이전꺼는 저장되지 않음.
		
//		2) 값에 의미를 부여하기 위해서 (값에 이름을 붙혀준다)
//		변수에 이름을 붙히면 코드의 의미를 명확히 전달할 수 있다.
//		문자열이나 숫자를 직접 사용하는 것보다 변수명을 통해서 코드의 목적을 쉽게 이해할 수 있다
		
		int userAge = 20; //변수명을 제대로 안쓰면 뒤의 값만 보고 무엇인지 알 수가 없음,그래서 의미있는 단어로 작성해야함
		final double PI = 3.141592; //상수는 대문자로!
		boolean isStudent = false; 
		
		System.out.println("사용자 나이 : " + userAge); //+는 덧셈이 아닌 연결
		System.out.println("원주율 값 :" + PI );
		System.out.println("학생입니까? " + isStudent);
		//문자열 + 변수명(값) => 연결되어 출력된다.
		
//		3) 프로그램의 가독성, 유지보수성, 재사용성을 높히기 위해서 사용한다
//		코드에서 직접 값을 사용하는 매직넘버를 피하고 변수를 사용하면 수정과 유지보수가 용이하다
		
		int number; //RAM 안에 만들어지고, JVM이 관리한다. 이 상태에선 위치를 알 수 없음
					//RAM에서 상자를 만들고 그 상자의 이름을 number로 지정
//		System.out.println(number); Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The local variable number may not have been initialized, 초기화 안됐으니 해라
		number = 10; // number. 상자에 10이라는 정수형 값을 저장, 이 number 상자는 RAM에서 특정 주소값을 가진다.
		System.out.println(number); //number = 10;으로 변수명을 지정하니 출력
//		컴퓨터는 number의 주소값을 보고 RAM에서 데이터를 읽어온다
//		주소값에 있는 데이터를 출력한다.
	}
}
