package missions;

import java.util.Scanner;

public class mission08 {
	public static int max(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}	
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 이용해 각 사람의 키을 입력 받아
		//가장 큰키를 출력하시오. 메소드를 이용해서!
		int[] heights;
		int height = 0;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("비교하실 사람의 수를 입력해주세요 :");
		count = sc.nextInt();
		heights = new int[count];
		
		for(int i=0; i<heights.length; i++) {
			System.out.print("키 를 입력해주세요.");
			heights[i] = sc.nextInt();
			if(heights[i] == 0) {
				break;
			}
		}
		System.out.println("제일 키가 큰 사람의 키는 :" + max(heights) + "cm입니다.");
	

	}

}
