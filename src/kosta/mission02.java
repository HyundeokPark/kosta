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
     
 
     //90�� �̻� �̸� A 80�դ��̸� B, 
     
     Scanner sc = new Scanner(System.in);
     System.out.print("���� ������ �Է��ϼ���. : ");
     kor = sc.nextInt();
     
     System.out.print("���� ������ �Է��ϼ���. : ");
     eng = sc.nextInt();
     
     System.out.print("���� ������ �Է��ϼ���. : ");
     mat = sc.nextInt();
     
     total = kor + eng + mat;
     aver = total / 3.0;
     
     switch((int)aver/ 10) {
     case 10:
    	 System.out.println("�����մϴ�. ������ �����̽��ϴ�.");
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
