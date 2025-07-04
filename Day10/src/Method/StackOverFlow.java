package Method;
// 5번 : 스택오버플로우 발생
public class StackOverFlow {
	public static void main(String[] args) {
		
		recursiveMethod();
	}
	
	
	static void recursiveMethod() {
		recursiveMethod();
		//메소드 작성시 절대 위처럼 작성하지 않고, 반드시 종료조건을 포함함!!
		// 자기 자신의 메소드에서 다시 자기자신을 호출하는걸 재귀호출 이라고 부름
		// java.lang.StackOverflowError
		// 재귀 호출이나 반복적인 메소드 호출로 인해
		// 스택 프레임이 계속 쌓여서 스택영역의 크기 제한을 초과하면 발생
		// JVM이 할당한 스택영역의 최대 크기를 초과하므로 더 이상 메소드 호출 정보를 쌓을 공간이 없어서
		// StackOverFlowError 가 발생한다
		
		//한 Thread에서 사용가능한 Stack 크기는 1mb ~ 2mb 정도임
	
	}
}
