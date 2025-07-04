package TwoArray;
// 3번 : 2차원 배열(행과 열로 구성된 데이터를 저장하는 배열의 형태)
public class TwoArrayTest01 {
	public static void main(String[] args) {
		//2차원 배열 선언
		int[][] ar1 = new int[3][2]; //3행 2열로 만들었다
		
		
		System.out.println(ar1);
		//[[I@1f32e575 / Heap메모리의 시작주소값
		//↑ 2차원 배열 전체의 참조값(JVM에 의해 제공)
//		[[0,0], [0,1]]
//		[[1,0], [1,1]]
//		[[2,0], [2,1]]
		
//		Stack 영역에 ar1이라는 영역이 있고 Heap영역에 2차원 배열 3행2열이 만들어짐
//		Stack에 시작주소값이 만들어짐
//		[[0, 0], [0,1]]
		
		System.out.println(ar1[0]);
//		[I@279f2327 : 0행의 참조값(1차원 배열로 나온다)
		
		System.out.println(ar1[0][0]);
//		0	1차원 배열의 첫번쨰 값(초기화된 기본값)
//		0 : 2차원 배열의 행과 열을 모두 지정해야 제대로 된 값이 출력됨!!
		
		//2차원 배열 선언
		int[][] ar2 = {{10, 20, 30}, {40, 50, 60}};
		System.out.println(ar2); //[[I@2ff4acd0
		System.out.println(ar2[0]); //[I@54bedef2
		
//		10, 20, 30
//		40, 50, 60
		System.out.println(ar2[0][0]); //10
		System.out.println(ar2[0][1]); //20
		System.out.println(ar2[0][2]); //30
		System.out.println(ar2[1][0]); //40
		System.out.println(ar2[1][1]); //50
		System.out.println(ar2[1][2]); //60
		
		System.out.println("2차원 배열(행) : " + ar2.length);//ar2행의 길이
		//2차원 배열(행) : 2
		System.out.println("2차원 배열(열) : " + ar2.length);//ar2열의 길이
		//2차원 배열(열) : 2
		
		for(int i = 0; i < ar2.length; i++) { //행의 반복
			System.out.println("ar2.length의 값(ar2의 행의 길이 : " + ar2.length);
//			ar2.length의 값(ar2의 행의 길이 : 2
			System.out.println("ar2의 각 행 : " + i + "의 주소값 : " + ar2);
//			0행 : [I@54bedef2, 0열 : 0ar2[i][j]의 값} : 10
//			0행 : [I@54bedef2, 1열 : 1ar2[i][j]의 값} : 20
//			0행 : [I@54bedef2, 2열 : 2ar2[i][j]의 값} : 30
//			ar2의 각 행 : 0의 주소값 : [[I@2ff4acd0
			for(int j =0; j < ar2[i].length; j++) { //열의 반복
				System.out.println(i  + "행 : " + ar2[i] + ", " 
				+ j + "열 : " + j + "ar2[i][j]의 값} : " +  ar2[i][j]);
//				1행 : [I@7ef20235, 0열 : 0ar2[i][j]의 값} : 40
//				1행 : [I@7ef20235, 1열 : 1ar2[i][j]의 값} : 50
//				1행 : [I@7ef20235, 2열 : 2ar2[i][j]의 값} : 60
				//+ ar2[j]을 하면 인덱스를 넘어가서 오류 발생
			}
		}
		int[] ar = new int[2];
		System.out.println(ar); //[I@4c873330
	}
}
