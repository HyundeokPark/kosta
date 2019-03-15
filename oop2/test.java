package kosta.oop2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		Worker w = new Worker();
		
		Driver2 d2 = new Driver2();
		Worker2 w2 = new Worker2();
		
		Role2 r2 = new Driver2();
		
		
		
		person p =new person("¹Ú" , d2);
		person p1 = new person("Çö", w2);
		person p2 =new  person("´ö", r2);
//		person p =new person("¹Ú" , d);
//		person p1 = new person("Çö", w);
		
		p.work();
		p1.work();
		p2.work();
		
	}

}
