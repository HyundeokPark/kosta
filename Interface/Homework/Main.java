package kosta.Interface.Homework;

public class Main {

	public static void main(String[] args) {
		speakable s ;
		Object obj[] = {new Reader("둘리"), new Work("길동"), 
                new Student("마이콜")};
		
		
		// TODO Auto-generated method stub
		
		for(int i=0; i<3; i++) {
			if(obj[i] instanceof speakable) {
				 s = (speakable) obj[i];
				s.speak();
			}
			else if (obj[i] instanceof speakable) {
				s = (speakable) obj[i];
				s.speak();
			}
			else
				continue;
		}

	}

}
