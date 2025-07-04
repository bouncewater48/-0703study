package Homework08;
// 클래스 : ArrayTask03
//3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
public class ArrayTask03 {
	public static void main(String[] args) {
		//1)  정수형 변수 2개 선언(sum, total)
//		int a = 0;
//		int b = 0;
//		int c = 0;
		int sum = 0;
		int total = 0;
//		int sum = sc.nextInt();
//		int total = sc.nextInt();
		//2) 바깥 for문 시작,a의 점수 선언
		System.out.println("3명의 점수 : ");
		for(int a = 50; a <= 50; a++) {
		//System.out.println(a);
		//3) 안쪽 for문 시작, b의 점수 선언
			for(int b = 87; b <= 87; b++) {
//				System.out.println(b);
		//4) 안쪽 for문 시작, c의 점수 선언
				for(int c = 96; c <= 96; c++) {
//					System.out.println(c);
					//5) 3명의 점수 각각 표기
					System.out.println("a의 점수 : " + a + "  b의 점수 : " + b + "  c의 점수 : " + c);
					//6) 3명의 점수 합산 구하기
					sum += a+b+c;
					//7) 점수 평균 구하기
					total += sum/3;
					System.out.println("3명의 점수 총합은 " + total + "점입니다");
					//정수형 변수로 작성했으므로 233/3임에도 소수점이 안나옴!
				}
			}
		}
	}
}
