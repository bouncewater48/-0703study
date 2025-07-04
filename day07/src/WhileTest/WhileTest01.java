package WhileTest;
//8번 : while문 기초
public class WhileTest01 {
	public static void main(String[] args) {
		
		//안녕하세요 문자열을 10번 출력하기
		//조건식을 true로 작성시 무한루프에 빠진다
		 while(true) {
			 for(int i = 0; i < 10; i++) {
			 System.out.println("안녕하세요!");
		 }
		 break;
	}
		
	//변수 선언
	//while(조건식){}
		int cnt = 0;
		while(cnt < 10) {
//			System.out.println(cnt); //여기까지만 작성하고 실행하면 계속 0으로 실행이라 무한루프임
			cnt++; //cnt = cnt + 1; true상태, cnt가 0~9가 될때까진 true임, cnt가 10이 되면 중괄호 탈출
//			cnt++가 작성되고 난 이후 코드부터 실행해서 1이 증가됨
//			System.out.println(cnt); //cnt++로 cnt가 1 증가된 상태로 시작하기에 1~10이 출력
			System.out.println("안녕하세요"); //안녕하세요 10번 출력
		
		}

	
	}	
		
	
		
		
		
		
		
		
	
}
