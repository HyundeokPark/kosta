package missions;

import java.util.Scanner;

public class mission09 {
	public static void aver(int[][] arr) {
		int total[];
		int aver[];
		for(int i=0; i<arr.length; i++) {
			total = new int[arr[i].length];
			aver = new int[arr[i].length];
			for(int j=0; j<arr[i].length; j++) {
				total[i] = total[i] + arr[i][j];
			}
			aver[i] = total[i]/arr[i].length;
			System.out.println(i+"번째 사람의 총점은 :" + total[i] + " 평균은 : " + aver[i]);
		}	
	}
	
	
	//각 사람의 성적에 따라 정렬할 경우
	public static void sort_selcet(int[][] arr) {
		int tmp = 0;
		for(int w=0; w<arr.length; w++) {
			for(int i=0; i<arr[w].length; i++) {
				for(int j=i+1; j<arr[w].length; j++) {
					if(arr[w][i] > arr[w][j]) {
						tmp = arr[w][i];
						arr[w][i] = arr[w][j];
						arr[w][j]= tmp;
					}
				}
			}
		}
	}
	/*
	public static void sort_all(int[][] arr) {
		int tmp = 0;
		int[] sorted_score;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j <arr[i].length; j++ ) {
			count++;
			}	
		}
		sorted_score = new int[count];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j <arr[i].length; j++ ) {
			sorted_score[i+j] = arr[i][j];
			}	
		}
		
		for(int i=0; i<sorted_score.length; i++) {
			for(int j=i+1; j<sorted_score.length; j++) {
				if(sorted_score[i] > sorted_score[j]) {
					tmp = sorted_score[i];
					sorted_score[i] = sorted_score[j];
					sorted_score[j] = tmp;
				}
			}
		}
		for(int i=0; i<sorted_score.length; i++) {
			System.out.print(sorted_score[i] +" ");
		}
		
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국영수 점수를 입력을 받아서 총점과 평균을 구할수있었다!.... 
		//두명 이상의 성적을 입력이 가능하도록!...
		//데이터를 출력 할줄 알아야 함!...
		//정렬을 활용해! 평균을 기준으로 내림차순으로?.. 
		
		int[][] mans;
		int scores = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		String subj = "";
		System.out.print("사람의 명수를 입력해 주세요. :");
		num = sc.nextInt();
		mans =  new int[num][3];
		
		
		
		for(int i=0; i<mans.length; i++) {
			System.out.println((i+1)+"번째 사람의 성적 입력입니다." );
			for(int j=0; j<mans[i].length; j++) {
				switch(j) {
				case 0:
					subj = "국어";
					break;
				case 1:
					subj = "영어";
					break;
				case 2:
					subj = "수학";
					break;
				}
				System.out.print(subj+"점수를 입력해 주세요. :");
				mans[i][j] = sc.nextInt();
			}
		}
		sort_selcet(mans);
		
		aver(mans);
		
		for(int i=0; i<mans.length; i++) {
			for(int j=0; j<mans[i].length; j++) {
				System.out.print("mans["+ i +"]["+j+"] = "+mans[i][j]+" ");
			}
			System.out.println();
		}
		
		//sort_all(mans);
		
		
		
		
		
	}

}
