package Practice_Exam;

public class c04_ex03 {

	public static void main(String[] args) {
	int sum =0;
		for(int i=1; i<101; i++) {
		if(i%3!=0) {
			continue;
		}
		//System.out.println("i : " + i);
		//System.out.println("sum : " + sum);
		sum += i;	
		}
	System.out.println(sum);
	}

}
