package apitest;

class MyClass<T> {
	// 필드
	T data;

	// 생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}

	// 메소드
	void printData() {
		System.out.println(data);
	}

}

public class ArrayListTest02 {
	public static void main(String[] args) {
//		클래스에서 제네릭을 지정하는 경우, 내가 타입을 원하는거로 지정 가능
//		MyClass mc1 = new MyClass(1.5);
//		MyClass<Integer> mc1 = new MyClass(1.5);
		MyClass<Integer> mc1 = new MyClass<>(1);

		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass<String>("java");
		System.out.println(mc2);
		mc2.printData();
	}

}
