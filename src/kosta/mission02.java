package kosta;

import java.util.Scanner;

public class mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int kor ;
     int eng ;
     int mat ;
     int total ;
     double aver;
     
 
     //90점 이상 이면 A 80잇ㅇ이면 B, 
     
     Scanner sc = new Scanner(System.in);
     System.out.print("국어 점수를 입력하세요. : ");
     kor = sc.nextInt();
     
     System.out.print("영어 점수를 입력하세요. : ");
     eng = sc.nextInt();
     
     System.out.print("수학 점수를 입력하세요. : ");
     mat = sc.nextInt();
     
     total = kor + eng + mat;
     aver = total / 3.0;
     
     switch((int)aver/ 10) {
     case 10:
    	 System.out.println("축하합니다. 만점을 받으셨습니다.");
    	 break;
     case 9 :
    	 System.out.println("A");
    	 break;
     case 8:
    	 System.out.println("B");
    	 break;
     case 7:
    	 System.out.println("C");
    	 break;
     default:
    	 System.out.println("F");
     }
     

	}
}
