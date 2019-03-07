package kosta;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//while : 초기식 -> 조건식  -> 명령문 -> 증감식 :수직방향
		/*int i =1;
		int sum = 0;
		while(i <= 10) {
			System.out.println("I의 값은 : " +i);
			sum  = sum + i++;
			System.out.println("sum의 값은 : " + sum);
		}
		
		//구구단 ㅊ-7단 출력
		int j = 1;
		while( j < 10) {
			System.out.println("7 * " + j + " = " + 7*j);
			j++;
		}
		
		// do while 내가 적어도 한번은 실행하고 할려고...
		// 키보드로 부터 숫자을 입력 받아 합을 구하잠
		//음수를 입력 하면 새롭게 다시 입력을 받장 ㅎㅎㅎ
		
		System.out.println("양의 정수 합 구하기");
		int n;
		do {
			System.out.print("양의 정수 입력 : ");
			n = sc.nextInt();
		}while(n <= 0); 
           int sum = 0;
           int i = 1;
           while( i <=n) {
        	   sum += i;
        	   i++;
           }
         System.out.println(n +"까지의 함 : " + sum);
	}
*/
	
	//do while 을 이용해 정수 둘쨰 자리 숫자만 입력받아 출력하세요.
	int n = 0 ;
	do{
		System.out.println("2째자리 정수만 입력 하시오. : ");
		n = sc.nextInt();
	}while(10>n || n> 99);
	  System.out.println("입력하신 정수는 :"+n);
	}
		
}
