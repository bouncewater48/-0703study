package variableTest;

// 4번 : 변수의 종류
public class VariableTest01 {

	// 필드
	int iVar; // 인스턴스 변수
	static int sVar; // 스태틱 변수

	// 메소드
	// 인스턴스 메소드
	int localVar() {
		int lVar = 100; // 지역변수
		System.out.println("지역변수 lVar의 값 : " + lVar);
		return lVar;
	}

	// 인스턴스 메소드
	void parameterVar(int pVar) { // 매개변수
		System.out.println("매개변수 pVar의 값 : " + pVar);
	}

	// 인스턴스 메소드
	void intstanceVar() {
		iVar += 5;
		System.out.println("인스턴스변수 iVar의 값 : " + iVar);
	}

	// 스태틱 메소드(=정적 메소드)
	static void staticVar() {
		sVar = 100; // 스태틱 변수, 앞에 자료형.sVar이 되어야 지역변수임
		System.out.println("정적변수 sVar의 값 : " + sVar);

		VariableTest01 vt1 = new VariableTest01();
		System.out.println("정적변수 sVar의 값(vt1) : " + vt1.sVar);
		VariableTest01 vt2 = new VariableTest01();
		System.out.println("정적변수 sVar의 값(vt2) : " + VariableTest01.sVar);

	}

	public static void main(String[] args) {
		VariableTest01 vt = new VariableTest01();
		int lVar = vt.localVar(); // 지역변수 lVar의 값 : 10
		System.out.println(lVar); // 10
		vt.parameterVar(lVar);

		vt.intstanceVar(); // 인스턴스변수 iVar의 값 : 0
		vt.intstanceVar();

		VariableTest01.staticVar();

		/*
		 * 지역변수 lVar의 값 : 100 
		 * 100
		 * 매개변수 pVar의 값 : 100 
		 * 인스턴스변수 iVar의 값 : 5 
		 * 인스턴스변수 iVar의 값 :
		 * 10 정적변수 sVar의 값 : 100 
		 * 정적변수 sVar의 값(vt1) : 100 
		 * 정적변수 sVar의 값(vt2) : 100
		 */

	}
}