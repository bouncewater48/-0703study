package casting03;
// 6번 : 캐스팅의 특징
public class Dog extends Animal{

	//생성자
	public Dog(String name, int age) {
//		부모(Animal)로부터 super로 받아옴
		super(name, age);
	}

	//메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("멍멍!!");
	}

	//메소드
	void walk() {
		System.out.println("산책가자!");
	}
}
