package ex01_강승훈;

public abstract class Person {

		
	//필드 : 이름, 나이(접근제한자 private)
	//생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
	//점수계산메소드(접근제한자 public, 메소드명 score) => 점수가 없습니다 출력
	
//	필드
	private String name;
	private int age;
	
//	생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
//  getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


//	점수계산 메소드
    public void score() {
        System.out.println("점수가 없습니다");
    }
    

}
