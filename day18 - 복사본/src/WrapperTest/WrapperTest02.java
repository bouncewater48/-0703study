package WrapperTest;
// 6번 : wrapper 클래스
public class WrapperTest02 {
	public static void main(String[] args) {
		
		int num = 10;
		printObj(num);
		//본래는 자동박싱과 언박싱이 진행되므로 ()안에 작성이 불가함
		Object obj = num; //Integer
		Object obj2 = 10;
		System.out.println(obj2);

	}
	static void printObj(Object obj) {
		System.out.println(obj);
	}

}
