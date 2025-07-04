package review;

	class Animal{
		//필드
		String name;
		int age;
		
		
		//생성자
		public Animal(String name, int age) {
			this.name = name;
			this.age = age;
//			Animal a = new.Animal();
//			name = "강아지";
//			age = 8;
			
			
		}
		//	eat(String food) 이름이 음식을 먹습니다 출력
		void eat(String food){
			System.out.println(this.name + "이/가" + food + "를/을 먹고있습니다");
		}
		//	play()		 	 이름이 놀고있습니다 출력
		void play() {
			System.out.println(this.name + "이 놀고있습니다");
		}
		//	sleep()			 이름이 잠을 잡니다 출력
		void sleep() {
			System.out.println(this.name + "이/가 잠을 잡니다");
		}
		//	sleep(int time)	 이름이 몇시에 잠을 잡니다 출력
		void sleep(int time) {
			System.out.println(this.name + "이/가" + time + "시에 잠을 잡니다");
		}
	}

public class Main {
	public static void main(String[] args) {
		//동물 클래스 작성
		//- Animal 클래스 정의
		//필드 : 이름(name), 나이(age)
		//메소드 : 
		
		//main 메소드에서 객체 2개를 만들고 모든 메소드 호출하기	
		Animal ani1 = new Animal("멍멍이", 2);
		Animal ani2 = new Animal("야옹이", 3);
		
		  ani1.eat("간식");
	      ani1.sleep();
	      ani1.sleep(10);
	      ani1.play();

	      ani2.eat("츄르");
	      ani2.sleep(15);
	      ani2.sleep();
	      ani2.play();

	}
}
