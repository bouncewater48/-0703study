package TypeCasting;
//11번 : 자동 형변환
public class TypeCasting01 {
	public static void main(String[] args) {
//		1)작은 자료형의 값을 큰 자료형으로 변환
//			int(4byte) -> long(8byte)
		int iVal = 100;
		long result1 = iVal; //int형 값 100을 long타입 변수에 대입(자동형변환)
		//자동형변환 한것, 100이 iVal에 담겨있고 iVal을 다시 long에 담은것
		System.out.println(iVal); //100
		System.out.println(result1); //
		
//		long iVal = 100;
		
		// int(4byte) -> float(4byte)
		float result2 = iVal;
		System.out.println(result2); //%f(실수형)이 소수점까지 표현 가능하므로 더 크다
		
		// int(4byte) -> double(8byte)
		double result3 = iVal;
		System.out.println(result3);
		
		// double(8byte) -> long(8byte)
//		long result4 = result3; 
		//long에는 소수점이 담겨있으나 long에는 소수점이 안담겨있어서 담기지 않으므로 오류발생
//		result3은 100.0 실수타입으로 정수형 변수에 담길 경우 소수점의 손실이 발생하므로 자동형변환 불가능
		
		// float(4byte) -> double(8byte)
		double result4 = result2; //더 작은 바이트를 더 큰 바이트에 저장하므로 가능
//		float result5 = result3; //float는 6자리까지만 표현되나 double은 15자리가 가능하므로 더 작아서 못담음
//		double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문
//		double 타입 : 소수점 이하 15자리까지, float 타입 : 소수점 이하 6자리까지
		
		//2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int iVal2 = 10; // 정수 10을 iVal2에 담겠다
		double dVal2 = 3.14; // 실수 3.14를 dVal2에 담겠다
		System.out.println(iVal2 + dVal2);	//정수 iVal2와 실수 dVal2를 더했을때
		// 정수+실수는 실수(소수점자리까지 나오는거)로 출력되므로 13.14가 출력
		double result6 = iVal2 + dVal2; //float는 담길 순 있으나 담지 못하므로 쓰지 말것
		System.out.println(result6); //8byte안에 4byte를 담아서 쓸 수 있으므로 13.14가 정상적으로 출력됨
		
		//3) 문자형에서 정수형으로 변환
		char letter = 'a';
		int ascii = letter;
		System.out.println(letter); //	a는 문자형 그대로 나옴
		System.out.println(ascii);	//	유니코드로 변환했을때 97로 변환되는거(외우진 못함, 코드로 확인할것!)
		
		char letter2 = 'b';			
		int ascii2 = letter2;
		System.out.println(letter2);
		System.out.println(ascii2);
		
		char letter3 = 'A';
		int ascii3 = letter3;
		System.out.println(letter3);
		System.out.println(ascii3);
		
		char letter4 = '가';
		int ascii4 = letter4;
		System.out.println(letter4);
		System.out.println(ascii4);
		
//		char letter(N)은 모두 문자형이므로 그대로 출력되나, 정수형 ascii는 각 문자마다 할당된
//		아스키코드를 정해진 값에 따라 반환하므로 문자마다 고정된 정수가 출력됨
	}
}
