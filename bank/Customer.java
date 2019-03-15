package kosta.bank;

public class Customer {
	private String ID;
	private String name;
	private Account account;
	
	public Customer() {
		
	}
	
	public Customer(String ID, String name, long balance) {
		this.ID = ID;
		this.name = name;
		this.account= new Account(ID,balance);
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return this.ID;
	}
}
