package Review;

public class ArrayTask05 {
	public static void main(String[] args) {
//		5. A ~ F까지를 배열에 값을 넣고 출력		
		
//		1) 문자형 6칸짜리 배열 선언
//		2) 반복문 for		int i = 0;
//			배열명[i] = (char문자형)('A' + i)
//		3) 출력할 반복문 for문
		
//		char[] arr = new char[6];
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
//			arr[i] = 'A' + i;
			System.out.println('A' + i);
/*
			65
			66
			67
			68
			69
			70
*/
			System.out.println((char)('A' + i));
/* char결과값
			65
			A
			66
			B
			67
			C
			68
			D
			69
			E
			70
			F			
*/
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
/*	int결과값
			65
			A
			66
			B
			67
			C
			68
			D
			69
			E
			70
			F
			0 0 0 0 0 0  			
 */
		}
		
	}
}	
