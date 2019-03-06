package kosta;

import java.awt.datatransfer.SystemFlavorMap;


public class ArrayExam {
	public static boolean equal(int[] arr, int[] arr2) {
		boolean count = true;
		if(arr.length != arr2.length) {
			count = false;			
		}
		else {
			for(int i=0; i < arr.length; i++) {
				if(arr[i] == arr2[i]) {
					continue;	
				}
				else {
					count = false;
					break;
				}
			}
		}
		
		return count;
	}

	
	//swap을 구!현!!!
	//return을 구현할 필요가 없당!! 메인메소드 밖에서 구혀해야함
	public static void swap(int[] arr, int index1, int index2) {
		//1번쨰와 4번쨰 자리르 바꿔보자!!!
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	//reverse를 구현해보자아아아아아아아앙아
	public static void reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			reverse[arr.length-1 - i] = arr[i];
			//System.out.println("reverse : "+ reverse[arr.length-1 - i]);
		}
		for(int i=0; i <arr.length; i++) {
			arr[i] = reverse[i];
		}	
	}
	
	public static void reverse2(int[] arr){
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length - i -1);
		}
	}
	
	public static void main(String[] args) {
		//구구단 7단의 결과를 배열안에 초기화 후 배열에 있는 데이터를 출력하자
		int[] seven = new int[9];
		/*for(int i=0; i<seven.length; i++) {
			seven[i] = 7*(i+1);
			System.out.println(seven[i]);
		}*/
		
		
		//1.배열의선언과 생성을 분리
		int arr[]; // 주소값을 넣을수있는 변수가 생성된다.
		arr = new int[5]; //int형 변수가 5개 생성, arr변수에 생성된 배열의 주소값이 들어간다.

		
		//2.배열 선언과 동시에 생성 하는법
		int arr2[] = new int[5];
		
		//3.배열을 선언하고 생성, 그리고 초기화 까지 같이 하는 법!!!
		int arr3[] = {1,0,3,4,5};
		
		
		/*for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}*/
		//4. 배열 전용 포문!
		/*for(int i : arr3) {
			System.out.println("향상된 포문으로 돌린결과!");*/
			
		//swap(arr3, 1, 4);
		/*for(int n=0; n<arr3.length; n++) {
			System.out.println(n+"번쨰" + arr3[n]);
		}
	    
		reverse2(arr3);
		
		for(int n=0; n<arr3.length; n++) {
			System.out.println(n+"번쨰" + arr3[n]);
		}*/
		
		int arr5[] = {1,2,3,4,5};
		int arr6[] = {1,2,3,4,5};
		
		if(equal(arr5, arr6)){
	       System.out.println("서로 같다");
		}
		else {
			System.out.println("서로 다르다");
		}
		
		if(arr5 != arr6) {
			System.out.println("다름");
		}
		else {
			System.out.println("같음");
		}
	}//1.배열에 사용될 데이터 타입은 무엇인가??
     //2.배열을 어떻ㄱ 초기화 할것인지? (직접 인덱스 접근, 포문, 생성과 동시에!..)
	 //2. 몇개의 변수가 필요한가? 배열의 크기 결정
	 // => 배열의 킈보다 초가해서사용 하면 오류발생!..
	

	}

