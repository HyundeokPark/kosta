package kosta;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//while : �ʱ�� -> ���ǽ�  -> ��ɹ� -> ������ :��������
		/*int i =1;
		int sum = 0;
		while(i <= 10) {
			System.out.println("I�� ���� : " +i);
			sum  = sum + i++;
			System.out.println("sum�� ���� : " + sum);
		}
		
		//������ ��-7�� ���
		int j = 1;
		while( j < 10) {
			System.out.println("7 * " + j + " = " + 7*j);
			j++;
		}
		
		// do while ���� ��� �ѹ��� �����ϰ� �ҷ���...
		// Ű����� ���� ������ �Է� �޾� ���� ������
		//������ �Է� �ϸ� ���Ӱ� �ٽ� �Է��� ���� ������
		
		System.out.println("���� ���� �� ���ϱ�");
		int n;
		do {
			System.out.print("���� ���� �Է� : ");
			n = sc.nextInt();
		}while(n <= 0); 
           int sum = 0;
           int i = 1;
           while( i <=n) {
        	   sum += i;
        	   i++;
           }
         System.out.println(n +"������ �� : " + sum);
	}
*/
	
	//do while �� �̿��� ���� �Ѥ� �ڸ� ���ڸ� �Է¹޾� ����ϼ���.
	int n = 0 ;
	do{
		System.out.println("2°�ڸ� ������ �Է� �Ͻÿ�. : ");
		n = sc.nextInt();
	}while(10>n || n> 99);
	  System.out.println("�Է��Ͻ� ������ :"+n);
	}
		
}
