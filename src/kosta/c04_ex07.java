package kosta;

import java.util.Scanner;

public class c04_ex07 {

	public static void main(String[] args) {
		boolean run =true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.����  | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.printf("���� : ");		
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
			System.out.printf("���ݾ� :");
			balance = sc.nextInt();
			break;
			
			case 2:
			System.out.printf("��ݾ� : ");
			balance = balance - sc.nextInt(); 
			break;
			
			case 3:
			System.out.printf("�ܰ� : " + balance);			
			break;
			
			case 4:
			System.out.println("���α׷� ����");
			run = false;
			break;	
			}
			
		}
		//System.out.println("while�� ���������� �����");
	}

}
