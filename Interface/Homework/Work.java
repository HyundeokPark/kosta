package kosta.Interface.Homework;

public class Work extends Man implements speakable {

	public Work() {
		// TODO Auto-generated constructor stub
	}
	
	public Work(String name) {
		super(name);
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + "아 주 7일 일해야 집을 산다.");

	}

}
