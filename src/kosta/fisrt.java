package kosta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fisrt {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int score = 95;
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
	
		
		switch(score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			bw.write("A����Դϴ�.");
			break;
		case 90 :
			bw.write("B����Դϴ�.");
			break;
		case 80 :
			bw.write( "C����Դϴ�.");
			break;
		default :
			bw.write("�⺻ ���� �Դϴ�.");
		}
		/*
		if(num1 > num2 && num1 > num3) {
			 bw.write("num1 �� ���� Ů�ϴ�.\n");
		 }
		 
		 if(score >=90) {
			 bw.write("������ 90���� Ů�ϴ�.\n");
			 bw.write("A����Դϴ�");
		 }
		 else {
			 bw.write("������ 90���� ����, b����̺��.");
		 }*/
		bw.flush();
	}

}
