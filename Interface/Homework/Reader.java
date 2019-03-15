package kosta.Interface.Homework;

public class Reader extends Man implements speakable {

	public Reader() {
		// TODO Auto-generated constructor stub
	}
	
	public Reader(String name) {
		super(name);
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + "아 주 7일 자바 화이팅");
		
	}

}
