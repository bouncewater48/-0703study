package ex02_강승훈;
/*
2. 은행 계좌 프로그램
은행계좌 클래스 : Account
필드 : 잔고 balance
출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
            출금금액의 0원이 부족하여 출금이 불가합니다. 출력
입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력

=> 모든 예외처리는 메소드를 사용하는 쪽으로 던지기
*/
public class Account {
		
//	필드 : 잔고 balance
	private int balance;
	
//	기본 생성자
	public Account() {
		super();
	}
	
//	생성자
	public Account(int balance) {
		this.balance = balance;
	}
	


	//	출금 메소드
	public void withdraw(int withdraw) throws Exception{;
		if(balance < withdraw) {
			throw new Exception("출금하려는 금액은 " + withdraw + "원이며," + 
					(withdraw - balance) + "원이 부족하여 출금이 불가합니다.");
		}
	}
	
//	입금 메소드
	public void deposit(int deposit) {
		balance += deposit;
		System.out.println("통장에 " + deposit + 
							"원 입금했습니다.\n현재 잔고는 " + balance + "원입니다. ");
		}
//	\n현재 잔고는 " + balance + "원입니다. deposit 메소드 마지막에 넣으니 withdraw와 맞물려 2번 출력되서 빠짐
	
	public static void main(String[] args) {
		Account ac = new Account();
		
//		ac.deposit(10000);
		ac.deposit(4000);
		
		try {
//			ac.withdraw(4000);
			ac.withdraw(6000);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			ac.withdraw(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
