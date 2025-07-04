package TwoArray;

import java.util.Arrays;

//8번 : 버블 정렬
public class BubbleSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : " + Arrays.toString(number));
		//초기 배열 : [5, 2, 9, 1, 6]
		
		for(int i = 0; i < number.length; i++) {
			boolean swap = false; //교환 발생여부
			for(int j = 0; j < number.length -1 -i; j++) {
				if(number[j] > number[j+1]) {
					//j의 0번째와 j의 1번째를 비교하겠다
					//두 요소 교환(swap)
					int temp = number[j]; //초기배열 5를 temp라는 값에 임시저장
					number[j] = number[j+1];
					number[j+1] = temp;
					swap = true; //교환이 이루어졌기에 false를 true로 변경, 저장
				}
			}
			System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
			//i = 0 => j = 0 < 4 true
/*
			1단계 : [2, 5, 1, 6, 9]
			2단계 : [2, 1, 5, 6, 9]
			3단계 : [1, 2, 5, 6, 9]
			4단계 : [1, 2, 5, 6, 9]			
*/
			if(!swap) {
				break; //중괄호 탈출, 끝에서 3번째 중괄호 이후
					   //(main중괄호 바로 앞)으로 이동												
			}
		}
		System.out.println("정렬완료 : " + Arrays.toString(number));
//		정렬완료 : [1, 2, 5, 6, 9]
	}
}
