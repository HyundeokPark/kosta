package missions;

import java.util.Scanner;

public class mission09_prof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String subject[] = {"����" , "����" , "����" , "����", "���"};
		int arr[][] = new int[3][5];
		
			//�迭�� �ʱ�ȭ
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<3; j++) {
					System.out.println("�л�" + (i+1 +subject[i]) + "�Է�: ");
					arr[i][j] = sc.nextInt();
					arr[i][3] += arr[i][j]; 
				}
				arr[i][4] = arr[i][3]/3;
			}
			
			//����
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i][4] > arr[j][4]) {
						int tmp[];
						tmp= arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			//���
			for(String s: subject) {
				System.out.println(s+"\t");
			}
			System.out.println();
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.println(arr[i][j] + "\t");
				}
			System.out.println();
			}

	}
			
}
