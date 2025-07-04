package Array;
// 3번 : 배열 선언 및 생성
public class ArrayTest01 {
	public static void main(String[] args) {
		
		//1) 어떤 값이 들어갈 지 모르나 몇 칸 만들지는 알 때
		//정수형 배열변수 number1 선언하고 크기 5칸인 배열 생성
		int[] number1 = new int[5];
		
		//2) 어떤 값이 들어갈 지 알 떄
		//문자열 배열변수 aplha 선언하고 a, b, c 값으로 배열생성
		String[] alpha = {"a" + "b" + "C"}; //배열을 의미한다
		
		//3) 어떤 값이 들어갈 지 모르고 몇 칸 만들지도 모를 때
		//실수형 배열변수 numbrer2 선언
		double[] number2 = null;
		
		//4) 배열변수 선언 후 배열 생성과 초기화
		//정수형 배열 number3 선언
		//1, 2, 3, 4 값으로 초기화
		int[] number3;
		number3 = new int[] {1, 2, 3, 4};
		
		System.out.println(number1);
		System.out.println(alpha);
		System.out.println(number2);
		System.out.println(number3);
		
//		[I@1f32e575
//		 [Ljava.lang.String;@279f2327
//		 null
//		 [I@2ff4acd0
	}
}
