package Oper;
//14번 : 증감연산자
public class OperTask02 {
	public static void main(String[] args) {
		
		int num = 1; //num을 정수 1로 변경한다
		System.out.println("num의 값 : " + num); //num의 값 1을 나타냄
		System.out.println("num + 10의 값 : " + (num + 10));
		//위에서 더해진 num1에 10을 더하고 나타내므로 11이 된다
		
		System.out.println("======증감연산자(전위형)======");
		System.out.println("기존 num의 값 : " + num); 
		// 기존 num1=1이라는 결과를 보여준다
		System.out.println("전위증감연산자를 사용한 num의 값 : " + ++num); //2
		//기존 num=1에 전위형으로 1증가를 작성하여 즉시 2가 된다
		System.out.println("현재 num의 값 : " + num); //2
		//위에서 2가 된 상태 그대로를 의미
//		num의 값 : 1
//		num + 10의 값 : 11
//		======증감연산자======
//		기존 num의 값 : 1
//		전위증감연산자를 사용한 num의 값 : 2
//		현재 num의 값 : 2
		
		System.out.println("======증감연산자(후위형)======");
		int num2 = 1; // num2를 정수 1로 변경한다
		System.out.println("기존 num2의 값 : " + num2); //1
		//기존 num2=1이라는 결과를 보여준다
		System.out.println("후위증감연산자를 사용한 num2의 값 : " + num2++); //1
		// 기존 num2=1에 후위증연산자로 더했음을 나타내나 후위증은 다음줄에 연산되므로 아직 1이다
		System.out.println("현재 num2의 값 : " + num2); //2
		//후위증연산자로 더해졌던 1이 한줄 더 내려오자 더해져서 2가 됐다
		
//		======증감연산자(후위형)======
//				기존 num2의 값 : 1
//				후위증감연산자를 사용한 num2의 값 : 1
//				현재 num2의 값 : 2

		System.out.println();
		int num3 = 7, num4 = 7;
		//num3과 num4를 정수 7로 변환
		int result1 = 0, result2 = 0;
		//result1과 2가 현재 정수 0임을 나타낸다
		
		result1 = --num3 + 4;
//		저장공간	   (6-1) + 4 = 10
		System.out.println(result1);
		
//		result2 = num4++ -4
		result2 = num4++;
		System.out.println(result2); //아직 num4 뒤의 ++는 적용이 안되서 7
		System.out.println(num4); //한칸 내려가서야 +1해서 8
		result2 = num4++ -4;
		System.out.println(result2);
				// 7     -4 +1 = 4, 먼저 연산이 진행된 후에 ++ 진행
	}
}
