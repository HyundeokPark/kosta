package Homework;

import java.util.Scanner;

public class For_Homework_2 {
	
	public static void entry() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 1;
		System.out.print("number= ");
		num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			for(int j=0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 2-1 �ϼ�
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=0; i < num; i++) {
//			for(int j=0; j < num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		 
		
		// 2-2  �ϼ�
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i <= num; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		// 2 - 3 �ϼ�
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=num; i > 0; i--) {
//			for(int j=0; j<i-1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i-1; j <num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 2-4 �ϼ�
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<num; i++) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//2-5  �ϼ�
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
//		for(int i=num-1; i>0; i--) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}	
//			System.out.println();
//		}
		
		//2-6  19.03.11 �ϼ�
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			//System.out.println();
//			
//			//�ι�° �ﰢ���� �׷����ھƾƾ�
//			for(int j=0; j <2*(num-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
//		for(int i=num-1; i>0; i--) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}	
//		
//			
//			//�Ʒ� �� �ι�° �ﰢ���� �׷����ھƾƾ�
//			for(int j=0; j <2*(num-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}	
//			System.out.println();
//		}
		
		
		
		//2-7   19.03.11 �ϼ� 
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			for(int j=0; j <num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			//System.out.println();
//			
//			//�ι�° �ﰢ���� �׷����ھƾƾ�
//			for(int j=0; j <2*(num-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			//System.out.println();
//			
//			//����° �ﰢ���� �׷����ھƾƾ�
//			for(int j=0; j <2*(num-i); j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			//System.out.println();
//			
//			//�׹�° �ﰢ���� �׷����ھƾƾ�
//			for(int j=0; j <2*(num-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j < 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//2-8

	
		//2-9 �ϼ�
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int count = 1;
//		System.out.print("number= ");
//		num = sc.nextInt();
//		
//		for(int i=0; i < num+2; i++) {
//			for(int j=0; j < num+2; j++) {
//				if(i==0 || i==num+1 || j==0 || j==num+1) {
//					System.out.print("$");
//				}
//	
//				else {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
		
	}
}


