package kosta;

import java.util.Scanner;

public class sortExam {
	
	public static void sort_selcet(int[] arr) {
		int tmp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선택정렬
		//첫번째랑 두번째랑 비교.... 이후 세벌째랑 비교해보고.. 고렇게!....
		//오름차순으로 정렬해보자!
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬하고자 하는 수의 갯수 :");
		num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("정수를 입력하세요 :");
			arr[i] = sc.nextInt();
		}
		sort_selcet(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}	
	}

}
