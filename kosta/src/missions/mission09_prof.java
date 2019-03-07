package missions;

import java.util.Scanner;

public class mission09_prof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어" , "영어" , "수학" , "총점", "평균"};
		int arr[][] = new int[3][5];
		
			//배열의 초기화
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<3; j++) {
					System.out.println("학생" + (i+1 +subject[i]) + "입력: ");
					arr[i][j] = sc.nextInt();
					arr[i][3] += arr[i][j]; 
				}
				arr[i][4] = arr[i][3]/3;
			}
			
			//정렬
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i][4] > arr[j][4]) {
						int tmp[];
						tmp= arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			//출력
			for(String s: subject) {
				System.out.println(s+"\t");
			}
			System.out.println();
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.println(arr[i][j] + "\t");
				}
			System.out.println();
			}

	}
			
}
