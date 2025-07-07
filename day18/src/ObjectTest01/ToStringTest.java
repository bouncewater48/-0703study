package ObjectTest01;
//3번 : Object 클래스 - toString 메소드
public class ToStringTest {
	public static void main(String[] args) {
		Student st1 = new Student("짱구", 100, 100, 100 + 100);
		System.out.println(st1);
		System.out.println(st1.toString()); //st1이랑 결과가 동일함!
//		Student [name : 짱구, javaScore : 100, dbmsScore  :100 ]
//		Student [name : 짱구, javaScore : 100, dbmsScore  :100 ]
	}
}
