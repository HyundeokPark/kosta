package kosta_video;

public class generalMember {
	//아이디, 이름, 주소, 빌린비디오 정보
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
		System.out.println("회원의 아이디 : "  + this.getID());
		System.out.println("회원의 이름 : "  + this.getName());
		System.out.println("회원의 주소 : "  + this.getAddr());
		System.out.println("회원이 대여한 비디오 번호 : "  + this.getV().getVnum());
		System.out.println("회원의 대여한 비디오 제목 : "  + this.getV().getTitle());
		System.out.println("회원의 대여한 비디오 주인공  : "  + this.getV().getActor());
	}
	
	public String showS() {
		return "회원의 아이디 : "  + this.getID() +"\n"+ "회원의 이름 : "  + this.getName() +"\n"+ "회원이 대여한 비디오 번호 : "  + this.getV().getVnum() 
			 	+ "\n"+ "회원의 대여한 비디오 제목 : "  + this.getV().getTitle()  + "\n"+"회원의 대여한 비디오 주인공  : "  + this.getV().getActor();
	}
	
}
