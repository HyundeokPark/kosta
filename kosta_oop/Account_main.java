package kosta_oop;

public class Account_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		Account obj2 = new Account();
		Account obj3 = new Account("1111-1111", "gg", 500000);
		
		obj.accountNum ="1-1";
		obj.ownerName = "s";
		obj.balance = 300;
		
		obj.deposit(3000);
		
		
		obj.withdrwal(300);
		System.out.println("계좌주 :" + obj.ownerName);
		System.out.println("잔액 : "+obj.balance);
		System.out.println("출금 후 남은 잔액 : " + obj.balance);
		
		obj.show();
		
		
		
//		  while(true) { 
//			  System.out.println("1. 입금  2. 출금"); 
//			  }
		 
		
	}

}
