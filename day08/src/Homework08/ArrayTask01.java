package Homework08;
//클래스 : ArrayTask01
//1. 100 ~ 1 까지의 값을 배열에 넣고 출력
public class ArrayTask01 {
	public static void main(String[] args) {
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
			}
		}
	}
}
