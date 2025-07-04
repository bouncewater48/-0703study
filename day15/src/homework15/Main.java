package homework15;


//Main 클래스
//static 메소드(printInfo())
//객체타입에 따라 다운 캐스팅하여 전용 메소드 실행



public class Main {
// p 변수에 아래 내용을 모두 선언, Main.printInfo(p);로 출력
	public static void printInfo(Person p) { 
		
		Person ps = new Student("강승훈", true);
		Student sd = (Student) ps;
		sd.study();
		Person ps2 = new Teacher("강승훈");
		Teacher th = (Teacher) ps2;
		th.teach();
		Person ps3 = new Employee("강승훈");
		Employee em = (Employee) ps3;
		em.work();
		
	}	
	public static void main(String[] args) { 
//		객체 선언
		System.out.println("======Up Casting======");
		Person p = new Person("강승훈");
		Student s= new Student("강승훈", true);
		Teacher t = new Teacher("강승훈");
		Employee e= new Employee("강승훈");
	
//	업캐스팅, 한 메소드에 여러 매개변수 저장
		p.introduce();
		s.introduce();
		t.introduce();
		e.introduce();
		
		System.out.println("=====Down Casting=====");

		Main.printInfo(p);

//		Main.printInfo(s);
//		Main.printInfo(t);
//		Main.printInfo(e);
		
//		Person ps = new Student("강승훈", true);
//		Student sd = (Student) ps;
//		sd.study();
//		Person ps2 = new Teacher("강승훈");
//		Teacher th = (Teacher) ps2;
//		th.teach();
//		Person ps3 = new Employee("강승훈");
//		Employee em = (Employee) ps3;
//		em.work();
		

	
	//기본 생성자
//	public Main() {
//	}
//		업 캐스팅
		
		
		
		//		System.out.println(person); //Person 주소값 확인
//		person.introduce();
		
//			
		
			//		다운 캐스팅
	
	}
//	Person person
//	public static void printInfo(Person p) {
//		return;
//		
//		if(person instanceof Person) {
//		((Person)person).introduce();			
//		}
//			if(person instanceof Student) {
//				((Student)person).study();
//		}
//				if(person instanceof Teacher) {
//				((Teacher)person).teach();
//			}
//					if(person instanceof Employee) {
//					((Employee)person).work();
//					}else {
//						System.out.println("잘못 입력된 정보");
//					}
		
}
