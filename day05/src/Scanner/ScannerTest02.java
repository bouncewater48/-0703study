package Scanner;

import java.util.Scanner;

//6번 : 입력클래스(next(), nextLine())
public class ScannerTest02 {
	public static void main(String[] args) {
		//import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		//System.in으로 받은 자원은 낭비가 생길 수 있음
		// next()는 임시 저장공간에서 엔터를 소모하지 않는다
		// 값을 입력하지 않고 엔터만 누르면 next()입장에서는 할 일이 없기 때문에
		//아무것도 하지 않고 계속 대기한다
		
//		1 2 3
		sc.next(); //1 인식
		sc.next(); //2 인식
		sc.next(); //3 인식
		
		// nextLine()은 하는 일이 2가지이다
		// 1) 엔터 이전까지의 값을 가져온다
		// 2) 엔터를 임시 저장공간에서 지워준다(소모한다)
		// 값을 입력하지 않고 엔터만 눌러도 nextLine()은 엔터를 소모해야하는 일을 해야하므로
		// 엔터를 없애고 할 일을 마친다
		sc.nextLine();
		sc.nextLine();
		sc.nextLine();	
		// 엔터만 3번 쳐도 끝남, 엔터 횟수를 next와 다르게 소모한다
		// 스페이스바 횟수로 인식하기에 1 2 3을 치고 엔터를 쳐도 1개분량의 여유가 아직 남아있다.
		
//		1 2 3
//		1
//		2

//		sc.close(); //Scanner 객체를 종료하고 내부에서 사용한 자원(메모리, 스트림 등)을 해제함
//		↑이거 쓰면 위에서 뭘 썼던간에 아예 종료됨
//		Scanner sc1 = new Scanner(System.in);
//		sc.next();
		
//	1 2 3
//	2
//	3
//	Exception in thread "main" java.lang.IllegalStateException: Scanner closed
//		at java.base/java.util.Scanner.ensureOpen(Scanner.java:1158)
//		at java.base/java.util.Scanner.next(Scanner.java:1473)
//		at Scanner.ScannerTest02.main(ScannerTest02.java:36)
//		main에서 가져올 요소가 없는데 가져오려 했다는 뜻
		
		
//		sc.close(); //Scanner 객체를 종료하고 내부에서 사용한 자원(메모리, 스트림 등)을 해제함
//		↑이거 쓰면 위에서 뭘 썼던간에 아예 종료됨, 아래로는 뭘 써도 다시 못들어감
//		Scanner sc1 = new Scanner(System.in); //System.in은 하나의 InputStream인데
		// sc.close()라는 내용을 위에서 썼기에 이게 System.in까지 닫게된다
		// new Scanner(System.in)을 사용하더라도 이미 닫힌 스트림의 재사용이기 때문에 에러발생
//		sc.nextLine(); 
		
//		Scanner sc1 = new Scanner(System.in); //System.in은 하나의 InputStream인데
//		sc.nextLine(); 
//		sc.close(); //Scanner 객체를 종료하고 내부에서 사용한 자원(메모리, 스트림 등)을 해제함
//	close 위에 쓰는건 적용됨
	
	
	
	}
}
