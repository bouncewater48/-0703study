package TwoArray;

import java.util.Arrays;

// 9번 : Arrays.sort()
public class ArraySortTest01 {
	public static void main(String[] args) {
		
		//1차원 배열
//		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] number = {5, 2, 6, 3, 1, 8};
		
		//2차원 배열
//		int[][] number2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] number2 = {{5, 2, 6}, {3, 1, 8}};
		
		System.out.println(number);
		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number));
		System.out.println(number2);
		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number2));
		System.out.println("2차원 배열 값 출력 : " + Arrays.deepToString(number2));
		
		System.out.println("\n정렬 전 number1 : " + Arrays.toString(number));
		Arrays.sort(number); //number 배열 오름차순 정렬
		System.out.println("정렬 후 number : " + Arrays.toString(number2));
/*
		[I@1f32e575
		1차원 배열 값 출력 : [1, 2, 3, 4, 5, 6, 7, 8, 9]
		[[I@1be6f5c3
		1차원 배열 값 출력 : [[I@6b884d57, [I@38af3868, [I@77459877]
		2차원 배열 값 출력 : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]		
*/
		
/*
		[I@1f32e575
		1차원 배열 값 출력 : [5, 2, 6, 3, 1, 8]
		[[I@1be6f5c3
		1차원 배열 값 출력 : [[I@6b884d57, [I@38af3868]
		2차원 배열 값 출력 : [[5, 2, 6], [3, 1, 8]]
		정렬 전 number1 : [5, 2, 6, 3, 1, 8]
		정렬 후 number : [[I@6b884d57, [I@38af3868]	
 */
		
		System.out.println("정렬 전 number2 : " + Arrays.deepToString(number2));
//		Arrays.sort(number2); 2차원 배열은 정렬되지 않고 오류 발생함
//		2차원 배열 내부 요소 정렬은 for문이나 수동정렬이 필요하다!!
		for(int i = 0; i < number2.length; i++) {
			Arrays.sort(number2[i]);
		}
		for(int[] row : number2) {
			 Arrays.sort(row);
		}
		System.out.println("정렬 후 number2 : " + Arrays.deepToString(number2));
/*		
		정렬 전 number1 : [5, 2, 6, 3, 1, 8]
		정렬 후 number : [[I@6b884d57, [I@38af3868]
		정렬 전 number2 : [[5, 2, 6], [3, 1, 8]]
		정렬 후 number2 : [[2, 5, 6], [1, 3, 8]]	
*/		
	}
}
