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
			bw.write("A등급입니다.");
			break;
		case 90 :
			bw.write("B등급입니다.");
			break;
		case 80 :
			bw.write( "C등급입니다.");
			break;
		default :
			bw.write("기본 점수 입니다.");
		}
		/*
		if(num1 > num2 && num1 > num3) {
			 bw.write("num1 이 제일 큽니다.\n");
		 }
		 
		 if(score >=90) {
			 bw.write("점수가 90보다 큽니다.\n");
			 bw.write("A등급입니당");
		 }
		 else {
			 bw.write("점수가 90보다 낮고, b등급이빈다.");
		 }*/
		bw.flush();
	}

}
