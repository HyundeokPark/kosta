package kosta.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum; //������ count ������ Ȱ��!...
	
	public MyBank() {
		this.customersNum = 0;
		customers = new Customer[10]; //�⺻ 10������ ����!
	}
	
	public void addCustomer(String ID , String name, long balance) {
		if(this.customersNum > this.customers.length-1) {
			System.out.println("���̻� �߰� �� �� �����ϴ�.");
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
			//System.out.println("if�� ����");
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
				//System.out.println("���� ���� ����");
				this.customers[i] = this.customers[i+1];
				//System.out.println("ū �� ������ ����");
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
		//System.out.println("��ġ�ϴ� �������� index :" + index);
		return index;
	}
	
	public void updateCustomerInfo(String ID, String newOwner) {
		this.getCustomer(ID).setName(newOwner);
	}
}
