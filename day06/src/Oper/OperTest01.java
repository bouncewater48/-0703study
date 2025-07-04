package Oper;
//3번 : 관계 연산자와 논리 연산자
public class OperTest01 {
	public static void main(String[] args) { //main 시작
		
		System.out.println("======관계 연산자======");
		
//		int num1 = 10, num2 = 20, num3 = 10;
//		System.out.println("num1 > num2 : num1이 num2보다 크니? " + (num1 < num2));
		/*
		 * ======관계 연산자======
		num1 > num2 : num1이 num2보다 크니? true
		 */
		
//		int num1 = 10, num2 = 20, num3 = 10;
//		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
//		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
//		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
//		System.out.println(num1 + " >= " + num2 + " : " + (num1 <= num2));
//		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
//		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		
		/*
		======관계 연산자======
		10 > 20 : false
		10 < 20 : true
		10 >= 20 : false
		10 >= 20 : true
		10 == 20 : false
		10 != 20 : true
		 */
		
		int num1 = 10, num2 = 20, num3 = 10;
		System.out.println(num1 + " > " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));
		
//		System.out.println(10 >= "10"); 아래의 문자와 정수를 비교할 수 없다는 오류 발생!
		//The operator >= is undefined for the argument type(s) int, String
		
		System.out.println("\n======논리 연산자======");
		System.out.println("and : 둘 다 참이면 참(&&)");
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false
		System.out.println(false && false);	//false
		
		System.out.println("\nor : 둘 중 하나라도 참이면 참(||)");
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		System.out.println("\nnot : 둘 중 하나라도 참이면 참(!)");
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		

	} // main 끝
}
