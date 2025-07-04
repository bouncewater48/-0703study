package constroctorBasic01;

//1-2번 : 생성자 기초
public class Tvmain {
	public static void main(String[] args) {
//	Tv myTv = new Tv();
//	Tv myTv = new Tv("LG", "black", 10, 5);
//	The constructor Tv(String, String, int, int) is undefined
//	매개변수의 순서에 맞게 안넣으면 오류 발생
		Tv myTv = new Tv(10, 5, "LG", "black");
		// 매개순서에 맞게 넣으니 오류 미발생
		// 생성자의 역할을 초기화시켜줌
		myTv.brand = "LG";
		myTv.color = "black";
		myTv.ch = 10; // 초기채널
		myTv.vol = 5; // 초기 볼륨

		System.out.println(myTv.brand + " tv 를 조작합니다");
		System.out.println(myTv.color + "색상 tv의 채널은 " + myTv.ch);
//	myTv.nextChannel();
//	myTv.powerOnOff();
//	myTv.nextChannel();
//	myTv.decreaseVolume();

		Tv myTv2 = new Tv(); // 기본생성자를 주석처리하면 newTv가 사라져서 빨간 오류줄이 생성
		myTv2.brand = "삼성";
		myTv2.color = "red";
		myTv2.ch = 100;
		myTv2.vol = 50;
		System.out.println(myTv2.brand + " tv 를 조작합니다");
		System.out.println(myTv2.power);
		myTv2.previousChannel();
		myTv2.powerOnOff();
		myTv2.previousChannel();

	}
//	boolean power;   //기본값 : false
//	   int ch;
//	   int vol;
//	   String color;
//	   String brand;
//	//볼륨을 올릴 수 있는 메소드
//	//메소드명 : increaseVolume() 매개변수 x, 리턴값 x
//	//	1) if 전원이 켜져있는지 확인
//	//	 켜져있는경우 => 현재 볼륨 출력
//	//	  2) if 현재 볼륨이 99이하라면 볼륨을 1증가, 증가된 볼륨 출력
//	//	  3) else 현재 볼륨이 100이면 볼륨이 최대치입니다 출력
//	//	4) else 꺼져있으면 전원을 먼저 켜주세요 출력
//	void inceaseVolume() {
//		if(power) {
//			System.out.println("현재 볼륨 : " + vol);
//			if(vol <= 99) {
//				vol++;
//				System.out.println("올린 후 현재 볼륨 : " + vol);
//			}else {
//				System.out.println("볼륨이 최대입니다");
//			}
//		}else {
//			System.out.println("전원을 먼저 켜주세요");
//		}
//	}
//	
//	//볼륨을 내릴 수 있는 메소드
//	// 메소드명 : decreaseVolume() 매개변수 x, 리턴값 x
//	//1) if전원이 켜져있는지 확인
//	//		현재 볼륨 출력
//	//	2) if( vol이 1보다 크거나 같을떄)
//	//		볼륨 1감소, 현재 볼륨 출력
//	//	3) else 현재 볼륨이 0일때
//	//		볼륨이 최소입니다 출력
//	//4) else전원을 먼저 켜주세요
//	void decreaseVolume() {
//		if(power) {
//			System.out.println("현재 볼륨 : " + vol);
//			if(vol >= 1) {
//				vol--;
//				System.out.println("내린 후 현재 볼륨 : " + vol);
//			}else {
//				System.out.println("현재 볼륨이 0입니다");
//			}
//		}else {
//			System.out.println("전원을 먼저 켜주세요");
//		}
//	}
//	
//	if (power) {
//		ch++;
//		if(ch >= 999) {
//			ch = 1;
//		}
//		System.out.println();
//	}
//	
//	//채널을 올리는 메소드
//	//메소드명 : nextChannel() 매개변수x, 리턴값x
//	void nextChannel() {
//		if(power) {
//			System.out.println("현재채널 : " + ch);
//			if(ch >= 1) {
//				ch--;
//				System.out.println("올린 후 현재 채널 : " + ch);
//			}else {
//				System.out.println("채널의 끝입니다");
//			}
//		}else {
//			System.out.println("전원을 먼저 켜주세요");
//		}
//	}
//	 // 채널 내리는 메소드
//	   // 메소드명 : previousChannel() 매개변수 x, 리턴값x
//	   void previousChannel() {
//	      if (power) {
//	         System.out.println("현재채널 : " + ch);
//	         if (ch >= 1) {
//	            ch--;
//	            System.out.println("내린 후 현재 채널 : " + ch);
//	         } else {
//	            System.out.println("현재 채널이 0번입니다");
//	         }
//	      } else {
//	         System.out.println("전원을 먼저 켜주세요");
//	      }
//	   }

}
