package interfaceTest01;
// 6번 : 인터페이스
public interface Inter {
//	생성 시 class가 아니라 interface로 생성
	//상수, 추상메소드
	public final static int VAR1 = 10; //상수
	
	public abstract void method1(); //추상메소드
	
	int VAR2 = 20;
	void method2();
}