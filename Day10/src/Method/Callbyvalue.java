package Method;
// 8번 : Call By Value
public class Callbyvalue {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("main 메소드에서의 num의 값 : " + num);
		modifyNum(num);
		System.out.println("main메소드에서의 num의 값 : " + num);
	}
	
	static void modifyNum(int num) {
		System.out.println("modifyNuim 메소드에서의 num의 값 : " + num);
		num = 20;
		System.out.println("modifyNuim 메소드에서의 num의 값 : " + num);
	
//		main 메소드에서의 num의 값 : 10
//		modifyNuim 메소드에서의 num의 값 : 10
//		modifyNuim 메소드에서의 num의 값 : 20
//		main메소드에서의 num의 값 : 10
	}
	//값 자체가 복사되므로 메소드 내부에서 변경한 값이 원본에 영향을 끼치지않는다
}
