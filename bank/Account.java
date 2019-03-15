package kosta.bank;

public class Account {
	private String ID;
	private long balance;

	public Account() {
	
	}

	public Account(String id, long balance) {
		super();
		this.ID = id;
		this.balance = balance;
	}
	
	public void deposit(long amt) {
		this.balance +=amt;
	}
	
	public boolean withdraw(long amt) {
		if(this.balance < amt) {
			//throw new Exception("ÀÜ¾×ºÎÁ·");
			return false;
		}
		else
			this.balance -=amt;
			return true;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	

}
