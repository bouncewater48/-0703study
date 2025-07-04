package Review;

public class ArrayTask07 {
	public static void main(String[] args) {
//		7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력		
//		소문자와 대문자/짝수와 홀수 로 나온다는걸 알고있는 상태
//		1) 26칸 짜리 문자형 배열
//		2) 반복문(for문)
//			삼항연산자 값 대입
//		3) 출력하는 for문
		
		char[] arr = new char[26]; //char arr[]도 출력하는데 문제는 없음!
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(i % 2 != 0 ? i + 65 : i + 97); //i를 2로 나누고 나머지가 0이 아닐때를 구한다 
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
//			aBcDeFgHiJkLmNoPqRsTuVwXyZ
		}
	}
}