package InnerTest;
// 26번 : 내부클래스와 외부클래스의 객체화
public class InnerMain {
	public static void main(String[] args) {
		
	//외부클래스의 객체 생성
	Outer outer = new Outer();
	System.out.println("외부 클래스의 참조값 : " + outer);
	System.out.println("외부 클래스의 참조값 : " + outer.var1);
//	System.out.println("내부 클래스의 참조값 : " + outer.var2);
	//외부 클래스의 객체로는 내부 클래스 멤버에 접근 불가
	
	//내부클래스의 객체 생성
//	내부 클래스는 외부 클래스의 인스턴스를 통해서만 생성해야한다!!!!
//	Inner inner = new Inner();
	Outer.Inner inner = outer.new Inner();
//	Outer.Inner inner2 = outer.new Inner();
	Outer.Inner inner2 = new Outer().new Inner(); 
	System.out.println(inner);
//	참조값에 $ 표시가 있으면 무조건! 내부 클래스라는 뜻, $표시 뒤가 내부클래스
//	참조값은 외부클래스가 먼저 표기, 내부클래스는 그 이후에 표기
//	외부클래스의 기본생성자 - 내부클래스의 기본생성자 순으로 호출
	
	
	}
}
