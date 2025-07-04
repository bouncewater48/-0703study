package twoForTest;
//실습 : Gugudan02
import java.util.Scanner;

public class Gugudan02 {
	public static void main(String[] args) {
		/*
		 * 4) while문만 이용 구구단 출력(단별로 가로로 출력하기)
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int first = sc.nextInt();
//		int second = sc.nextInt();
//		while(true) {
//		for(int i = 1; i < first + 1; i++) {
//			for(int j = 1; j <= second; j++) {
//				System.out.print(i + "단 : \n");
//				System.out.println(i + " x " + j + " = "  + (i * j) + "     ");
//				}
//				System.out.println(" ");
//			}
	

			//바깥 for문 => 곱해지는 수
			System.out.printf("=========================");
			for(int i1 = 1; i1 <= 9; i1++) { //바깥for문 i => 1 ~ 9
				for(int dan = 2; dan <= 9; dan++) {
				System.out.println(dan + "단");
	           //안쪽for문 dan => 2 ~ 9, 바깥문이 1번 돌 동안 안쪽문은 전부 다 돌아감
//	              System.out.println(dan + " x " + i + " = " + (dan * i));
//	              System.out.println(i + ", " + dan);
//	              System.out.print(dan + ", " + i);
//	              System.out.println(dan + ", " + i + " = " + (dan * i) + "\t");
	              System.out.printf("%d x %d = %2d\t", dan, i1, dan * 1); //\t로 탭키를 적용해서 깔끔하게 보이게 만드는거
	              //2~9단을 출력하기 위해서 dan이 뒤가 아닌 앞으로 나와야함
//	              System.out.print(dan + ", " + i);
	           }
	        }
//	       System.out.println();
	}
}