package kosta;

import java.util.Scanner;

public class LoopExam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answer = "";
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i*j <10) {
					 answer = "0" + Integer.toString(i*j); 
				}
				else {
					answer = Integer.toString(i*j);
				}
				System.out.print(i+" X "+j + " = " + answer +"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<=15; i++) {
			for(int j=0; j <=15; j++) {
				sum = 4*i + 5*j;
				if(sum !=60) {
					continue;
				}
				else 
					System.out.println("("+i +","+j+")");
			}
		}
		
		System.out.println();
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		
		for(int i=1; i<6; i++) {
			for(int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		
		
		int floor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("쌓을 피라미드 층수를 입력하세요 :");
		floor = sc.nextInt();
		
		for(int i=1; i<=floor; i++) {
			for(int j=1; j<=floor; j++) {
				if(j <=floor-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			
			for(int j=floor+1; j<=2*floor-1;  j++ ) {
				if(j <floor+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
