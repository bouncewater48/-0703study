package variable;

public class Variable03 {
public static void main(String[] args) {
	
	//1) 문자부터 시작한다
//		int 1num = 10; 숫자부터 시작시 오류 발생
		int num1 = 10;
		int nu1m = 10;
//		int num1 = 100; // 같은 영역 내에서 같은 이름의 변수 선언시 오류발생
		
	//2) 특수문자를 사용할 수 없다(단, _와 $는 가능)
//		int @#$%^& = 100; //_, $가 아닌 특수문자 사용시 오류 발생!
		int a$b_ = 100;
		int _ab$ = 100; // _, $를 먼저  써도 가능하지만 1)문자부터 시작한다 를 생각하기!!
		System.out.println(a$b_);
		
		//3) 공백을 사용할 수 없다(카멜표기법, 스네이크표기법, 파스칼표기법 등을 활용한다)
		//String user name = "강승훈"; //user과 name을 각각 하나의 변수로 인식하여 오류 발생
		//user과 name에 각각 ""를 사용하라고 오류문자가 출력
		String userName = "강승훈";
//		첫 단어는 소문자로 시작, 단어가 바뀔때 첫 문자를 대문자로 작성(=카멜 표기법, 자바의 기본 표기법,
//		변수명/메소드 작성시 사용함)
		String user_name = "강승훈";
//		첫 단어 소문자로 시작, 단어가 바뀔 때 언더바_로 연결해서 작성(스네이크 표기법, 상수 작성시 사용)
		String UserName = "강승훈";
//		첫 단어의 첫 문자를 대문자로 시작, 나머지는 소문자로 사용. 단어가 바뀔 때 첫 문자를 대문자로 작성(파스칼 표기법, class명 작성시 사용)
		
//		4) 키워드(예약어)를 사용할 수 없다
//		int int = 10;
//		int for = 10;
//		int public = 10;
		
//		5) 되도록 소문자로 시작한다(대소문자를 구분)
		int Abc = 100;
		int abc = 200;
		System.out.println(Abc);
		System.out.println(abc);
//		 대문자, 소문자가 하나만 달라도 다른 변수로 인식함!
		
//		name, age, data, number, num1, ... 평소에 쓰는 변수명들!
		
		
		
		
		
	}
}
