package ObjectTest02;
// 4번 :  Object 클래스 -  equals() 메소드
public class User {
	//필드
	String name;
	int age;

	//생성자
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//toString 메소드 오버라이딩
//	toString메소드 단축키 : alt + shift + s + s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
//	재정의
	//Object 메소드 오버라이딩
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
	
	@Override
	public boolean equals(Object obj) {
//		return (this == obj); //메모리 주소값으로 비교하겠다
		if(this == obj) {
			return true;
	}
		
//		//이름이 같은 경우 => 같은 객체로 판단
//		if(obj instanceof User) {
//			String other = ((User)obj).name;
//			if(this.name.length() == other.length()) {
//				for(int i = 0; i < this.name.length(); i++) {
//					if(this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
		
		//이름이 같은 경우(짧은 코드 가능!)
//		위에 35번~ 조건문과 동일함!
		if(obj instanceof User) {
			String other = ((User)obj).name;
			return this.name.equals(other);
		}
		return false;
	}
	
	
	//equals를 재정의하면 hashCode도 재정의해야한다
	//동일 객체에 대해 같은 hashCode값이 반환되도록 한다
	//이름을 해시코드값으로 쓸 때는 name.hashCode()
	//나이를 해시코드값으로 쓸 때는 Interger.hashcode(age)
	//해쉬코드 오버라이딩, 재정의
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;  
//		name의 해쉬코드값 반환
	}
	
}
