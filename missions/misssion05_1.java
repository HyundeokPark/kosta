package missions;

import java.util.Scanner;
import java.io.*;

public class misssion05_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
 //정수 b에서 a를 뺀 값을 구합니다.
		// 조건은 a보다 반드시 b가 커야합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int a, b, result;
		
		do { //do while문을 이용한 방법
		//System.out.printf("do while 첫번째 정수를 입력하세요 : ");
		//a = sc.nextInt();
		bw.write("do while 첫번째 정수를 입력하세요 : ");
		bw.flush();
		a =Integer.parseInt(br.readLine());
		//System.out.printf("do while 두번째 정수를 입력하세요 : ");
		//b = sc.nextInt();
		bw.write("do while 두번째 정수를 입력하세요 : ");
		bw.flush();
		b =Integer.parseInt(br.readLine());
		}while(b>a);
		
		result =a-b;
		//System.out.println("do while 결과  :" + result);
		bw.write("do while 결과  : " + Integer.toString(result)+"\n");
		bw.flush();
		
		boolean count = true;
		while(count) { //while(true) break 를 이용한 방법
			System.out.printf("while(true) 첫번째 정수를 입력하세요 : ");
			a = sc.nextInt();
			
			System.out.printf("while(true) 두번째 정수를 입력하세요 : ");
			b = sc.nextInt();
			if(a-b>0) {
				count = false;	
			}
			
		}
		result =a-b;
		System.out.println("while(true) 결과  :" + result);
	}

}
