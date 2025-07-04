package interfaceTest04;
// 19번 : 다중상속(모호성 해결방법 예제)
public class ClassC implements Inter1, Inter2, Inter3{

	@Override
	public void printText() {
		//어차피 부모에 정의된 default 메소드를 사용할 것이기 때문에
		//어떤 부모의 메소드를 사용할 지 정해서 사용한다
		Inter2.super.printText(); //굳이 여기에 3줄 안적고 아래 syso안에 적으면 해당으로 자동출력
		Inter1.super.printText(); 
		Inter3.super.printText(); 
		
		
	}

	public static void main(String[] args) {
		ClassC c = new ClassC();
		System.out.println(c);
		c.printText();
	}
}
