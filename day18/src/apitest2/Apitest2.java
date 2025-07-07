package apitest2;
// 2.
import apiTest2.Calc;

public class Apitest2 {
	public static void main(String[] args) {
		Calc cal = new Calc();
		System.out.println(cal.divide(10, 5));
		//buildPath에서 x표시가 뜨는게 있으면 지우고 할것
//		x표시 뜨는게 남아있으면 다른것들도 같이 실행불가 상태가 됨
	}
}
