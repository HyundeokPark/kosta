package kosta.oop2;

public class person {
	private String name;
	//private Role r;
	private Role2 r;
	
	public person() {
		
	}
	
	public person (String name, Role2 r) {
		this.name = name;
		this.r = r;
	}
	
	public void work() {
		this.r.doit();
	}
	
}
