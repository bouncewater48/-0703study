package classBasic2;
// 13-1번 : 클래스의 특징3(객체 생성의 틀)
public class Car {
	//바퀴, 핸들, 색상, 엔진, 모델명, 제조사, 속도	
	
	
	//필드
	String model; //모델명(제조사)
	String color; //색상
	int speed;	  //속도
	
	//메소드	
	//속도를 증가시키는 메소드(매개변수 o, 리턴값 x 메소드 정의 => 객체명.메소드명(인수);
//	System.out.println("현재 속도 : " + myCar.speed);
	void accelerate(int value) {
		speed += value; 
		System.out.println("현재 속도 : " + speed);
	}
	
	//주행을 멈추는 메소드(매개변수 x, 리턴값 x 메소드 정의 => 객체명.메소드명();)
	void stop() {
		speed = 0; 
	}
	
	//속도를 감소시키는 메소드
	//매개변수 x 리턴값 x => 객체명.메소드명();
	//속도는 10씩만 감소되도록 기능 구현
	
	void decrease() {//바로 speed -= 10;을 넣으면 -10으로 출력, 조건문 추가필수
		//조건문 if < 0, 먼저 감소를 시키고 속도가 0보다 작은지 조건문으로 확인
		// if(speed >= 0)으로 하면 -10으로 내려가니 주의
			speed -= 10;
			if(speed < 0) {
			speed = 0;
		}	System.out.println("주행을 멈췄습니다");
			
	}
	
}
