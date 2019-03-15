package kosta.Interface.Homework;

public class Student extends Man {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name) {
		super(name);
	}

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + "아  주7일 공부나 해라 좀");
	}

}
