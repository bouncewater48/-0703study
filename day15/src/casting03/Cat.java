package casting03;
// 6번 : 캐스팅의 특징
public class Cat extends Animal{
	
	//생성자
	public Cat(String name, int age) {
//		부모(Animal)로부터 super로 받아옴
		super(name, age);
	}

	//메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("야옹!!");
	}
}
