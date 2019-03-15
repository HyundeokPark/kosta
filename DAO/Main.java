package kosta.DAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO d = new Oracle();
		DAO d1 = new Mysql();
		Service s = new Service(d);
		Service s1 = new Service(d1);
		
		s.insertService();
		s1.insertService();
	}

}
