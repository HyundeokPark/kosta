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

	
	//swap�� ��!��!!!
	//return�� ������ �ʿ䰡 ����!! ���θ޼ҵ� �ۿ��� �����ؾ���
	public static void swap(int[] arr, int index1, int index2) {
		//1������ 4���� �ڸ��� �ٲ㺸��!!!
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	//reverse�� �����غ��ھƾƾƾƾƾƾƾӾ�
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
		//������ 7���� ����� �迭�ȿ� �ʱ�ȭ �� �迭�� �ִ� �����͸� �������
		int[] seven = new int[9];
		/*for(int i=0; i<seven.length; i++) {
			seven[i] = 7*(i+1);
			System.out.println(seven[i]);
		}*/
		
		
		//1.�迭�Ǽ���� ������ �и�
		int arr[]; // �ּҰ��� �������ִ� ������ �����ȴ�.
		arr = new int[5]; //int�� ������ 5�� ����, arr������ ������ �迭�� �ּҰ��� ����.

		
		//2.�迭 ����� ���ÿ� ���� �ϴ¹�
		int arr2[] = new int[5];
		
		//3.�迭�� �����ϰ� ����, �׸��� �ʱ�ȭ ���� ���� �ϴ� ��!!!
		int arr3[] = {1,0,3,4,5};
		
		
		/*for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}*/
		//4. �迭 ���� ����!
		/*for(int i : arr3) {
			System.out.println("���� �������� �������!");*/
			
		//swap(arr3, 1, 4);
		/*for(int n=0; n<arr3.length; n++) {
			System.out.println(n+"����" + arr3[n]);
		}
	    
		reverse2(arr3);
		
		for(int n=0; n<arr3.length; n++) {
			System.out.println(n+"����" + arr3[n]);
		}*/
		
		int arr5[] = {1,2,3,4,5};
		int arr6[] = {1,2,3,4,5};
		
		if(equal(arr5, arr6)){
	       System.out.println("���� ����");
		}
		else {
			System.out.println("���� �ٸ���");
		}
		
		if(arr5 != arr6) {
			System.out.println("�ٸ�");
		}
		else {
			System.out.println("����");
		}
	}//1.�迭�� ���� ������ Ÿ���� �����ΰ�??
     //2.�迭�� ��� �ʱ�ȭ �Ұ�����? (���� �ε��� ����, ����, ������ ���ÿ�!..)
	 //2. ��� ������ �ʿ��Ѱ�? �迭�� ũ�� ����
	 // => �迭�� ������ �ʰ��ؼ���� �ϸ� �����߻�!..
	

	}

