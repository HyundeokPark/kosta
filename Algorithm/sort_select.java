package Algorithm;
import java.io.*;
import java.util.Scanner;

public class sort_select {
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

	public static void main(String[] args) throws IOException{
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("�����ϰ��� �ϴ� ���� ���� :");
		bw.flush();
		
		try {
			num = Integer.parseInt(br.readLine());	
		}
		catch(Exception e) {
			bw.write("���ڸ� �ν��մϴ�.");
			bw.flush();
		}
		
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("������ �Է��ϼ��� :");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		sort_selcet(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}	
	}

}
