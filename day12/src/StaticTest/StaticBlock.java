package StaticTest;

// 1번 : 정적 블록
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}

	// 정적블록 : 클래스가 로드될 때 먼저 실행된다(main 메소드보다 먼저 출력)
	static {
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다");
		// 스태틱블록이 메인메소드보다 먼저 실행됨
		// 클래스에 로드 작업이 일어나면 스태틱블록 - 메인메소드 순으로 실행
	}

}
