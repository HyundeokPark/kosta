package missions;

import java.util.Scanner;

public class mission06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어, 영어, 수학, 총점, 평균 => 배열로 처리
		Scanner sc = new Scanner(System.in);
		String[] str = {"국어" , "영어" , "수학" , "총점" , "평균"};
		int[] arr = new int[5];
		
		for(int i=0; i<3; i++) {
			System.out.print(str[i] +"점수를 입력하세요 : ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		arr[4] = arr[3] / 3;
		
		for(String s : str) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int n : arr) {
			System.out.print(n+"\t");
		}
	}

}
