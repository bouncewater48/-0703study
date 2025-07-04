package abstractTest01;
// 2번 : 추상 클래스(추상메소드와 일반메소드)
public abstract class ClassB { //class 명에 abstract가 있어야 추상클래스 생성가능!
	//추상 메소드
	abstract void method1();
	
	//일반 메소드
	void method2() {
		System.out.println("추상클래스의 method2 호출");
	}
}
