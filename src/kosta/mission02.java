package kosta;

import java.util.Scanner;

public class mission02 {
	public static int getTotal(int score, int score2, int score3) {
		return score + score2 + score3;
	}
	public static double getAverage(int score, int mount) {
		return (double) score/mount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int kor ;
     int eng ;
     int mat ;
     int total ;
     double aver;
     
     
     //������ ����� ���ϴ� �޼ҵ带 ���� �����غ���!
 
     //90�� �̻� �̸� A 80�դ��̸� B, 
     
     Scanner sc = new Scanner(System.in);
     System.out.print("���� ������ �Է��ϼ���. : ");
     kor = sc.nextInt();
     
     System.out.print("���� ������ �Է��ϼ���. : ");
     eng = sc.nextInt();
     
     System.out.print("���� ������ �Է��ϼ���. : ");
     mat = sc.nextInt();
     
     
     ;
     //aver = getAverage(getTotal(kor, eng, mat), 3);
     
     System.out.println("���� : " + getTotal(kor, eng, mat));
     System.out.println("��� : "+ getAverage(getTotal(kor, eng, mat), 3));
     
     switch((int)getAverage(getTotal(kor, eng, mat), 3)/ 10) {
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
