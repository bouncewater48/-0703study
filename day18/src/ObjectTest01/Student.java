package ObjectTest01;
// 3번 : Object 클래스 - toString 메소드
public class Student {
	//필드
	String name;
	int javaScore;
	int dbmsScore;
	int total;

	//생성자
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}
	  //메소드
	@Override
	public String toString() {
//		return super.toString();
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
//		public native int hashCode();
//		native : 다른 언어에서 자바로 변환할때 쓰임
		return "Student [name : " + this.name + ", javaScore : " + this.javaScore
				+ ", dbmsScore  :" + this.dbmsScore + " ]";
	}
}
