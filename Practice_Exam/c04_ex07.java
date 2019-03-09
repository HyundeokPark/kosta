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
			bw.write("1.예금  | 2.출금 | 3.잔고 | 4.종료\n");
			bw.write("--------------------------\n");
			bw.write("선택 : ");	
			bw.flush();
			/*System.out.println("--------------------------");
			System.out.println("1.예금  | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.printf("선택 : ");*/	
			//int select = sc.nextInt();
			try {
				select = Integer.parseInt(br.readLine());	
			}
			catch(Exception e){
				bw.write("숫자를 입력해주세요.\n");
			}
			
			switch(select) {
			case 1:
			//System.out.printf("예금액 :");
			bw.write("예금액 : ");
			bw.flush();
			balance = balance + Integer.parseInt(br.readLine());
			break;
			
			case 2:
			//System.out.printf("출금액 : ");
			bw.write("출금액 : ");
			bw.flush();
			if(balance - Integer.parseInt(br.readLine()) < 0) {
				bw.write("잔고가 부족합니다.\n");
				bw.flush();
			}
			else {
				balance = balance - Integer.parseInt(br.readLine());
			}
			break;
			
			case 3:
			//System.out.printf("잔고 : " + balance);			
			bw.write("잔고 : " + Integer.toString(balance) + "\n");
			bw.flush();
			break;
			
			case 4:
			//System.out.println("프로그램 종료");
			bw.write("프로그램 종료");
			bw.flush();
			run = false;
			break;	
			
			default :
				bw.write("메뉴를 보고 선택 하세요.\n");
				bw.flush();
				break;
			}
			
		}
		//System.out.println("while문 빠져나오고 종료됨");
	}

}
