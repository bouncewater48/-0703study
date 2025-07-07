package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {

		HashSet<String> animalSet = new HashSet<>();

		animalSet.add("하마");
		animalSet.add("코알라");
		animalSet.add("치타");
		animalSet.add("호랑이");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마"); // 중복값은 출력하지 않음
		System.out.println(animalSet); // 중복값을 제외하고 출력
		System.out.println(animalSet.toString());

		// Iterator : 반복자
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter);

		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext()); 무한반복으로 true 출력
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); //false
//		System.out.println(animalIter.next()); //예외발생
		while (animalIter.hasNext()) {
			// false면 더이상 hasNext에 못들어가니 탈출
			System.out.println(animalIter.next());
		}

	}
}
