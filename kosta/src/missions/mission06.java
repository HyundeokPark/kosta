package missions;

import java.util.Scanner;

public class mission06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����, ����, ����, ����, ��� => �迭�� ó��
		Scanner sc = new Scanner(System.in);
		String[] str = {"����" , "����" , "����" , "����" , "���"};
		int[] arr = new int[5];
		
		for(int i=0; i<3; i++) {
			System.out.print(str[i] +"������ �Է��ϼ��� : ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		arr[4] = arr[3] / 3;
		
		for(String s : str) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int n : arr) {
			System.out.print(n+"\t");
		}
	}

}
