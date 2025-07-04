package inheritanceConstructor02;
// 4번 : 상속관계-생성자 확인2
public class CarMain {
	public static void main(String[] args) {
		//부모클래스의 객체 2개 생성
//		Car c1 = new Car(); 기본생성자가 없으므로 못만듦
		Car c2 = new Car("기아", "black", 10000);
		System.out.println(c2);
		
//		c2.boosterOn(); Car 클래스에 없으므로 가져오지 못함
		c2.enginStart();
		
//		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW", "남색", 150000, true);
		SuperCar bmw = new SuperCar(10000, true);
		SuperCar kia = new SuperCar("kia", "black", 10000, false);
		bmw.enginStart();
		kia.enginStart();
		
	}
}
