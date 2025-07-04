package Mento;
// 177p 3번
// 3.철수는 동생과 카드 게임을 했습니다. 카드 게임에 사용된 카드는 중복되는 숫자 없이 (1 ~ 100 추가;)
// 총 10장입니다. 배열과 랜덤함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요.
// 
public class ex1 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + (j * i) + "\t");
			} System.out.println();
		}
	}
}
