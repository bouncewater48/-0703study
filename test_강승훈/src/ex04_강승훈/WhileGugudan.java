package ex04_강승훈;

public class WhileGugudan {
	public static void main(String[] args) {
//		while문 선언
//		바깥for문 선언
		int i;
//		int j;
//		int k;
		while(true) {
			for(int i = 1; i <= 9; i++)
				for(int j = 1; j <= 9; j++) {
					for(int k = i; k <= i && k < 10; k += 3)
					System.out.print(k + " * " + j + " = " + (k + j) + "\t");
//						System.out.println();
						}if(i >= 10){
							break;					
			}
		}
		System.out.println();
	}
}
