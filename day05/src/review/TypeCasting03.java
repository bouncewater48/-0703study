package review;
//4번 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 {
	public static void main(String[] args) {
		String data1 = "10";
		String data2 = "abc";
		
		System.out.println(data1 + 1); //문자열 + 1 => 연결 / 101
		System.out.println(data2); // abc

		//abc에서 b만 뽑아내려한다
		char alpha = data2.charAt(1); //문자열은 0부터 시작, 1을 적으면 2번째 문자열 출력
		System.out.println(alpha); // b
//		문자열 "True"
		boolean result1 = Boolean.parseBoolean("True");
		System.out.println(result1); 
		// 문자열이 TRUE(대소문자 무관)이면 true를 반환하고, 그렇지 않으면 false를 반환함
		// true 말고 true1을 넣으면 false로 나옴
		// 문자열 스펠링이 정확하면(대소문자 상관없음) true 반환, 틀리면 false 반환
	}
}
