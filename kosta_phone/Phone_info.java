package kosta_phone;

public class Phone_info {
	//�̸� ��ȣ ���� : string
	//��� (show �̸����� �̸�, ����, ������ ����ϴ� �޼ҵ�)
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
		System.out.println("��     ��  : " + this.name );
		System.out.println("��ȭ��ȣ : " + this.number );
		System.out.println("������� : " + this.birth );
	}
	

}
