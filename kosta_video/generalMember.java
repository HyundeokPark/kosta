package kosta_video;

public class generalMember {
	//���̵�, �̸�, �ּ�, �������� ����
	private String ID;
	private String name;
	private String addr;
	private video v;
	private video[] vs;
	public generalMember() {
		
	}
	
	public generalMember(String iD, String name, String addr, video v) {
		super();
		ID = iD;
		this.name = name;
		this.addr = addr;
		this.v = v;
	}

	public String getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public String getAddr() {
		return this.addr;
	}

	public video getV() {
		return this.v;
	}
	
	public void show() {
		System.out.println("ȸ���� ���̵� : "  + this.getID());
		System.out.println("ȸ���� �̸� : "  + this.getName());
		System.out.println("ȸ���� �ּ� : "  + this.getAddr());
		System.out.println("ȸ���� �뿩�� ���� ��ȣ : "  + this.getV().getVnum());
		System.out.println("ȸ���� �뿩�� ���� ���� : "  + this.getV().getTitle());
		System.out.println("ȸ���� �뿩�� ���� ���ΰ�  : "  + this.getV().getActor());
	}
	
	public String showS() {
		return "ȸ���� ���̵� : "  + this.getID() +"\n"+ "ȸ���� �̸� : "  + this.getName() +"\n"+ "ȸ���� �뿩�� ���� ��ȣ : "  + this.getV().getVnum() 
			 	+ "\n"+ "ȸ���� �뿩�� ���� ���� : "  + this.getV().getTitle()  + "\n"+"ȸ���� �뿩�� ���� ���ΰ�  : "  + this.getV().getActor();
	}
	
}
