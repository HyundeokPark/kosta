package missions;

import java.util.Scanner;
import java.io.*;

public class misssion05_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
 //���� b���� a�� �� ���� ���մϴ�.
		// ������ a���� �ݵ�� b�� Ŀ���մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int a, b, result;
		
		do { //do while���� �̿��� ���
		//System.out.printf("do while ù��° ������ �Է��ϼ��� : ");
		//a = sc.nextInt();
		bw.write("do while ù��° ������ �Է��ϼ��� : ");
		bw.flush();
		a =Integer.parseInt(br.readLine());
		//System.out.printf("do while �ι�° ������ �Է��ϼ��� : ");
		//b = sc.nextInt();
		bw.write("do while �ι�° ������ �Է��ϼ��� : ");
		bw.flush();
		b =Integer.parseInt(br.readLine());
		}while(b>a);
		
		result =a-b;
		//System.out.println("do while ���  :" + result);
		bw.write("do while ���  : " + Integer.toString(result)+"\n");
		bw.flush();
		
		boolean count = true;
		while(count) { //while(true) break �� �̿��� ���
			System.out.printf("while(true) ù��° ������ �Է��ϼ��� : ");
			a = sc.nextInt();
			
			System.out.printf("while(true) �ι�° ������ �Է��ϼ��� : ");
			b = sc.nextInt();
			if(a-b>0) {
				count = false;	
			}
			
		}
		result =a-b;
		System.out.println("while(true) ���  :" + result);
	}

}
