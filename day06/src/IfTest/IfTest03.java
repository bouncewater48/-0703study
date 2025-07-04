package IfTest;
//12번 : if ~ else if ~ else문
public class IfTest03 {
	public static void main(String[] args) {
		//양수, 음수, 0인지 확인하기
		System.out.println("출력 시작");
		
		int num = 10;
		//int에 정수 10 저장
		if (num > 0) {
		//먼저 해당 영역에 int를 넣어봄
			System.out.println("양수입니다");
		} else if (num < 0) {
		//중괄호 끝나는 지점에서 양수면 양수입니다 그대로 출력	
		//음수라면 곧바로 else if를 실행해서 음수입니다까지 확인
			System.out.println("음수입니다");
		} else {
		//음수입니다도 확인했는데 아니면 else문을 실행해서 0입니다 출력	
		System.out.println("0입니다");
		}
		
		if (num > 5 && num < 15) {
			//num > 5 && num < 15 조건식을 쓸 때 같은 뜻이라고 5 < num < 15
			//같은걸 적으면 자바에서는 적용이 안되기에 무조건 위처럼 작성하기
			//조건식이 위,아래 다 true인 경우 아래는 무시하고 위에꺼만 실행!
			System.out.println("5보다 큽니다");
		} else if (num < 3) {
			//중괄호 끝나는 지점에서 양수면 양수입니다 그대로 출력	
			//음수라면 곧바로 else if를 실행해서 음수입니다까지 확인
			System.out.println("3보다 큽니다");
		} else {
			//음수입니다도 확인했는데 아니면 else문을 실행해서 0입니다 출력	
			System.out.println(num);
		}
		
		System.out.println("출력 끝");
	}
}
