package kosta_oop;

public class CheckingAccount_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount obj = new CheckingAccount();
		CheckingAccount obj2 = new CheckingAccount();
		CheckingAccount obj3 = new CheckingAccount("1111-1111", "gg", 500000, "123");
		
		
		
		
		System.out.println("계좌주 :" + obj3.getOwnerName());
		System.out.println("잔액 : "+obj3.getBalance());
		obj3.withdrwal(300);
		System.out.println("출금 후 남은 잔액 : " + obj3.getBalance());
		obj3.deposit(3000);
		System.out.println("입금 후 남은 잔액 : " + obj3.getBalance());
		obj3.show();
		
		try {
			System.out.println("지불된 금액 : " + obj3.pay("123", 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println("지불 후 남은 잔액 : " + obj3.getBalance());
		obj3.show();
		
	}

}
