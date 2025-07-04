package Array;
// 1번 : for-each문(빠른 for문, 확장 for문)
public class ForEachTest {
	public static void main(String[] args) {
		//1부터 5까지의 값을 담은 배열 선언
		int[] ar1 = new int[5];
		
		//값을 대입하는 반복문
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = i + 1;
		}
		
		//값을 출력하는 반복문
//		for(int i = 0; i < ar1.length; i++) {
//			System.out.println(ar1[i]);
/*
		1
		2
		3
		4
		5			
 */
//	}
			
		// for-each문
//		for(int num : ar1) {
//			num += num;
//			System.out.println(num);
			//num이라는 변수는 ar1이라는 파일에 있는 요소를 하나씩 저장하는것	
//			System.out.println(num);
/*	굳이 for문을 길게 작성하지 않아도 됨!
		1
		2
		3
		4
		5		
*/
//		}
		
		int sum = 0;
		for (int num : ar1) {
			System.out.println(num);
			sum += num;
			System.out.println(sum);
/*
		1
		1
		2
		3
		3
		6
		4
		10
		5
		15
*/			

		}
			
	}
}
