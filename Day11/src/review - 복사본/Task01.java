package review;

public class Task01 {
	public static void main(String[] args) {
		//객체명.메소드명 호출
		Task01 t1 = new Task01();
		
		String str = "hello java";
		for(int i = 0; i < str.length(); i++) {
			
		}
		
	}
	//1. 문자열 속의 단어를 공백 기준으로 세기
	//메소드명 : countWord
	//매개변수 : String str
	//ex) I love java => 3개 출력
	//ex) 안녕하세요 저는 강승훈입니다 java 공부 중입니다 => 6개 출력
	
	//1) 리턴타입 => void
	//2) 메소드명 => countWord
	//3) 매개변수 => String str
	//4) 구현부
	//	조건문(if문) str이 null과 같다면	str == null /입력값이 없을때 0(null)을 출력
	//		return 0;
	//	변수 2개 선언(정수형변수1(몇개의 그룹인지), 논리형변수2(반환여부 확인))
	//	반복문 초기식 int i = 0;
	//		 조건식 i < str.length();
	//		 증감식 i++
	//		문자형변수3 = str.charAt(i); /공백이 있는지 비교
	//		조건문 if(변수3 != ' ' && ! 변수2) 
	//			변수2 = true; /변수2를 다시 true로 바꾸기
	//			변수1++;
	//		조건문 else if(변수3 == ' ')
	//			변수2 = false
	//	return 변수1;
	//
	
	
	
	
	
	
	
	//2. 주민등록번호로 성별 판단하기
	//메소드명 : getGender
	//1, 3 => 남자
	//2, 4 => 여자
	
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아서 평균을 구하여
	//각 학생별 학점 구하기 (소수점 없이 정수형으로만, 등급은 평균점수로 계산)
	//메소드명 : getGrade
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F

}