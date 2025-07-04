package Array;
// 4번 : 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
		
		//어떤 값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};
		System.out.println(ar1);	//[I@1f32e575 < ar1의 주소값
		// ar1 => stack 메모리에 있는 참조변수(heap 메모리에 저장된 배열의 시작주소 => 참조값)
		// stack에 메모리 생성, 대입연산자를 통해 heap에 메모리 저장
		// Heap 메모리에 있는 주소값을 불러옴(참조하고 있다) / 
		// ar1 : 참조변수, heap메모리의 시작 주소값 : 참조값
		
		System.out.println(ar1[0]); //1, heap메모리를 참조, 0번째에 있던 1을 가져옴
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
//		System.out.println(ar1[5]); // 길이가 5인데 0~4만 참조가 가능하므로 [5]를 참조하려하면 오류발생!
		
		// 몇 칸을 만들지 알 때
		int[] ar2 = new int[3];
		System.out.println(ar2); //[I@279f2327  heap 메모리에 저장된 시작주소값(참조값)을 담고있다.
		System.out.println(ar2[0]); // 0
		System.out.println(ar2[1]); // 0
		System.out.println(ar2[2]); // 0
//		System.out.println(ar2[3]); // 인덱스 범위 0,1,2를 벗어나므로 오류 발생
		
		int num;
//		System.out.println(num); //초기화가 안됐음
		
		
		int[] ar3 = null;
		System.out.println(ar3); //null  해당 주소값이 어디인지 특정이 안되서 못가져오므로
//		System.out.println(ar3[0]); //in thread "main" java.lang.NullPointerException
		//일반적으로 만드는 메모리는 스택메모리에 저장되서 꺼내올 수 있는 상태이나, null은 해당 저장공간 자체가 없기에 불러올 수 없다, 초기화가 안된 상태랑 똑같음
		//실제 메모리에는 들어가지 않고 그냥 만들거다~ 라고만 정의한 상태임
		
		
		System.out.println(ar1);
		ar1 = new int[] {1, 2, 3};
		System.out.println(ar1);
	}
}
