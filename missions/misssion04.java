package missions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class misssion04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		String m_id = "kosta";
		String m_pw = "1234";
		
		
		//id,pass �Է��� �޾Ƽ�
		// id, pass�� ��ġ�ϸ� �α��� ����
		// id����ġ ��  - > �ش� ���̵� �������� �ʽ��ϴ�.
		// pw ����ġ ��  -> ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
				
		//System.out.print("���̵� �Է� :");
		bw.write("���̵� �Է� : ");
		bw.flush();
		//String id =sc.nextLine();
		String id = br.readLine();
		
		bw.write("��й�ȣ �Է� : ");
		bw.flush();
		//System.out.print("��й�ȣ �Է� : ");
		//String pw = sc.nextLine();
		String pw  = br.readLine();
		if(m_id.equals(id) && m_pw.equals(pw)) {
			//System.out.println("�α��� ����");
			bw.write("�α��� ����");
		}
		else if (!m_id.equals(id)){
				//System.out.println("�ش� ���̵� �����ϴ�.");
				bw.write("�ش� ���̵� �����ϴ�.");
			}
		else {
			//System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			bw.write("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		bw.flush();	
			
	}
}


