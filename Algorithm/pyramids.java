package Algorithm;

import java.util.Scanner;

public class pyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ƕ�̵� ������ �Է��ϼ��� :");
		floor = sc.nextInt();
		
		for(int i=1; i<=floor; i++) {
			for(int j=1; j<=floor; j++) {
				if(j <=floor-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			
			for(int j=floor+1; j<=2*floor-1;  j++ ) {
				if(j <floor+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
