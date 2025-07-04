package Review;

public class ArrayTask01 {
	public static void main(String[] args) {
		//클래스 : ArrayTask01
		//1. 100 ~ 1 까지의 값을 배열에 넣고 출력
	/*	
		System.out.println("숫자 출력 : ");
		// 1) 바깥 for문 시작
		for(int i = 100; i <= 100; i++) {
		// 1-1) 초기식 i를 100으로 초기화
		// 1-2) 초기식  i 출력
			System.out.println(i);
		// 1-3) i는 100부터 무한히 1씩 감소한다
		// 2) 안쪽 for문 시작
			for(int j = 99; 0 < j; j--) {
		// 2-1) 초기식 j를 99로 초기화
		// 2-2) 초기식 j 출력
				System.out.println(j);
		// 2-3) j는 99부터 1씩 감소하며 0까지 감소한다
		// 3) 출력
	*/
		
		//1. 100 ~ 1 까지의 값을 배열에 넣고 출력
		//1) 크기가 100인 배열 선언
		//2) for문을 통해서 100부터 1까지의 값을 저장
		//3) for문을 통해 배열 출력
		
		int[] arr = new int[100];
		System.out.println(arr);
//		[I@1f32e575
		
		//값 저장하는 반복문
		for(int i = 0; i <arr.length; i++) {
			arr[i] = 100 - i; // 100 - 0
								// 100 - 1;...
		}
		
		//값 출력하는 반복문
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
