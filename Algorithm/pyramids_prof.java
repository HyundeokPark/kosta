package Algorithm;

import java.util.Scanner;

public class pyramids_prof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int n;
		System.out.println("피라미드 모양으로 나타냅니다");

		do {
			System.out.print("단수 는 :");
			n = sc.nextInt();
		}while(n <=0);
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
