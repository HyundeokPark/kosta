package kosta;

import java.util.Random;
import java.util.Scanner;

public class up_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(100);
		System.out.println(answer);
		while(true) {
			
			System.out.printf("정수를 입력 :");
			num = sc.nextInt();
			count++;
			if(num > answer) {
				System.out.println("DOWN");
				//count++;
			}
			else if(num < answer) {
				System.out.println("UP");
				//count++;
			}
			else {
				System.out.println("정답입니다."+ count + "번째 만에 맞추셧습니다.");
                break;
			}
		}
		
		

	}

}
