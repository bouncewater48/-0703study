package homework15;

public class Teacher extends Person{

//	Teacher 클래스
//	필드 : x
//	메소드 : teach()
//	            이름이 가르칩니다 출력
//	메소드 오버라이딩 : 저는 선생님입니다 출력	
	
	
//	필드 x

//	생성자
	public Teacher(String name) {
		super(name);
		this.name = name;
//		int age1 = 0;
	}
	
	//메소드
	void teach() {
		System.out.println(name + "이 가르칩니다.");
	}
	
	//메소드 오버라이딩
	void introduce() {
		System.out.println(name + "은 선생님입니다.");
	}
	
}
