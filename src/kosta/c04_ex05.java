package kosta;

public class c04_ex05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j <=10; j++) {
				sum = 4*i + 5*j;
				if(sum !=60) {
					continue;
				}
				else 
					System.out.println("("+i +","+j+")");
			}
		}
	}
}
