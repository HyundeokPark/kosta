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
		//�迭�� �̿��� �� ����� Ű�� �Է� �޾�
		//���� ūŰ�� ����Ͻÿ�. �޼ҵ带 �̿��ؼ�!
		int[] heights;
		int height = 0;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ͻ� ����� ���� �Է����ּ��� :");
		count = sc.nextInt();
		heights = new int[count];
		
		for(int i=0; i<heights.length; i++) {
			System.out.print("Ű �� �Է����ּ���.");
			heights[i] = sc.nextInt();
			if(heights[i] == 0) {
				break;
			}
		}
		System.out.println("���� Ű�� ū ����� Ű�� :" + max(heights) + "cm�Դϴ�.");
	

	}

}
