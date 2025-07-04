package homework15;

public class Employee extends Person{

//	Employee 클래스
//	필드 : x
//	메소드 : work()
//	            업무를 처리중입니다 출력
//	메소드 오버라이딩 : 저의 이름은 이고 회사원입니다 출력
	
	
	
//	필드 x
	
//	생성자
	public Employee(String name) {
		super(name);
		this.name = name;
//		int age = 0;
	}
	
//	메소드
	void work() {
		System.out.println(name + "님이 업무를 처리중입니다");
	}
	
//	메소드 오버라이딩
	void introduce() {
		System.out.println("저의 이름은 " + name + "이고 회사원입니다.");
	}
	
}
