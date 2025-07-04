package variable;
//5번 : 변수와 상수의 차이
public class Variable04 {
	public static void main(String[] args) {
//			변수 선언
//			자료형 변수명 = 값;
			
//			상수 선언
//			final 자료형 변수명 = 값;
		
//			student라는 변수에 20이라는 값을 저장한다
			int student = 20;
		
//			MAX_STUDENT라는 상수에 25라는 값을 저장한다
			final int MAX_STUDENT = 25;
			
//			출력
			System.out.println(student);
			System.out.println(MAX_STUDENT);
//			위 2개는 개발환경에서 해당 문자로 쓰기로 약속한것이므로, 다르게 쓰면 오류가 발생!
			
			
//			변수에 저장되어있는 값 변경
			student = 25; //값을 변경하고싶으면 아래에 새로운 값으로 다시 작성하면 됨
			System.out.println(student);
			
//			상수에 저장되어있는 값 변경 불가능!
//			MAX_STUDENT = 20; // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The final local variable MAX_STUDENT cannot be assigned. It must be blank and not using a compound assignment
//			final을 지우라는 뜻 , 위에 final int MAX_STUDENT = 25;에서 final을 지우면 해결됨
			
			
	}
}
