package kosta.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
	private MyBank myBank;		//MyBank 
	
	public BankSystem(){	
		myBank = new MyBank();
		showMenu();
	}
	
	public void showMenu(){		//show method �����
		String  menu = null;			
		String id = null;
		String name = null;
		long balance = 0;
		
		do{
		
			System.out.println("****�޴��� �Է��ϼ���****");
			System.out.println("1. �����");
			System.out.println("2. ��������ȸ");
			System.out.println("3. ����ü��ȸ");
			System.out.println("4. ���������");
			System.out.println("5. �������Ա�");
			System.out.println("6. ����������");
			System.out.println("7. ����������");
			System.out.println("***������***");
			System.out.println("***************");
			System.out.print(">>");			
			
			menu = readFromKeyboard();			
		
			if(menu.equals("1")){				//�����
				
				System.out.print("ID�� �Է��ϼ���: ");
				id = readFromKeyboard();
				
				System.out.print("�̸��� �Է��ϼ���: ");
				name = readFromKeyboard();
				
				System.out.print("�ܰ� �Է��ϼ���: ");
				try {
					balance = Long.parseLong(readFromKeyboard());
				}
				catch(Exception e) {
					System.out.println("�ܰ�� ���ڸ� �Է��ϼž� �մϴ�.");
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break;
				}
				
				myBank.addCustomer(id, name, balance);
				System.out.println("������ " + (myBank.getAllCustomers().length - myBank.getCustomerNum()) +"�� ��� �ϽǼ� �ֽ��ϴ�." );
			}else if(menu.equals("2")){
				System.out.print("��ID�� �Է��ϼ���: ");
				id = readFromKeyboard();
				Customer cust = myBank.getCustomer(id);
				if(cust == null){
					System.out.println("��ϵ� ���� �ƴմϴ�.");
				
				}
				else {
					System.out.println(cust.getID() +":" + cust.getName() + ": "
							+ cust.getAccount().getBalance());	
				}
				
			
			}else if(menu.equals("3")){
				
				Customer[] allCust = myBank.getAllCustomers();
				//System.out.println("allcust : " + allCust);
				if(myBank.getCustomerNum()==0) {
					System.out.println("��ϵ� ���� �����ϴ�.");
				}
				else {
					for(int i=0;i<allCust.length;i++){ //allCust.length���� myBank.getCustomerNum()���� ����, customerNum �� count�� ���� ����!
						if(allCust[i] == null) {
							continue;
						}
						System.out.println(allCust[i].getID() + ": " +
														allCust[i].getName() + " : s" +
														allCust[i].getAccount().getBalance());
					}
				}
				
				
			}else if(menu.equals("4")){
				
				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("��ϵ� ���� �ƴմϴ�.");
				
				}else{
					System.out.print("��ݾ��� �Է��ϼ���: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().withdraw(balance)){
						System.out.println("���������� ��ݵǾ����ϴ�.");
						System.out.println("����� �ܰ�� :" + cust.getAccount().getBalance());
					}else{
						System.out.println("�ܰ� �����մϴ�.");
					}
				} 
				
			}
			else if(menu.equals("5")) {
				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("��ϵ� ���� �ƴմϴ�.");
				
				}else{
					System.out.print("���ݾ��� �Է��ϼ���: ");
					balance = Long.parseLong(readFromKeyboard());
					
					cust.getAccount().deposit(balance);
					System.out.println("���������� �ԱݵǾ����ϴ�.");
					System.out.println("�Ա��� �ܰ�� :" + cust.getAccount().getBalance());
				} 
			}
			
			else if(menu.equals("6")) {
				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("��ϵ� ���� �ƴմϴ�.");
				
				}else{
					System.out.print("�絵�� �����ָ� �Է��ϼ���.: ");
					name = readFromKeyboard();
					
					myBank.updateCustomerInfo(id, name);
					System.out.println("���������� �絵 �Ǿ����ϴ�.");
					System.out.println("����� ������ :" + cust.getName());
				} 
			}
			
			else if(menu.equals("7")) {
				System.out.print("���� ID�� �Է��ϼ���.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("��ϵ� ���� �ƴմϴ�.");
				
				}else{
					myBank.deleteCustomerInfo(id);
				} 
			}
			
		}while(!menu.equals("q"));
	}
	


	public String readFromKeyboard(){
		String input = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return input;
	}
	
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();

	}

}










