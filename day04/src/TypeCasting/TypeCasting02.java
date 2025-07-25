package TypeCasting;
//12번 : 강제형변환
public class TypeCasting02 {
	public static void main(String[] args) {
		// 형변환 연산자 (자료형)을 사용하여 강제 형변환을 한다
		// 주로 큰 범위를 가진 자료형에서 작은 범위로 변환 시 데이터 손실이 발생할 수 있다
		// 컴파일러는 명시적인 강제 변환이 없으면 오류를 발생시킨다
		
		// 1) 실수 -> 정수
		double num1 = 3.141592;
//		int result1 = num1; / cannot convert from double to int 
		int result1 = (int)num1; //변환할 자리형을 넣어야 변환되서 출력됨
		System.out.println(result1);
//		int로 정수만 표현한다 했으니 소수점 뒤를 버리고 정수 3만 출력함
		System.out.println("실수형 num1의 값 : " + num1 +","
				+ " 정수형으로 변환된 값 : " + result1);
//		num1은 double 실수형 값으로 표현한다 해서 앞은 소수자리 3.141592가 모두 표기되나,
//		뒤 result1은 int 정수형값만 표현한다했으므로 소수점을 모두 버려 3만 표기됨, 이 상태로 각각 표기
		
		// 2) 큰 범위 정수 -> 작은 범위 정수
		long num2 = 1000L; //8byte
//		int result2 = num2; //4byte, long타입에 만든것을 int타입에 담을수는 없음
		int result2 = (int)num2; //그러나, (int)를 num2 앞에 붙혀서 강제형변환은 가능!
		System.out.println("long 타입 num2의 값 : " + num2
				+", int타입으로 변환된 값 : " + result2);
//		1000L은 long 범위 (-2,147,483,648 ~ 2,147,483,647)안의 숫자이므로 정상적으로 변환되고
//		result2 또한 강제형변환으로 정상적으로 1000이 그대로 변환되었기에 둘 다 1000으로 출력됨

		// 3) 범위 초과
		long num3 = 2147483648L;
		int result3 = (int) num3;
		System.out.println("long타입 num3 값 : " + num3 +", 왜곡된 값 : " + result3);
//		int타입이 표현할 수 있는 값인 2147483647을 넘어서 초과했기에 왜곡되서 음수로 나옴, 오버플로우
		// 음수가 나타나는 이유(overflow의 원리)
		// int의 범위는 32bit 자료형
		// 값의 범위 -2,147,483,648 ~ 2,147,483,647 < 중간에 0이 포함되므로 647로 끝남
		// long에서 int로 변환 => 2147483648은 int의 범위를 초과하므로 상위비트(초과된 비트)가 잘리게 된다
		// 잘린값은 2의 보수 형식으로 계산되며 음수값으로 변환된다
		// 32비트 : 1000 0000 0000 0000 0000 0000 0000 0000(0 하나가 0과 1을 표현가능한 bit)
		
		// 값 왜곡은 작은 자료형으로 형변환시 발생할 수 있는 문제이고 강제 형변환은 값의 범위를 
		// 초과하지 않을 때만 사용해야한다
		// 필요한 경우 변환하기 전에 범위를 먼저 확인해야한다!
	}
}
