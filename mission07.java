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
			
			//�迭 �˻� int return ��
			public static int search_int(String[] arr,String str) {
				boolean check = false;
				int searched =0;

				for(int i=0; i<count; i++) {
					if(arr[i].equals(str)) {
						check = true;
						searched = i;
						break;
					}
					else {
						continue;
					}
				}
				
				if(check == false) {
					searched = -1;
				}
				
				return searched;	
			}
			
			//search�� Ȱ���� update�Լ�
			public static void update_2(String[] arr,Scanner sc) {
				String fruit;
				String fruit2;
				
				System.out.print("�ٲٽ� ������ �Է��� �ּ��� :");
				fruit = sc.nextLine();
				
				System.out.print("�� ������ �Է��� �ּ��� :");
				fruit2 = sc.nextLine();
				
				if(search_int(arr, fruit) == -1) {
					System.out.println("�ش� ������ �����ϴ�.");
				}
				else {
					for(int i=0; i<count; i++) {
						if(search_int(arr, fruit) != -1) {
							arr[search_int(arr, fruit)] = fruit2;
		                    System.out.println("���� �Ǿ����ϴ�.");				
							break;
						}
						else {
							continue;	
						}
					}
				}
			}
			
		
			//search Ȱ���� delete!..
			public static void delete_2(String[] arr,Scanner sc) {
				System.out.print("������ ���� �Է� : ");
				
				String fruit_delete = sc.nextLine();
				
				if(search_int(arr,fruit_delete) == -1) {
					System.out.println("�ش� ������ �����ϴ�.");
				}
				
				else {
					System.out.println("�����Ǿ����ϴ�.");
					reduceArray(arr,search_int(arr,fruit_delete));
				}
			}
			
			//������ ��ġ�� ���Ŀ� �ִ� �迭�� ���Ҹ� ��ĭ�� ��ܿ´�. => ��µǴ� �迭�� ũ�Ⱑ �پ���! �����δ� ���������� ��������...
			public static void reduceArray(String[] arr, int deleted_index) {
				for(int i= deleted_index; i<count-1; i++) {
						arr[i] = arr[i+1];
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
		
		String fruit = "";
		
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
				System.out.print("�˻��� ������ �Է��ϼ��� : "); //�Լ��� int�� ��ȯ����
				fruit = sc.nextLine();
				if(search_int(arr,fruit) == -1) {
					System.out.println("�ش� ������ �����ϴ�.");		
				}
				
				else {
					System.out.println(search_int(arr,fruit)+ "��° ��ġ�� �ֽ��ϴ�.");
				}
				break;
				/*search(arr,sc); //�Լ����� �� ó���ϱ�
				break;*/
			case "4" :
				//update(arr,sc); //search Ȱ�� x
				update_2(arr, sc); //search_int �Լ� Ȱ��!
				break;
			case "5" :
				//delete(arr,sc);
				delete_2(arr,sc);
				break;	
			case "6" :
				exit();
				break;
			}
		}
	}

}
