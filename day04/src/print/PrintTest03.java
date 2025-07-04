package print;
//10번 : 서식문자의 옵션 printf()
public class PrintTest03 {
	public static void main(String[] args) {
		System.out.println("===================");
		//기본 형식지정자
//		System.out.printf("이름 : %s, 나이 : %d\n", "강승훈", 20); //
//		System.out.printf("%d %.2f 날씨 : %s\n", 2025, 6.16, "흐림" );
//		=================
//				이름 : 강승훈, 나이 : 20
//				%d %f %s > 2025 6.160000 흐림
//		2025.6.16 날씨:흐림 으로 만들 생각
//		System.out.printf("%s %c", true, 'a' );
		//("%s %c", 'a', true )에서 문자열은 문자형을 포함하기에 'a'까진 나오나, true는 논리형이라 에러발생
		//순서를 바꿔서 true가 앞에 오면 해결됨!
		
		
//		자리수를 지정한 출력
		System.out.println("===================");
//		%[왼쪽 - or 0][n][.m]서식문자
		String subject = "java";
		System.out.printf("%10s\n", subject); //기본 10자리 기준 오른쪽 정렬, 좌측에 빈공간 생성
		System.out.printf("%-10s\n", subject); //-를 쓰면 10자리 기준 왼쪽 정렬, 우측에 빈공간 생성
		System.out.printf("%10s %05d\n", subject, 500); //자릿수가 정해지면 오른쪽부터 정렬
//		System.out.printf("%010s %05d", subject, 500); //자릿수가 정해지면 오른쪽부터 정렬
//		s(문자열)앞에 0을 채우면 오류가 발생함!
		System.out.printf("%-5s\n", "강승훈"); //-5s로 5자리까지 왼쪽부터 표현한다 하고
		// 강승훈 3글자만 작성했으므로 3글자만 보이는거같으나, 실제론 뒤 2자리 공백까지 같이 표현함 > 강승훈@@
//		상품명과 가격정렬
		System.out.println("n==========메뉴=========");
		System.out.printf("%-5s\t\t%5d원", "꼬북칩", 2500);
		System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 3000);
		System.out.printf("\n%-5s\t\t%5d원", "껌", 800);
//		-를 이용하여 좌측정렬하면 그럴싸하게 정렬된다!
		
		
		
		
		
		
		
		
	}
}
