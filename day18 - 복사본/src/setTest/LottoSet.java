package setTest;
import java.util.ArrayList;
import java.util.Collections;
// 로또뽑기 메소드 생성(로또는 6개 뽑음)
import java.util.HashSet;
import java.util.Random;

public class LottoSet {
	public static void main(String[] args) {
		printLotto(5);
		
	}
	
	static void printLotto(int num) {
		Random r = new Random();
		HashSet<Integer> lottoNum = new HashSet<>();
		ArrayList<Integer> result = null;
		
		for(int i = 0; i < num; i++) {
			while(lottoNum.size() < 7) { //lottoNum을 지정할때 Set 추가,
				lottoNum.add(r.nextInt(45) + 1); //Set이므로 중복무시
			}
		}
		result = new ArrayList<>(lottoNum);
		Collections.sort(result); //result보다 Collections가 먼저 올라가면 null값이라 오류발생
		System.out.println(result);
//		System.out.println(lottoNum);
	}
	
}
