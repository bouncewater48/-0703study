package print;
//8번 : println(), print() 출력메소드
public class PrintTest01 {
	public static void main(String[] args) { //main 메소드 시작 중괄호 영역
//		println() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈된다
		System.out.println("\"println()\"는 출력메소드이다.");
		System.out.println("자동으로 줄바꿈된다\n");
		
//		print() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈 되지 않는다.
		System.out.print("\'print()\'도 출력메소드이다.");
		System.out.print("자동으로 줄바꿈되지 않는다.");
//		2줄로 썼으나 print()로 작성하여 줄바꿈이 안되고 한줄로 적혀짐
		System.out.println("java 수업중입니다."); //윗줄에 줄바꿈이 없으므로 ln을 적었어도 줄바꿈이 안됨
		System.out.println("지금은 3시 11분입니다."); //윗줄에 ln을 적어서 줄바꿈이 되는 모습
		
	}
}
