package print;
//9번 : printf() 출력메소드
public class PrintTest02 {
	public static void main(String[] args) {
		
//		String name = "강승훈";
//		int age = 20;
//		System.out.println("제 이름은 강승훈이고, 나이는 20살입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
//		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.", name, age); // 뒤에다 메소드를 추가하는건 printf만 가능!
		
//		정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", num1); //""안에다 num1 값을 가져오기에 
		System.out.printf("10진수 : %d\n", 10); // 10진수는 0~9까지 표현가능한데 10을 출력하라하기에 한자리로 안되서 0 앞에 1이 새로 붙은 모습
		System.out.printf("8진수 : %o\n", 8); //10이 숫자 10이 아닌 0~7까지만 표현 가능하기에 1과 0으로 표시된것
		System.out.printf("16진수 : %x", 16); //16진수는 10 A, 11 B, .. 15 F, 16 => 10
		
//		실수형
		System.out.printf("\n실수형 : %f\n", 3.1234567); 
		//float 타입 => 소수점이하 6자리까지 정확히 출력되고, 7자리 이상이면 7번째 자리에서 반올림한다
//		double num2 = 3.12345678912345; //소수점이하 15자리까지 정확히 나옴, 더 정확하게 표시가 가능한 범위가 크기에 기본형임
//		float num3 = 3.12345678912345; //소수점이하 6자리까지 정확히 나옴, 7자리가 넘어가면 7자리에서 6자리로 반올림함
//		System.out.println(num2);
		System.out.printf("실수형 2자리까지 표현 : %.2f\n", 3.12345); //6자리까지 표시라서 6자리가 0으로 표기됨,.2를 넣어서 2자리까지만 표기됨
//		System.out.printf("\n실수형 2자리까지 표현 : %.2f\n", 3.0); 실수형 2자리까지 표현 : 3.00
		
//		문자형
		System.out.printf("\n문자형 : %c",'a'); //character타입은 ''안에 하나의 문자만 넣을 수 있다
		
//		문자열
		System.out.printf("\n문자열 : %s", "hello");	// \n으로 다음줄로 넘긴다는 처리,
//		문자열 hello를 표현
		String data = "hello, java";
		System.out.println(data); //위에 String data에 "hello, java"를 넣었고 맨 윗줄에서 \n으로
//		다음줄로 넘김 처리해서 앞에 hello를 출력,띄워쓰기 없이 hello, java까지 같이 출력
		System.out.printf("문자열 : %.5s", data);
		//data 변수에 저장된 hello, java를 출력함, .5를 적으면 앞 5자리만 출력
	
		//논리형(형식지정자 x)
		System.out.printf("\n논리형 : %s", true);
		System.out.printf("\n논리형 : %.1s", true); //마찬가지로 .1로 t만 뽑아내는게 가능함
		
	}
}
