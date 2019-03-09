package Homework;

import java.util.Scanner;

public class For_Homework_1 {
	public static void entry() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 1;
		System.out.print("number= ");
		num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			for(int j=0; j < num; j++) {
				if(count <10) {
					System.out.print(" "+count+" ");
					count=count+2;
				}
				else {
					System.out.print(count+" ");
					count=count+2;
				}	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-1 완성
		//entry();
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=0; i < num; i++) {
//			for(int j=0; j < num; j++) {
//				if(count <10) {
//					System.out.print(" "+count+"\t");
//					count++;
//				}
//				else {
//					System.out.print(count+"\t");
//					count++;
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//1-2 완성 19.03.09
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		count = num * num;
//		for(int i=num; i >0; i--) {
//			for(int j=num-1; j >= 0; j--) {
//				if(num*i - j<10) {
//					System.out.print(" " + (num*i - j)+ " ");
//				}
//				else {
//					System.out.print(num*i - j + " ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//1-3 완성
//		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=0; i < num; i++) {
//			for(int j=0; j < num; j++) {
//				if(count <10) {
//					System.out.print(" "+count+"\t");
//					count=count+2;
//				}
//				else {
//					System.out.print(count+"\t");
//					count=count+2;
//				}	
//			}
//			System.out.println();
//		}
		
		//1-4 완성
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i <= num; i++) {
//			for(int j=0; j <i; j++) {
//				if(j <10) {
//					System.out.print(" "+(j+1)+" ");
//				}
//				else {
//					System.out.print((j+1)+"\t");
//				}	
//			}
//			System.out.println();
//		}
		
		//1-5
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count =1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		for(int i=1; i <= num; i++) {
//			for(int j=0; j < i; j++) {
//				if(count <10) {
//					System.out.print(" "+count+" ");
//					count++;
//				}
//				else {
//					System.out.print(count+" ");
//					count++;
//				}	
//			}
//			System.out.println();
//		}
		
		
		//1-6 완료
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=num; i > 0; i--) {
//			for(int j=0; j < i; j++) {
//				if(count <10) {
//					System.out.print(" "+(j+1)+" ");
//					
//				}
//				else {
//					System.out.print((j+1)+" ");
//					
//				}	
//			}
//			System.out.println();
//		}
		
		
		//1-7 완성
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=num; i > 0; i--) {
//			for(int j=0; j < i; j++) {
//				if(count <10) {
//					System.out.print(" "+count+" ");
//					count++;
//				}
//				else {
//					System.out.print(count+" ");
//					count++;
//				}	
//			}
//			System.out.println();
//		}
		
	
		// 1 - 8 완성
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i <=num; i++) {
//			for(int j=i; j < num+i; j++) {
//				if(j <10) {
//					System.out.print(" "+j+" ");
//				}
//				else {
//					System.out.print(j+" ");
//				}	
//			}
//			System.out.println();
//		}
		
//		//1-9 완성 19.03.09
//		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=0; i < num; i++) {
//			for(int j=i+1; j <= num+i; j++) {				 
//				if(j <= 5) {
//					System.out.print((j)+" ");
//				}
//				else {
//					System.out.print((j-5)+" ");
//				}
//			}
//			System.out.println();
//		}
//		
		
		//1-10 완성
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i <= num; i++) {
//			for(int j=0; j < num-i; j++) {
//				System.out.print("   ");
//			}
//			
//			for(int j=num-i; j<num; j++) {
//				if(count <10) {
//					System.out.print(" "+count+" ");
//					count++;
//				}
//				else {
//					System.out.print(count+" ");
//					count++;
//				}
//			}
//			System.out.println();
//		}
//		
		
	}



}
