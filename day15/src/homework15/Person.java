package homework15;

public class Person {
	
	
//	부모클래스 : Person
//	자식클래스 : Student, Teacher, Employee
//
//	공통메소드 : introduce()   자식클래스에서는 오버라이딩
//	모든 필드는 private
//	생성자는 이름을 갖고있는 생성자
//
//	Person 클래스
//	필드 : 이름, 나이, 생년월일(8자리)
//	메소드 : introduce() 이름, 나이입니다 출력
	
	
//	필드
	String name = "강승훈";
	int age = 27;
	int birth = 19990824;
	
//	생성자
	public Person(String name) {
		super();
		this.name = name;
//		int age1 = 0;
	}
	
//	공통메소드
//	introduce();

//	메소드
			void introduce() {
			System.out.println("이름은 " +  this.name + ", 나이는 " + age + "살입니다");
		}
		
//	getter 메소드;
		public int getBirth() {
			return birth;
		}
//
//		public void birth(int birth) {
//			this.birth = birth;
//		}

//		public int getAge() {
//			return age;
//		}
//
//		public void setAge(int age) {
//			this.age = age;
//		}

}
