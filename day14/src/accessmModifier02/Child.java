package accessmModifier02;
// 7번 : 접근 제한자
import accessmModifier01.Parents;
//다른 패키지에서 다른 부모클래스를 상속받음

public class Child extends Parents{
	public void printAccess() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
//		System.out.println(privateVar);
	}
	
}
