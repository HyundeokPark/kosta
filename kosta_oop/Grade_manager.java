package kosta_oop;

public class Grade_manager {
	Grade[] grade; 
	public Grade_manager () {
		
	}
	public void generateGrade(String[] name, String[] subject, int[] scores) {
		for(int i=0; i<name.length; i++) {
			grade[i] = new Grade();
			
		}
	}
}
