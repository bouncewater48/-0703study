package review;
//1번 : 복습
public class Oper {
	public static void main(String[] args) {
		int num1 = -4;
		System.out.println(num1 >> 1);
		System.out.println(num1 >>> 1);
		/*num1 = -4
		 * -2
			2147483646
		 */
		System.out.println(Integer.toBinaryString(-4));
		System.out.println(Integer.toBinaryString(-4 >>> 1));
		/*
		 * 11111111111111111111111111111100
		   1111111111111111111111111111110

		 */
	}
}
