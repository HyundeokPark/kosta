package Homework;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		//int count = 1;
		System.out.print("number= ");
		num = sc.nextInt();
		
		for(int i=0; i < num; i++) {
			System.out.print("���� ���� ");
			for(int j=0; j < num; j++) {	
				System.out.print("��ø���� ���� ");
				if(j > 5) {
					System.out.print("if�� ���� ");
					j =1;
					System.out.print(j+" ");
				}
				else {
					System.out.print("else �� ����");
					j = i+1;
					System.out.print(j+" ");
					
				}
			}
			System.out.println();
			
		}
		System.out.print("���� ���� ");

	}

}
