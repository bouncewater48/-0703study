package inheritanceTest02;
// 2번 : 상속기초
public class Bird extends Animal{
				//extends Animal을 안적고 this.name을 적으니 오류 발생
	
	//필드
	//메소드
	//새 클래스의 고유 메소드
	void fly() {
		System.out.println(this.name + "이/가 하늘을 날고 있습니다");
	}
	//생성자
	public Bird() {
	}
	
}
