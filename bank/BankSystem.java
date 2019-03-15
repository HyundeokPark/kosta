package kosta.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
	private MyBank myBank;		//MyBank 
	
	public BankSystem(){	
		myBank = new MyBank();
		showMenu();
	}
	
	public void showMenu(){		//show method 만들기
		String  menu = null;			
		String id = null;
		String name = null;
		long balance = 0;
		
		do{
		
			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 고객등록");
			System.out.println("2. 고객정보조회");
			System.out.println("3. 고객전체조회");
			System.out.println("4. 고객예금출금");
			System.out.println("5. 고객예금입금");
			System.out.println("6. 고객정보수정");
			System.out.println("7. 고객정보삭제");
			System.out.println("***끝내기***");
			System.out.println("***************");
			System.out.print(">>");			
			
			menu = readFromKeyboard();			
		
			if(menu.equals("1")){				//고객등록
				
				System.out.print("ID를 입력하세요: ");
				id = readFromKeyboard();
				
				System.out.print("이름을 입력하세요: ");
				name = readFromKeyboard();
				
				System.out.print("잔고를 입력하세요: ");
				try {
					balance = Long.parseLong(readFromKeyboard());
				}
				catch(Exception e) {
					System.out.println("잔고는 숫자를 입력하셔야 합니다.");
					System.out.println("프로그램이 종료되었습니다.");
					break;
				}
				
				myBank.addCustomer(id, name, balance);
				System.out.println("앞으로 " + (myBank.getAllCustomers().length - myBank.getCustomerNum()) +"명 등록 하실수 있습니다." );
			}else if(menu.equals("2")){
				System.out.print("고객ID를 입력하세요: ");
				id = readFromKeyboard();
				Customer cust = myBank.getCustomer(id);
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}
				else {
					System.out.println(cust.getID() +":" + cust.getName() + ": "
							+ cust.getAccount().getBalance());	
				}
				
			
			}else if(menu.equals("3")){
				
				Customer[] allCust = myBank.getAllCustomers();
				//System.out.println("allcust : " + allCust);
				if(myBank.getCustomerNum()==0) {
					System.out.println("등록된 고객이 없습니다.");
				}
				else {
					for(int i=0;i<allCust.length;i++){ //allCust.length에서 myBank.getCustomerNum()으로 변경, customerNum 이 count의 역할 수행!
						if(allCust[i] == null) {
							continue;
						}
						System.out.println(allCust[i].getID() + ": " +
														allCust[i].getName() + " : s" +
														allCust[i].getAccount().getBalance());
					}
				}
				
				
			}else if(menu.equals("4")){
				
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}else{
					System.out.print("출금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().withdraw(balance)){
						System.out.println("정상적으로 출금되었습니다.");
						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
					}else{
						System.out.println("잔고가 부족합니다.");
					}
				} 
				
			}
			else if(menu.equals("5")) {
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}else{
					System.out.print("예금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					cust.getAccount().deposit(balance);
					System.out.println("정상적으로 입금되었습니다.");
					System.out.println("입금후 잔고는 :" + cust.getAccount().getBalance());
				} 
			}
			
			else if(menu.equals("6")) {
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}else{
					System.out.print("양도할 계좌주를 입력하세요.: ");
					name = readFromKeyboard();
					
					myBank.updateCustomerInfo(id, name);
					System.out.println("정상적으로 양도 되었습니다.");
					System.out.println("변경된 계좌주 :" + cust.getName());
				} 
			}
			
			else if(menu.equals("7")) {
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
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










