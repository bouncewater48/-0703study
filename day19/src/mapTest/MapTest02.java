package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// 2번 : 메뉴에 맞는 값 출력하기
public class MapTest02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> coffee = new HashMap<>();
		
		//추가 put
		coffee.put("아메리카노", 2000);
		coffee.put("카페라떼", 2400);
		coffee.put("카푸치노", 2400);
		coffee.put("카라멜마끼아또", 3000);
		
		System.out.println(coffee);
//		{카푸치노=2400, 아메리카노=2000, 카페라떼=2400, 카라멜마끼아또=3000}
//		중복만 안될뿐, 순서가 없다
		
//		조회 get
		System.out.println(coffee.get("아메리카노"));//2000
		
		//삭제 remove
		System.out.println(coffee.remove("카라멜마끼아또"));
//		remove에서 key값을 넣어서 해당하는 타입으로 value값 반환되고 삭제
		System.out.println(coffee.remove("카라멜마끼아또", 3000));
//		remove에서 key값과 value값을 넣어서 boolean으로 삭제 성공여부 반환 후 삭제
		System.out.println(coffee);
		
//		containsKey
//		Key에 해당값이 들어있는지 true, false로 확인 가능
		System.out.println(coffee.containsKey("새우깡"));
//		containsValue
//		Value에 해당 값이 들어있는지 true, false로 확인 가능
		System.out.println(coffee.containsValue(2000));
		
//		Iterator
//		keySet -> key만 가져오기
		System.out.println(coffee.keySet());
//		하나씩 출력하기
		Iterator<String> iter = coffee.keySet().iterator();
//		참조값, 위치확인 / $가 존재한다 = 내부클래스
//		System.out.println(iter);
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Values -> value만 가져오기
		System.out.println(coffee.values());
//		하나씩 출력하기
		Iterator<Integer> iter2 = coffee.values().iterator();
//		참조값, 위치확인 / $가 존재한다 = 내부클래스
//		System.out.println(iter2);
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println(coffee);
		
		//Entry :  key, value 한쌍씩 가져오기
		System.out.println(coffee.entrySet());
//		{}에서 []로 바뀜, 반환타입이 Set이였으므로 HashSet으로 바뀜
//		하나씩 가져오기
		Set<Entry<String, Integer>> items = coffee.entrySet();
//		entrySet에 컨트롤 클릭해서 나오는 서식과 똑같이 작성
//		Set 안에 <Entry<String, Integer>>가 존재
		System.out.println(items);
//		반복문 돌리기
		for(Entry<String, Integer> entry : items) {
			System.out.println(entry);
//			카푸치노=2400
//			아메리카노=2000
//			카페라떼=2400
//			entry를 활용해서 한쌍씩 출력
			
		}
		
	}
}
