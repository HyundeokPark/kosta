package kosta_oop;

import java.io.FileInputStream;
import java.util.Scanner;

public class Grade_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade[] c = new Grade[3];
		for(int i=0; i<3; i++) {
			c[i] = new Grade();
		}
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0; i<2; i++) {
			//System.out.println("���͸� ��������.");
			c[i].setOwner(sc.nextLine());
			System.out.print("�л� �̸� : ");
			c[i].setOwner(sc.nextLine());
			System.out.println("�л� �̸�  : " + c[i].getOwner());
			
			System.out.print("���� ���� : ");
			c[i].setKor(sc.nextInt());
			System.out.println("�������� : " + c[i].getKor());
			
			System.out.print("���� ���� : ");
			c[i].setEng(sc.nextInt());
			System.out.println("�������� : " + c[i].getEng());
			
			System.out.print("���� ���� : ");
			c[i].setMath(sc.nextInt());
			System.out.println("�������� : " + c[i].getMath());		
			
		}
			
		for(int i=0; i<2; i++) {
			c[i].sorted_score();
			System.out.println();
			System.out.println("���� : " + c[i].getTotal());
			System.out.println("��� : " + c[i].getAver());
			System.out.println();
		}
		
	
	}

}
