package TwoArray;

import java.util.Arrays;

//7번 : 삽입정렬
public class InsertionSort {
	public static void main(String[] args) {
		
		int[] number = { 5, 2, 9, 1, 6};
		System.out.println("초기배열 : ");
		
		for(int num : number) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		for(int i = 1; i < number.length; i++) {
			int key = number[i];
			int j = i - 1;
			
			//key보다 큰 값을 오른쪽으로 이동
			while(j >= 0 && number[j] > key) {
				number[j + 1] = number[j];
				j--;
			}
			
			number[j + 1] = key;
			System.out.println(i + "단계 : " + Arrays.toString(number));
			
		}
		System.out.println("정렬완료 : " + Arrays.toString(number));
/*
		1단계 : [2, 5, 9, 1, 6]
		2단계 : [2, 5, 9, 1, 6] 
		3단계 : [1, 2, 5, 9, 6] // 1이 자기자리 찾아서 들어가고 나머지 우측정렬
		4단계 : [1, 2, 5, 6, 9] // 2가 자기자리 찾아서 들어가고 나머지 우측정렬
		정렬완료 : [1, 2, 5, 6, 9]		//5가 자기자리 찾아서 들어가고 나머지 우측정렬
*/
	}
}
