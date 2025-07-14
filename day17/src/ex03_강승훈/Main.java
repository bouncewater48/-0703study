package ex03_강승훈;
/*
3. 문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램(람다식 활용, 익명클래스 먼저 작성)
인터페이스 : StringInter
메소드   : String modify(String str);    매개변수 o , 리턴값 o      

메인 클래스 : Main
메소드 : main메소드
   String nation = "Korea,Spain,Germany,America";
   
   문자열을 바꿔서 출력; str.replace() 이용
 */
public class Main {
	public static void main(String[] args) {

//		nation 메소드
		String nation = "Korea,Spain,Germany,America";
		
//		추상 메소드 상속
		StringInter si = new StringInter() {
		@Override
		public String modify(String str) {
			return str.replace(",","!");
		}
	};	
//      CombInter c1 = (str1, str2) -> System.out.println(str1 + str2);
//      이름 지우고 -> 추가
//      반환타입 추론가능 생략
//      매개변수 타입 추론 가능하므로 생략가능
//      매개변수가 2개이므로 소괄호 생략 불가능
//      출력문1줄이므로 {} ; 생략가능
			
//		StringInter str;
//		반환타입 String 생략
//		매개변수 생략
		StringInter si2 = (str) -> str.replace(",", "!");
		System.out.println(si2.modify(nation));
	}
}
