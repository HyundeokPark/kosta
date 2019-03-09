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
			//System.out.println("엔터를 누르세요.");
			c[i].setOwner(sc.nextLine());
			System.out.print("학생 이름 : ");
			c[i].setOwner(sc.nextLine());
			System.out.println("학생 이름  : " + c[i].getOwner());
			
			System.out.print("국어 점수 : ");
			c[i].setKor(sc.nextInt());
			System.out.println("국어점수 : " + c[i].getKor());
			
			System.out.print("영어 점수 : ");
			c[i].setEng(sc.nextInt());
			System.out.println("영어점수 : " + c[i].getEng());
			
			System.out.print("수학 점수 : ");
			c[i].setMath(sc.nextInt());
			System.out.println("수학점수 : " + c[i].getMath());		
			
		}
			
		for(int i=0; i<2; i++) {
			c[i].sorted_score();
			System.out.println();
			System.out.println("총점 : " + c[i].getTotal());
			System.out.println("평균 : " + c[i].getAver());
			System.out.println();
		}
		
	
	}

}
