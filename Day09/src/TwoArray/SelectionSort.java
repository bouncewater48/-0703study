package TwoArray;

import java.util.Arrays;

//6번 : 선택정렬
public class SelectionSort {
	public static void main(String[] args) {
		
		int[] number = { 5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : " + Arrays.toString(number));
		//초기 배열 : [5, 2, 9, 1, 6]
		
		for(int i = 0; i < number.length -1; i++) {
			//최소값 저장할 변수
			int minIdx = i;
			
			//최소값 찾기 위한 for문
			for(int j = i + 1; j < number.length; j++) {
				//j = 2, number = 5
				if(number[j] < number[minIdx]) {
					//j = 2, number = 0, 둘을 비교
					minIdx = j;
					//minIdx = 3 으로 저장
				}
			}
		
		//최소값과 현재 요소 교환
		int temp = number[minIdx]; //temp = number[3]; 3이라는 값이 temp에 저장
		number[minIdx] = number[i]; // number[3] = 5 / [3]에 5가 저장
		// minIdx = 3, number[i] = 5, 둘이 교환해서 number[3] = 5
		number[i] = temp; //number[0] = 1 / 
		
		System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
		}
	
	System.out.println("정렬완료 : " + Arrays.toString(number));
/*
		초기 배열 : [5, 2, 9, 1, 6]
		1단계 : [1, 2, 9, 5, 6]
		2단계 : [1, 2, 9, 5, 6]
		3단계 : [1, 2, 5, 9, 6]
		4단계 : [1, 2, 5, 6, 9]
		정렬완료 : [1, 2, 5, 6, 9]	
*/
	}
}
