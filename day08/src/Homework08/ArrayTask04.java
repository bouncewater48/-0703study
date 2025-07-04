package Homework08;
//클래스 : ArrayTask04
//4. 0 1 2 3 0 1 2 3 배열에 담고 출력
public class ArrayTask04 {
	public static void main(String[] args) {
		
		//1) 배열 8칸 선언
		int[] arr = new int[8];
		//2) 바깥 for문 작성
		for(int i = 0; i < arr.length;i++ ) {
		//2-1) i를 0, 1, 2, 3 으로 4개만 반복 선언
			arr[i] = i % 4;
		}
		//3)안쪽 for문 작성
				for(int i = 0; i < arr.length;i++ ) {
		//출력
				System.out.print(arr[i] + " ");
//			System.out.println();
		}
	}
}
