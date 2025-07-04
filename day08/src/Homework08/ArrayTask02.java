package Homework08;
//클래스 : ArrayTask02
//2. 1 ~ 10  까지의 값을 배열에 넣고 총 합을 출력
public class ArrayTask02 {
	public static void main(String[] args) {
		
		//1) 정수형 변수 2개 선언(sum, total)
		int sum = 0;
		int total = 0;
		//2)	바깥 for문 시작
		for(int i = 1; i  <= 10; i++) {
		//3) 초기식 i = 1 로 초기화
			System.out.println(i);
		//조건식 i <= 10 
		//3)정수형 변수 i를 10까지 추가하겠다 선언
		//3-1) sum 변수는 i를 1씩 누적하여 더한다, i <= 10이므로 10까지 더함
			sum += i;
		//3-2) total 변수는 sum 변수를 누적하여 더한다, 1+2+3+4+5+6+7+8+9+10
			total += sum;	
		}
		//출력
		System.out.println("총합은 : " + total + "입니다");		
			}
}

