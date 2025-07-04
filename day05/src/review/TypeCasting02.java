package review;
//3번 : 문자열 자료형 => 다른 기본 자료형으로
public class TypeCasting02 {
	public static void main(String[] args) {
		
		//기본자료형 -> 문자열 자료형
		String str1 = 3 + "";
		String str2 = 6.17 + "";
		String str3 = 'a' + "";
		String str4 = true + "";
//		기본자료형 str1~4를 모두 문자열로 변환 
		
		System.out.println(str1); 
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		//결과로 나온거 전부 문자열로 바뀐거임
//		3
//		6.17
//		a
//		true
		//문자열 -> 기본 자료형으로
		
//		int number1 = str1; 이미 저장된 값이 있는 str은 못 씀
		int number1 = Integer.parseInt(str1);
//		str1을 정수형으로 형변환함
		System.out.println(number1 + 3);
//		str1에 있던 정수 3에 정수 3을 더하여 6이 출력됨
		double number2 = Double.parseDouble(str2);
//		str2에 있던 문자열 6.17이 double형으로  변환됨
		System.out.println(number2);
//		double형으로 바뀌면서 실수형이 됐고, 6.17이 실수형으로 출력됨
		boolean isTrue2 = Boolean.parseBoolean(str4);
//		str4를 boolean형으로 바꿈
		System.out.println(!isTrue2);
//		boolean형으로 바꿨으나 위에 있던 True가 아닌 True2를 써서 false로 출력됨
		char ch = "hello".charAt(0); 
		// 0은 1자리 h만 출력한다, 자릿수를 넘어가면 오류 발생!
		System.out.println(ch);
//		0으로 1자리만 나타낸다 정의했으므로 h만 출력됨
	}
}
