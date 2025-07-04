package TwoArray;
// 5번 : 2차원 배열 연습
public class TwoArrayTest03 {
	public static void main(String[] args) {
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		
		//1.배열명 ar1 값 넣고 출력하기
		int[][] ar1 = {{1, 2, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 11, 12}};
		
		//행의 길이 : ar1.length
		//열의 길이 : ar1[i].length
		
		for(int i = 0; i < ar1.length; i++) {
			for(int j = 0; j < ar1[i].length; j++) {
				System.out.println(ar1[i][j] + "\t");
			}
			System.out.println();
		}
		
		//2. 배열명 ar2 칸수만 선언 후 값 대입 후 출력
		int[][] ar2 = new int[3][4];
		//ar2는 크기만 지정된 2차원 배열 3개의 행과 4개의 열이다
		//이중 for문을 이용하여 1부터 값 대입
		int value = 1;
		
		for(int i = 0; i < ar2.length; i++) {
			for(int j = 0; j < ar2[i].length; j++) {
//				System.out.println("i : " + i + "j " + j);
//				System.out.println(ar2[i][j]);
				ar2[i][j] = value++; //후열증감식이라 끝나고나서 1증가
				System.out.print(ar2[i][j] + "\t");
/* value가 1씩 증가함을 볼 수  있다!
				i : 0j 0
				1
				i : 0j 1
				2
				i : 0j 2
				3
				i : 0j 3
				4
				i : 1j 0
				5
				i : 1j 1
				6
				i : 1j 2
				7
				i : 1j 3
				8
				i : 2j 0
				9
				i : 2j 1
				10
				i : 2j 2
				11
				i : 2j 3
				12				
*/	
			}
			System.out.println();
		}
	}
}
