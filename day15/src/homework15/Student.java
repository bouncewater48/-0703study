package homework15;

public class Student extends Person{

//	Student 클래스 
//	필드 : Boolean stu
//	생성자 : 매개변수 stu도 포함
//	메소드 : study()
//	           이름이 공부합니다 출력
//	메소드 오버라이딩 : 이름은 학생입니다 출력
	
	
	//필드
	private boolean stu;

	//생성자
	public Student(String name, boolean stu) {
		super(name);
		this.name = name;
		this.stu = stu;
//		int  = 0;
	}
	
	//메소드
	void study() {
		System.out.println(name + "이 공부합니다");
	}
	
	//메소드 오버라이딩
	void introduce() {
//		System.out.println(name + "은 "  + stu + "입니다.");
		System.out.println(name + "은 학생입니다." + stu);
	}
}
