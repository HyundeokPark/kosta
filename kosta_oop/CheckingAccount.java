package kosta_oop;

public class CheckingAccount extends Account {
	private String cardNum;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String cardNum) {
		super();
		this.cardNum =cardNum;
	}

	public CheckingAccount(String ID, String name, int balance, String cardNum) {
		super(ID,name,balance);
		this.cardNum =cardNum;
	}
	
	public int pay(String cardNum, int amt) throws Exception{
		if(!cardNum.equals(this.cardNum) || this.getBalance() < amt) {
			throw new Exception("지불에 실패 했습니다.");
		}
	
		return this.withdrwal(amt); 
		
	}
	

	public String getCardNum() {
		return cardNum;
	}
}
