package kosta.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum; //기존의 count 변수로 활용!...
	
	public MyBank() {
		this.customersNum = 0;
		customers = new Customer[10]; //기본 10명으로 생성!
	}
	
	public void addCustomer(String ID , String name, long balance) {
		if(this.customersNum > this.customers.length-1) {
			System.out.println("더이상 추가 할 수 없습니다.");
		}
		else {
			customers[this.customersNum++] = new Customer(ID, name, balance);
		}
	}
	
	public int getCustomerNum() {
		return this.customersNum;
	}
	
	public Customer getCustomer(String ID) {
		int index = 0;
		for(int i=0; i <this.customersNum; i++ ) {
			if(ID.equals(this.customers[i].getID())) {
				index = i;
				break;
				//System.out.println("index = " + i);
			}
			//System.out.println("if문 종료");
		}
		return this.customers[index];
	}
	
	public Customer[] getAllCustomers() {
		Customer[] newCustomers =  new Customer[this.customersNum];	
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		//return this.customers;
		return newCustomers;
	}

	public void deleteCustomerInfo(String ID) {
		int deletdIndex = this.searchIndex(ID);
		System.out.println("deletedIndex = " + deletdIndex);
		for(int i =deletdIndex ; i<= this.customersNum-1; i++) {
				//System.out.println("삭제 포문 진입");
				this.customers[i] = this.customers[i+1];
				//System.out.println("큰 값 덮어씌우기 성공");
			}
			this.customersNum--;
			//System.out.println("count :" + this.count);
		}
	
	public int searchIndex(String ID) {
		int index = -1;
		for(int i=0; i<this.getCustomerNum(); i++) {
			if(ID.equals(customers[i].getID())) { 
				index = i;
			}
		}
		//System.out.println("일치하는 고객정보의 index :" + index);
		return index;
	}
	
	public void updateCustomerInfo(String ID, String newOwner) {
		this.getCustomer(ID).setName(newOwner);
	}
}
