package Practice_Exam;

import java.util.Scanner;
import java.io.*;
public class c04_ex07 {

	public static void main(String[] args) throws Exception {
		boolean run =true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int balance = 0	;
		int select = 0;
		//Scanner sc = new Scanner(System.in);
	
		while(run) {
			bw.write("--------------------------\n");
			bw.write("1.����  | 2.��� | 3.�ܰ� | 4.����\n");
			bw.write("--------------------------\n");
			bw.write("���� : ");	
			bw.flush();
			/*System.out.println("--------------------------");
			System.out.println("1.����  | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.printf("���� : ");*/	
			//int select = sc.nextInt();
			try {
				select = Integer.parseInt(br.readLine());	
			}
			catch(Exception e){
				bw.write("���ڸ� �Է����ּ���.\n");
			}
			
			switch(select) {
			case 1:
			//System.out.printf("���ݾ� :");
			bw.write("���ݾ� : ");
			bw.flush();
			balance = balance + Integer.parseInt(br.readLine());
			break;
			
			case 2:
			//System.out.printf("��ݾ� : ");
			bw.write("��ݾ� : ");
			bw.flush();
			if(balance - Integer.parseInt(br.readLine()) < 0) {
				bw.write("�ܰ� �����մϴ�.\n");
				bw.flush();
			}
			else {
				balance = balance - Integer.parseInt(br.readLine());
			}
			break;
			
			case 3:
			//System.out.printf("�ܰ� : " + balance);			
			bw.write("�ܰ� : " + Integer.toString(balance) + "\n");
			bw.flush();
			break;
			
			case 4:
			//System.out.println("���α׷� ����");
			bw.write("���α׷� ����");
			bw.flush();
			run = false;
			break;	
			
			default :
				bw.write("�޴��� ���� ���� �ϼ���.\n");
				bw.flush();
				break;
			}
			
		}
		//System.out.println("while�� ���������� �����");
	}

}
