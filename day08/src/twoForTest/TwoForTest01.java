package twoForTest;
// 1번 : 이중for문 기본
public class TwoForTest01 {
	public static void main(String[] args) {
		
//		이중for문의 초기식에는 보통 i와 j를 많이 사용함
		
		for(int i = 0; i < 3; i++) { //바깥 for문 //행
			System.out.println(i);
			//바깥 부문이 한번 반복되는동안 안쪽 부문이 false가 나오기 전까지 계속 반복한다
//			for(초기식; 조건식; 증감식) { 
			for(int j = 0; j < 3; j++) { //안쪽 for문 //열
				//i가 한번 반복할때 j는 n(여기서는 0<3 = 3만큼 반복한다)
			System.out.println(j);
//			System.out.println("i : " + i + ", j : " + j);
//			System.out.println(i + ", " + j);
			//안쪽 부문이 false가 됐을 떄 중괄호 안으로 가서 증감식으로 이동
			/*
			 * i : 1, j : 1
				i : 1, j : 2
				i : 2, j : 1
				i : 2, j : 2  			
			 */
		}
//			System.out.println(); 여기에 작성시 줄바꿈을 한줄 띄워줌ㄴ
				System.out.println(); //바깥for문 위치
	}

//		1. 바깥 for문 시작
//		1-1) 초기식 i를 1로 초기화
//			조건식 i < 3 조건을 검사 => 1 < 3 true이면 바깥for문의 중괄호 영역 안으로 들어간다
//		2. 안쪽 for문 시작
//		2-1) 초기식 j를 1로 초기화
//			조건식 j < 3 조건을 검사 => 1 < 3 true이면 안쪽 for문 중괄호 영역 안으로 들어간다
//		2-2) 출력메소드 System.out.println("i : " + i + ", j : " + j);
//			출력결과	=> i : 1, j : 1
//		3.	안쪽 for 계속 진행
//		3-1) 증감식으로 이동 j가 1증가(j++) 현재 j의 값 : 2
//		3-2) 조건식	j < 3 조건 검사 => 2 < 3 true이면 안쪽 for문 중괄호 영역 안으로 들어간다
//		3-3) 출력메소드 	System.out.println(" i : " + i + ", j : " + j)
//			출력결과 => i : 1, j : 2
//		4. 안쪽 for 계속 진행
//		4-1) 증감식으로 이동 j가 1증가(j++) 현재 j의 값 : 3
//		4-2) 조건식 j < 3 조건검사 => 3 < 3 false이면 안쪽 for문 중괄호 영역 밖으로 이동한다.
//		4-3) 안쪽 for문 중괄호 밖, 바깥쪽 for문 중괄호 안의 내용이 있다면 해당 내용 실행한다
//		5. 바깥쪽 for문 계속 진행(증감식으로 이동하겠다)
//		5-1) 증감식 이동	i가 1증가(i++)	현재 i 값 : 2
//		5-2) 조건식	i < 3 조건 검사 => 2 < 3 true 바깥쪽 for문 중괄호 영역안으로 들어간다
//		6. 안쪽 for문 시작
//		2~5번까지 계속 반복
//		+) 바깥 for문의 증감식으로 이동 후 조건식을 확인 시 false가 나오면 바깥 for문의 중괄호 영역 밖으로 이동한다
		
		 System.out.println();

	      for (int i = 0; i < 4; i++) { // 바깥for문 //행]
//	         System.out.print(i);
	         for (int j = 1; j < 5; j++) { // 안쪽 for문 //열
//	            System.out.print("i : " + i + ", j : " + j);
	            System.out.print(i + j);
	         }
	         System.out.println(); // 바깥for문 위치
	      }				
	}
}
