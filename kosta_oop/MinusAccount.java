package kosta_oop;

public class MinusAccount extends Account{
	private int creditLine = 10000;
	
	public MinusAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MinusAccount(String accountNum, String ownerName, int balance) {
		super(accountNum, ownerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	public int withdrwal(int amount) {
		if(this.getBalance() + this.creditLine < amount) {
			return 0;
		}
		else {
			 this.setBalance(this.getBalance()-amount) ;
			return amount;
		}
	}
}
