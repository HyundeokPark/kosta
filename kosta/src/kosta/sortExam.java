package kosta;

import java.util.Scanner;

public class sortExam {
	
	public static void sort_selcet(int[] arr) {
		int tmp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		//ù��°�� �ι�°�� ��.... ���� ����°�� ���غ���.. ����!....
		//������������ �����غ���!
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ��� �ϴ� ���� ���� :");
		num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("������ �Է��ϼ��� :");
			arr[i] = sc.nextInt();
		}
		sort_selcet(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}	
	}

}
