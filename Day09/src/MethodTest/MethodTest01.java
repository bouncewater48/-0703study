package MethodTest;
// 10번 : 메소드 정의
public class MethodTest01 {
	public static void main(String[] args) {
		//메소드 호출
//		System.out.println(add(10, 20));
//		30출력
//		 add(10, 20);
		
		MethodTest01 mt1 = new MethodTest01();
//					배열과 똑같이 new라는 키워드를 통해 뒤에 적힌 메모리를 만들고 
//						class에 있는 모든 정보를 저장함.
//					그리고 시작주소를 가져와서 앞쪽 mt1에 대입함
		System.out.println(mt1); //참조값
//		MethodTest.MethodTest01@1f32e575
//		 패키지명		  클래스명       주소값
		System.out.println(mt1.add(10, 20)); //참조값
//		30, 오류가 안나고 그대로 가져옴
	}
//	메소드 정의
//	1. static 키워드를 붙혀서 시작주소를 가져온다
//	2. 참조값을 만들어서 불러온다
	
	//메소드 정의 순서
	//1) 기능을 생각한다 (두 수를 더하는 기능)
//		반환타입 메소드명(자료형 매개변수) {
	//2) 반환타입이 생각나지 않는다면 우선  void를 작성한다
//		void 메소드명() {}
	
	//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로 작성)
//		add, sum, plus, ...
//		void add(자료형 매개변수){}
	
	//4) 매개변수를 생각한다(매개변수 2개)
//	void add(int num1, int num2){}
	
	//5) 실행할 문장을 작성한다
//	void add(int num1, int num2){
//			int result = num1 + num2;
//	}
	
	//6) 리턴값을 생각한다.
//	void add(int num1, int num2){
//		int result = num1 + num2;
//		return result;
//		}
	
	//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	// 메소드는 위,아래 상관없이 안에만 존재하면 된다
				
//	add(10, 20);
		static int add(int num1, int num2) {
//			static이 안붙으면 뒤에 int~ 부분들을 찾을 수 없어서 오류가 발생함
			int result = num1 + num2;
			return result; 
//			이 상태로 f11을 눌러도 출력은 안되나, result 자체가 30이라는 값이 된 상태다
		}
}
