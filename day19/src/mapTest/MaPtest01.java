package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

// 1번 : HashMap
public class MaPtest01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
//		HashMap<K, V> key와 value가 한쌍이다
		System.out.println(al.toString());
//		al.add(al);
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al); //[1, 2, 3]
		System.out.println(al.get(1));
		
		HashMap<String, Integer> map = new HashMap<>();
//		HashMap map = new HashMap<>();
		System.out.println(map.toString());
//		map.put(map, map);
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map); //{key=value}
		System.out.println(map.get("b"));
		//인덱스를 몰라도 key값으로 해당 value를 출력할 수 있다; 가장 큰 차이!!
		
		map.put("a", 10);
		System.out.println(map);
//		a의 키 값은 그대로이나, value값이 바뀜
//		key 값은 추가할시 기존꺼가 바뀜!
		map.put("d",4);
		System.out.println(map);
//		기존에 없었으나, d라는 자리에 4를 해싱해서 새로이 출력해준다
		
//		put(key, value) 한쌍으로 추가
//		 메뉴가격이 있는 가격표 같은걸 만들때 key와 value에 메뉴와 가격을 넣는식으로 활용가능
//		get(key) 해당 key의 value값 반환
//		size()		해당 요소의 길이 반환
//		keySet()
//		values()
		
		System.out.println(map.keySet()); //문자열 리스트로 반환, 반환타입 Set 인터페이스
//		key값만 뽑아줌	
		System.out.println(map.values()); //반환타입 Collection 인터페이스
//		value값만 뽑아줌
		Collection co = map.values();
//		ListSet의 최상위 클래스, 인터페이스에서 Collection으로 반환하여 출력
		System.out.println(co);
		
	}
}
