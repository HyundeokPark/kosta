package kosta_phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Phone_manager {
	//�迭�� ����� ����!... ��ü�� phone info ��ü �迭�� ���������!
	//��ȭ��ȣ �߰�!
	//��ȭ��ȣ ��ü ���?... �̰� �������� ���� �۳�?..
	//�迭�ȿ� �־��!!	
	//��ü��¸޼ҵ忡��  ������ ������� �׷츸 ����ϴ� �޼ҵ�!! 
	Phone_info[] p;
	int count = 0;
	
	//����Ʈ ������
	public Phone_manager() {
		this.p = new Phone_info[10];
	}
	
	
	// ������
	public Phone_manager(int amount) {
		this.p = new Phone_info[amount];
	}
	
	
	// �⺻ �޴�, ����ڷκ��� �� ��� �޴� �Լ� 
	public void frontDesk() throws Exception{
		String name, number, birth,major = "";
		int stCode, salary =0;
		Phone_info tmp;
		int select=0;

		while(true) {
			System.out.println("1.�߰�  2.���  3.�˻�  4.����  5.����  6.����");
			select = DataInput.sc.nextInt();
			switch(select) {
			
			case 1:
				System.out.println("1.ȸ��  2.���б�  3.��Ÿ");
				select = DataInput.sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("�̸��� �Է��ϼ��� : ");
					name = DataInput.br.readLine();
					
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					number = DataInput.br.readLine();
					
					System.out.print("������ �Է��ϼ��� : ");
					birth = DataInput.br.readLine();
					
					System.out.println("������ �Է��ϼ��� :");
					salary =Integer.parseInt(DataInput.br.readLine());
					
					tmp = new CoworkerPhone_info(name, number, birth,salary);
					this.addPhoneInfo(tmp);
					break;
					
				case 2:
					System.out.print("�̸��� �Է��ϼ��� : ");
					name = DataInput.br.readLine();
					
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					number = DataInput.br.readLine();
					
					System.out.print("������ �Է��ϼ��� : ");
					birth = DataInput.br.readLine();
					
					System.out.println("�а��� �Է��ϼ��� :");
					major =DataInput.br.readLine();
					
					System.out.println("�й��� �Է��ϼ���");
					stCode = Integer.parseInt(DataInput.br.readLine());
					
					tmp = new UniversityPhone_Info(name, number, birth, major, stCode);
					this.addPhoneInfo(tmp);
					break;
					
				case 3:
					System.out.print("�̸��� �Է��ϼ��� : ");
					name = DataInput.br.readLine();
					
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					number = DataInput.br.readLine();
					
					System.out.print("������ �Է��ϼ��� : ");
					birth = DataInput.br.readLine();
					
					tmp = new Phone_info(name, number, birth);
					this.addPhoneInfo(tmp);
					break;
				}
				break;
			case 2:
				System.out.println("1.ȸ��  2.���б�  3.��ü");
				select = DataInput.sc.nextInt();
				this.listPhoneInfo(select);
				
				break;
			case 3:
				System.out.print("�˻��� ��ȣ�� �Է��ϼ��� : ");
				number = DataInput.br.readLine();
		
				this.searchPhoneInfo(number);
				break;
			case 4:
				System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
				number = DataInput.br.readLine();
				
//				System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
//				newNumber = br.readLine();
				
				this.updatePhoneInfo(number);
				break;	
			case 5:
				System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
				number = DataInput.br.readLine();
				
				this.deletePhoneInfo(number);
			    break;
			case 6:
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				System.exit(0);
				break;
			}
		}
	}
	
	public int search(String number) {
		for(int i=0; i <count; i++) {
			if(number.equals(p[i].number)) {
				//System.out.println("index :" + i);
				return i;
			}
		}
		System.out.println("�ش��ȣ�� �����ϴ�.");
		return -1;		
	}
	
	public void searchPhoneInfo(String number) {
		int index = this.search(number);
		if(index != -1) {
			System.out.println((index+1) + "��° ����Ǿ� �ֽ��ϴ�.");
			this.p[index].show();
			}
	}
	
	public void addPhoneInfo(Phone_info tmp) {
		if(count > p.length-1) {
			System.out.println("�뷮�� ���� á���ϴ�.");
			//System.out.println("count :" + count);
		}
		else {
				p[count++]= tmp;
				//count++;
				System.out.println(p.length-count +"�� �� �߰� �� ���ֽ��ϴ�.");
				//System.out.println("count :" + count);
			}		
		}
	
	
	public void deletePhoneInfo(String number) {
		int index = this.search(number);
		if(index != -1) {
			//System.out.println("���� else ������");
			for(int i = index; i< this.count-1; i++) {
				//System.out.println("���� ���� ����");
				this.p[i] = this.p[i+1];
				//System.out.println("ū �� ������ ����");
			}
			this.count--;
			//System.out.println("count :" + this.count);
		}
	}
	
	public void updatePhoneInfo(String number) throws IOException {
		int index = this.search(number);
		String newMajor, newNumber;
		
		int newSalary, newStCode;
		if(index != -1) {
			if(this.p[index] instanceof UniversityPhone_Info) {
 				UniversityPhone_Info u=(UniversityPhone_Info)this.p[index];
 				
 				System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
 				newNumber = DataInput.br.readLine();
 				u.number = newNumber;
 				
 				System.out.print("�� ������ �Է��ϼ��� : ");
 				newMajor = DataInput.br.readLine();
 				u.setMajor(newMajor);
 
 				
			}
 			else if(this.p[index] instanceof CoworkerPhone_info) {
 				
 				CoworkerPhone_info c=(CoworkerPhone_info)this.p[index];
 				System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
 				newNumber = DataInput.br.readLine();
 				c.number = newNumber;
 				
 				System.out.print("�� ������ �Է��ϼ��� : ");
 				newSalary = Integer.parseInt(DataInput.br.readLine());
 				c.setSalary(newSalary);
 			}
 			else {
 				//System.out.println("���� else ������");
 				//String newNumber;
 				System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
 				newNumber = DataInput.br.readLine();
 				this.p[index].number = newNumber;
				//System.out.println("���� ����");
				//System.out.println("count :" + this.count);
 			}
			
		}
	}
	
	public void listPhoneInfo(int group) {
		if(count ==0) {
			System.out.println("����� ����ó�� �����ϴ�.");
		}
		else {
			switch (group) {
			case 1:
				for(int i=0; i<count; i++) {
					if(this.p[i] instanceof CoworkerPhone_info) {
						this.p[i].show();
						//System.out.println("count :" + count);
						System.out.println();
					}
					}
				break;
			case 2:
				for(int i=0; i<count; i++) {
					if(this.p[i] instanceof UniversityPhone_Info) {
						this.p[i].show();
						//System.out.println("count :" + count);
						System.out.println();
					}
					}
				break;
			case 3:
				for(int i=0; i<count; i++) {
					this.p[i].show();
					//System.out.println("count :" + count);
					System.out.println();
				}
				break;
		}
		}
		
	}
}
