package review;
//2번 : 다른 자료형 -> 문자열로
// + "" 를 하면 마지막에 문자열로 바꾸는게 가능함!
public class TypeCasting01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		float num2 = 20.17f; //f 안붙히면 double타입이 됨
		long num3 = 30L;
		double num4 = 40.17;
		boolean isTrue = true;
		char alpha = 'a';
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(isTrue);
		System.out.println(alpha);
		
		
		System.out.println(num1 + num3); //정수 + 정수 = 정수
		System.out.println(num2 + num4); //실수 + 실수 = 실수
		System.out.println(num1 + num4); //정수 + 실수 = 실수
		// 실수 + 실수는 소수점 아래쪽도 정밀도때매 채워야해서 딱 떨어지지 않음!
		
		String result1 = num1 + num3 + ""; 
		//변수가 있으면 저장공간을 만든다
		//해석은 왼쪽부터 오른쪽으로 진행한다
		//10 + 30 을 덧셈한 후 문자열로 연결해서 string에 저장함
		String result2 = "" +  num1 + num3;
		//+ "" 없이 그냥 하려하면 result를 float 타입으로 바꾸라 나옴
		//"" 문자열과 num1을 먼저 연결하고 그 후에 num3를 연결함
		// 앞의 10을 30과 덧셈한게 아니라 30 앞에 붙혀서
		//				"10" + 30 =>1030 이 된거임
		//같은 결과를 더해도 문자열을 어디서 연결하냐에 따라서 결과가 달라짐
		System.out.println(result1); //40
		System.out.println(result2); //1030
		System.out.println(isTrue + "");
		System.out.println(alpha + "");
		//a라고 나오지만 저거 문자형 char가 아니라 문자열 string으로 바뀐거임
		
		
		
		
		
		
		
		
		
		
		
	}
}
