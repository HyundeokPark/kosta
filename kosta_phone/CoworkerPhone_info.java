package kosta_phone;

public class CoworkerPhone_info extends Phone_info {
	private int Salary;
	public CoworkerPhone_info() {
		// TODO Auto-generated constructor stub
	}

	public CoworkerPhone_info(String name, String number, String birth, int salary) {
		super(name, number, birth);
		this.Salary= salary;
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("ПљБо : " + this.Salary);
	}
	

}
