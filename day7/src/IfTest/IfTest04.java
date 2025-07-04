package IfTest;
//13번 : if~if문, if~else if문 차이 / if문 중첩
public class IfTest04 {
	public static void main(String[] args) {
		//if~if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다
		int num = 10; int grade = 100;
		if(num > 5){
			System.out.println("num은 5보다 큽니다");
		} //num이 5초과일 경우 출력, 5이하일 경우 미출력
		if(num > 3) {
			System.out.println("num은 3보다 큽니다");
		} //num이 3 초과일 경우 출력, 3이하일 경우 미출력, 
		  //if else if문이 아닌 if문만 작성됐으므로 첫번째 if문이 출력됐어도 같이 출력됨
	
		//if~else if문 : 위의 조건식이 true면 아래 있는 조건식은 무시된다
		if(num > 5) {
			System.out.println("num은 5보다 큽니다");
		//num이 5초과일 경우 출력, 5이하일 경우 미출력
		}else if(num > 3){
			System.out.println("num은 3보다 큽니다");
		}//num이 3 초과일 경우 출력, 3이하일 경우 미출력,조건을 만족했어도 
		//if else if문을 위에서 썼기에 첫번째 조건식이 만족하면 이건 출력되지 않고 무시됨
	
		//if문 중첩
		//90점 이상은 A, 100점은 만점으로 A 출력
//		if(grade == 100) {
//			System.out.println("만점으로 A");
//		}else if(grade >= 90) {
//			System.out.println("A");
//		}
		
		if(grade >= 90) {
			if(grade == 100) {
					System.out.println("만점으로 A");
			}else{
			System.out.println("A");
			
//			num은 5보다 큽니다
//			num은 3보다 큽니다
//			num은 5보다 큽니다
//			만점으로 A

			}
	    }
     }
}
