package kosta_oop;

public class Account {
	//����� ������ ������ �����ؾ��Ѵ�. 
	//���¹�ȣ, ������, �ܾ� = ���� = �ɹ�����(�ʵ�)
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



	//����� ��� = �ൿ = �ɹ��޼ҵ�(���۷��̼�)
	//�Ա��ϴ�, ����ϴ�, ��ȸ�ϱ�
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
		System.out.println("�ܾ� :" + this.balance);
	}
}
