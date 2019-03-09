package Practice_Exam;

public class c04_ex04 {

	public static void main(String[] args) {
		int x,y,sum;
		do 
		{
			x = (int)(Math.random()*6)+1;
			System.out.println(x);
			y = (int)(Math.random()*6)+1;
			System.out.println(y);
			sum =x+y;
			System.out.println(sum);
		}while(sum !=5);
		
        System.out.println( x+" , "+y );
	}

}
