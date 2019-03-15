package kosta_video;

public class sMember extends generalMember {
	private int point;
	
	public sMember() {
		
	}
	public sMember(String iD, String name, String addr, video v) {
		super(iD, name, addr,  v);
		this.countPoint();
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void show() {
		super.show();
		System.out.println("회원의 마일리지  : "  + this.getPoint());
	}
	
	public void countPoint() {
		this.point++;
	}
}
