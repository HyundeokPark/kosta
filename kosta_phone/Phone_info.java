package kosta_phone;

public class Phone_info {
	//이름 번호 생일 : string
	//기능 (show 이름으로 이름, 전번, 생일을 출력하는 메소드)
	String name ;
	String number;
	String birth;
	public Phone_info() {
		
	}
	
	public Phone_info(String name, String number, String birth) {
		super();
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	
	public void show() {
		System.out.println("이     름  : " + this.name );
		System.out.println("전화번호 : " + this.number );
		System.out.println("생년월일 : " + this.birth );
	}
	

}
