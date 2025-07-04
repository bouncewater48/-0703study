package TwoArray;
//4번 : 2차원 배열과 for문, for-each문
public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[][] ar1 = { {1,2}, {3,4}, {5,6}, {7,8} };
		
		System.out.println(ar1.length); //4, 행의 길이
		System.out.println(ar1[0].length); //2, 열의 길이
		
		System.out.println(ar1); //[[I@1f32e575 /2차원 배열의 전체 시작주소값
		System.out.println(ar1[0]); //[I@279f2327 / 2차원 배열의 0행의 시작주소값
		System.out.println(ar1[1]); //[I@2ff4acd0 / 2차원 배열의 1행의 시작주소값
		System.out.println(ar1[2]); //[I@54bedef2 / 2차원 배열의 2행의 시작주소값
		System.out.println(ar1[3]); //[I@5caf905d / 2차원 배열의 3행의 시작주소값
//		System.out.println(ar1[4]); //2차원 배열에 4행까지만 있으므로 인덱스범위 벗어나 오류발생
/*
		System.out.println(ar1[0][0]); //1
		System.out.println(ar1[0][1]); //2
//		System.out.println(ar1[0][2]); //3행이 존재하지 않아서 오류
		
		System.out.println(ar1[1][0]); //3
		System.out.println(ar1[1][1]); //4
		
		System.out.println(ar1[2][0]); //5
		System.out.println(ar1[2][1]); //6
*/	
//		for(int i = 0; i < ar1.length; i++) { //행
			//i는 행의 인덱스 번호
//			System.out.println(i);
			//0 1 2 3
//			System.out.println(ar1[i]);
			//각 행의 주소값 출력
			
			System.out.println("==========");
			for(int i = 0; i < ar1.length; i++) { //행
//				i는 행의 인덱스번호
//				System.out.println(i);
//				System.out.println(ar1[i]);
				for(int j = 0; j < ar1[i].length; j++) { //열
				System.out.println(ar1[i]);
//				System.out.println(ar1[i][j]);
			}
		}
		
		int[][] ar2 = {{1, 2, 3}, {4, 5}, {6}} ;
//		System.out.println(ar2[0][0]);
//		System.out.println(ar2[0][1]);
//		System.out.println(ar2[0][2]);
//		System.out.println(ar2[1][0]);
//		System.out.println(ar2[1][1]);
//		System.out.println(ar2[1][2]);
	
//		123
//		45
//		6
	     for (int i = 0; i < ar2.length; i++) {
	         for (int j = 0; j < ar2[i].length; j++) {
	            System.out.print(ar2[i][j]);
	         }
	         System.out.println();
	      }
	      for (int[] data : ar2) {
//	    	  System.out.println(data);
	    	  for(int value : data) { 
	    		  System.out.println(value);	  
	    	  }
	    	  System.out.println();
			}
	}
}
