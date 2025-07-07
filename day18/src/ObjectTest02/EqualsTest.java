package ObjectTest02;

public class EqualsTest {
	public static void main(String[] args) {
		
	User u1 = new User("짱구", 20);
	User u2 = new User("짱구", 20);
	User u3 = new User("짱구", 20);
	
	System.out.println(u1);
	System.out.println(u2);
	System.out.println(u3);
//	ObjectTest02.User@279f2327
//	ObjectTest02.User@2ff4acd0
//	ObjectTest02.User@54bedef2
	
//	equals()가 오버라이딩 되어있지 않을 때 참조값으로 비교한다	
	//equals()가 오버라이딩 되어있지 않을 때
//	System.out.println(u1 == u2); //	false
//	System.out.println(u1 == u3); //	false
//	System.out.println(u1.equals(u2)); //	false
//	System.out.println(u1.equals(u3)); //	false
	
//	만약 같은 이름이 같은 객체라면 equals () 메소드를 재정의해줘야한다
//	재정의 이후
	System.out.println(u1 == u2); //	false
	System.out.println(u1 == u3); //	false
	System.out.println(u1.equals(u2)); //	true
	System.out.println(u1.equals(u3)); //	true

//	해쉬코드 출력, hashCode도 재정의를 안하면 값이 따로 나온다
	System.out.println(u1.hashCode());
//	1044036744
//	재정의(return this.age) 후 : 20
	System.out.println(u3.hashCode());
//	1826771953
//	재정의(return this.age) 후 : 20
	}
}
