package kosta_phone;

public class UniversityPhone_Info extends Phone_info {
	private String major;
	private int Stuedent_code;
	public UniversityPhone_Info() {
		// TODO Auto-generated constructor stub
	}

	public UniversityPhone_Info(String name, String number, String birth, String major, int Student_code) {
		super(name, number, birth);
		this.major = major;
		this.Stuedent_code = Student_code;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("전공 :" + this.major);
		System.out.println("학번 :" +this.Stuedent_code);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStuedent_code() {
		return Stuedent_code;
	}

	public void setStuedent_code(int stuedent_code) {
		Stuedent_code = stuedent_code;
	}
	

}
