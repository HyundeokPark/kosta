package kosta_oop;

public class CheckingAccount_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount obj = new CheckingAccount();
		CheckingAccount obj2 = new CheckingAccount();
		CheckingAccount obj3 = new CheckingAccount("1111-1111", "gg", 500000, "123");
		
		
		
		
		System.out.println("������ :" + obj3.getOwnerName());
		System.out.println("�ܾ� : "+obj3.getBalance());
		obj3.withdrwal(300);
		System.out.println("��� �� ���� �ܾ� : " + obj3.getBalance());
		obj3.deposit(3000);
		System.out.println("�Ա� �� ���� �ܾ� : " + obj3.getBalance());
		obj3.show();
		
		try {
			System.out.println("���ҵ� �ݾ� : " + obj3.pay("123", 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println("���� �� ���� �ܾ� : " + obj3.getBalance());
		obj3.show();
		
	}

}
