package kosta.DAO;

public class Service {
	DAO d;
	public Service() {
		
	}
	
	public Service(DAO d) {
		this.d = d;
	}
	public void insertService() {
		this.d.insert();
	}
}
