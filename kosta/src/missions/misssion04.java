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
		
		
		//id,pass 입력을 받아서
		// id, pass가 일치하면 로그인 성공
		// id불일치 시  - > 해당 아이디가 존재하지 않습니다.
		// pw 불일치 시  -> 비밀번호가 일치하지 않습니다.
				
		//System.out.print("아이디 입력 :");
		bw.write("아이디 입력 : ");
		bw.flush();
		//String id =sc.nextLine();
		String id = br.readLine();
		
		bw.write("비밀번호 입력 : ");
		bw.flush();
		//System.out.print("비밀번호 입력 : ");
		//String pw = sc.nextLine();
		String pw  = br.readLine();
		if(m_id.equals(id) && m_pw.equals(pw)) {
			//System.out.println("로그인 성공");
			bw.write("로그인 성공");
		}
		else if (!m_id.equals(id)){
				//System.out.println("해당 아이디가 없습니다.");
				bw.write("해당 아이디가 없습니다.");
			}
		else {
			//System.out.println("비밀번호가 일치하지 않습니다.");
			bw.write("비밀번호가 일치하지 않습니다.");
		}
		bw.flush();	
			
	}
}


