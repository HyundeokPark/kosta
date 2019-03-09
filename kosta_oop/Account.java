package kosta_oop;

public class Account {
	//공통된 데이터 구조를 추출해야한다. 
	//계좌번호, 계좌주, 잔액 = 상태 = 맴버변수(필드)
	String accountNum;
	String ownerName;
	int balance;
	
	public Account() {
		
	}
	
	public Account(String accountNum, String ownerName, int balance) {
		super();
		this.accountNum = accountNum;
		this.ownerName = ownerName;
		this.balance = balance;
	}



	//공통된 기능 = 행동 = 맴버메소드(오퍼레이션)
	//입금하다, 출금하다, 조회하기
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	public int withdrwal(int amount) {
		if(this.balance < amount) {
			return 0;
		}
		else {
			this.balance = this.balance-amount;
			return amount;
		}
	}
	
	public void show() {
		System.out.println("잔액 :" + this.balance);
	}
}
