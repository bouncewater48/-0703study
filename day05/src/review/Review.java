package review;
//1번 : 복습
public class Review {
	public static void main(String[] args) {
			
		//printf() : 서식에 맞춰 출력하고 줄바꿈되지 않는 출력 메소드
		System.out.printf("'%s' '%d' '%f' '%s'\n", "hello", 2025, 6.17, true);
		System.out.printf("'%-7.2s' '%05d' '%10.2f' '%-5s'\n", "hello", 2025, 6.17, true);
		// 줄바꿈 \n을 안했기에 옆에 그대로 출력
		// 실수 xnf는 앞에 .을 붙혀야 적용!
		// 문자열, 정수 앞에 -를 붙히면 좌측정렬, -를 안 붙히면 우측정렬
		// f는 기본적으로 8자리를 지정하기에 그보다 큰 숫자를 지정하면 그만큼 공백도 추가됨
		
		//변수
		byte num1 = 5;
		byte num2 = 127; // byte는 -128~127이기에 128을 넣으면 오류가 뜸
		System.out.println(num1);
		System.out.println(num2);
		int num3 = 128;
//		byte num4 = num3; 더 큰 값을 넣을순 없음
		byte num4 = (byte) num3; 
		System.out.println(num4); 
		//강제변환을 하니 출력은 되는데 overflow가 일어나 음수로 출력
		
		
		
	}
}
