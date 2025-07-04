package SwitchTest;
//14번 : switch문
public class SwitchTest01 {
	public static void main(String[] args) {
		
		String animal = "강아지";
	/*	
		switch ("고양이") {
		case "강아지":
			System.out.println("선택한 동물은 강아지입니다");
			break;
//			선택한 동물은 강아지입니다
//			break;을 적으면 break 걸린곳 위만 나옴
		case "고양이":
			System.out.println("선택한 동물은 고양이입니다");
			break;
//			선택한 동물은 고양이입니다
//			강아지에서 break를 걸었음에도 switch안에 "고양이"를 넣으니까 
//			고양이가 나오고나서야 브레이크가 걸림
		case "코알라":
			System.out.println("선택한 동물은 코알라입니다");
			break;
		default:
			System.out.println("선택한 동물이 없습니다");
			break;
			
//			선택한 동물은 강아지입니다
//			선택한 동물은 고양이입니다
//			선택한 동물은 코알라입니다
//			선택한 동물이 없습니다
//			break문 안적으면 전부 출력
//		}
		*/
		
		switch (20) { 
		case 10:
				System.out.println("10입니다");
				break;
		case 100:	
				System.out.println("100입니다");
				break;
		case 50:
				System.out.println("50입니다");
				break;
//			100입니다
		default:
				System.out.println("case에 값이 없습니다");
				break; // < break를 안적고 코드를 작성하면 어떤 문제가 생길지 모름, 그래서 필수작성
//				case에 값이 없습니다 < case에 없는 값을 적어두면 마지막꺼가 출력
		
		}
	}
}
