package Homework08;
//6. A ~ F까지 중 C만 제외하고 배열에 담아 출력
public class ArrayTask06 {
	public static void main(String[] args) {
		
		String[] alpha = {"A" + "B" + "D" + "E" + "F"};
		System.out.println(alpha);
		//[Ljava.lang.String;@28a418fc
		//C를 담았을때나 안담았을때나 참조한 변수는 A에 저장되어있으므로 같은 결과가 출력된다
	}
}
