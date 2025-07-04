package Array;
//2) 3과목 점수의 총합과 평균점수 구하기(for-each문만 이용)
public class ForEachTest02 {
	public static void main(String[] args) {
		
		int[] scores = {100, 88, 99};
		//1) 총합구할 변수 선언
		//2) 총합 구하기(for-each문)
		//3) 평균 구하기
		//4) 출력
		
		int sum = 0;
		for(int score : scores) {
			sum += score; 
			//이 지점에서 index값을 저장하는거 불가능함, ++나 +=같은거 못함
			//오직 읽기만 가능!
		}
		double avg = sum / (double)scores.length; //정수타입으로 나오기에 doubel추가
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
//		총합 : 287
//		평균 : 95.66666666666667
		
//		System.out.println("평균 : " + (double)avg);
//		이미 정수형이기에 여기서 하면 안됨, double추가할거면 위에 length문 앞에다 넣어야함!
		
		System.out.printf("평균 : %.2f ", avg);
//		평균 : 95.67 
	}
}
