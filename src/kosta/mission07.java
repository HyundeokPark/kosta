package kosta;

import java.util.Scanner;

public class mission07 {
			static int count = 0;
			
			//���ڿ� �߰�
			public static void add(String[] arr,Scanner sc) {
				System.out.printf("�߰��Ͻ� ������ �Է��� �ּ���.");
				String str = sc.nextLine();
				if(count <arr.length) {
					arr[count++] =str;
				}
				else {
					System.out.println("�뷮�ʰ� �Դϴ�. ������ ������ �ּ���.");
				}
			}
			
			//�迭 ��� ���
			public static void print(String[] arr) {
				for(int i=0; i <count; i++){
					System.out.println(arr[i]);
				}
			}
			
			//�迭 �˻�
			public static void search(String[] arr,Scanner sc) {
				boolean check = false;
				String str = sc.nextLine();
				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						System.out.println(str + "�� "+i+"��° ��ġ�� �ֽ��ϴ�.");
						check = true;
						break;
					}
					else {
						continue;
					}
				}
				if(check == false) {
					System.out.println("�ش� ������ �����ϴ�.");
				}
			}
			
			//�迭 ����
			public static void update(String[] arr,Scanner sc) {
				boolean check = false;
				//Scanner sc = new Scanner(System.in);
				System.out.print("�ٲ� ������ �Է��� �ּ��� :");
				String str = sc.nextLine();
				System.out.print("���� �ٲٽ� ������ �Է��� �ּ���.");
				String str2 = sc.nextLine();
				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						arr[i] = str2;
						System.out.println("�����Ǿ����ϴ�.");
						check = true;
						break;
					}
					else {
						continue;	
					}
				}
				if(check == false) {
					System.out.println("�ٲ� ������ �����ϴ�.");
				}			
			}
			
			//�迭 ����
			public static void delete(String[] arr,Scanner sc) {
				boolean check = false;
				int j =0;
				System.out.print("������ ���� �Է� : ");
				String str = sc.nextLine();
				for(int i=0; i< count; i++) {
					if(arr[i].equals(str)) {
						check = true;
						System.out.println("�����Ǿ����ϴ�.");
						j = i;
						break;
					}
					else {
						continue;
					}
				}
				if(check == false) {
					System.out.println("�ش� ������ �����ϴ�.");	
				}
				for(int i=j; i<count; i++) {
					if(i < count-1) {
						arr[i] = arr[i+1];
					}
				}
				count--;
			}
			
			//����
			public static void exit() {
				System.exit(0);
			}
			
			
			
	public static void main(String[] args) {
		//������ ������ �ְ�, ������ �Ҽ��ְ�, �߰��� �Ҽ��ְ�, �׸��� ������ �Ҽ� ����!
		String[] arr = new String[3];
		for(String s : arr) {
			s = "";
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�߰�  2.���  3.�˻�  4.����  5.����  6.����");
			System.out.print("����: ");
			
			String menu =sc.nextLine();
			
			switch(menu) {
			case "1":
				add(arr,sc);
				break;
			case "2":
				print(arr);
				break;
			case "3":
				search(arr,sc);
				break;
			case "4" :
				update(arr,sc);
				break;
			case "5" :
				delete(arr,sc);
				break;	
			case "6" :
				exit();
				break;
			}
		}
	}

}
