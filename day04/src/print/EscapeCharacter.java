package print;
//7번 : 이스케이프 문자
public class EscapeCharacter {
	public static void main(String[] args) {
//		이스케이프 문자는 문자열 안에서 \를 이용하여 작성한다(문자열"" 안에서만!)
//		"\n"   "\t"   "\'"        "\""      "\\"를 표현한다
//		줄바꿈 간격띄우기  작은따옴표     큰 따옴표     역슬래쉬
		
//		줄바꿈 : \n
		System.out.println("안녕하세요.\n4일차 수업중입니다.\n"); 
		//앞뒤에 \n을 붙혀서 앞뒤 모두 바로 줄바꿈되는거 확인가능!
//		System.out.println("안녕하세요.");
//		System.out.println("4일차 수업중입니다."); //굳이 따로 적을 필요 없음
		System.out.println("지금은\n이스케이프 문자\n배우는 중입니다.");
	
//		탭 간격 : \t
		System.out.println("이름 : 강승훈, 나이 : 20살");
		System.out.println("이름 : 강승훈\t나이 : 20살");
		System.out.println("자바는 정말 재미있다. 자바 2일차!"); //아래처럼 \t를 적으면 이렇게 안 띄워도 문제없음
		System.out.println("자바는 정말 재미있다.\t자바 2일차!"); //결과에 간격이 안 긴 이유는 탭키를 적용했을때 그만큼만 적용되서임
		System.out.println("자바는 정말 재미있다.\t\t자바 2일차!"); //탭키 2번을 해야 큰 차이가 나는 모습임
 
//		문자열 안에서 작은 따옴표, 큰따옴표 표현 : \', \"
		System.out.println("오늘 날씨는 \"흐림\"입니다."); //큰 따옴표가 어디를 자르는지 컴퓨터가 인식을 못하고,한글로 이루어진 변수로 인식해서 문법오류 발생
		System.out.println("오늘 날씨는 \'비\'가 옵니다."); //작은 따옴표 자체를 문장에서 처음 쓰기에 제대로 인식함
		
		
		//역슬래쉬 : \\
		System.out.println("워크스페이스 경로는 D:\\web_0900_ksh입니다"); 
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		//\하나만 쓰면 백슬래쉬 언어가 잘못됐다 나옴
		
//		복합사용
		System.out.println("문자열 안에서 다양한 제어문자를 표현할 수 있다.\n\"\\n\"을 쓰면 줄바꿈이 된다."
				+ "\n\t\'\\t\'을 쓰면 탭키가 적용된다");
		//한줄로 썼음에도 3줄로 출력되는걸 확인가능함
				
	}
}
