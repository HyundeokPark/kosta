package Homework;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		String bookName ="";
		Book[] a = new Book[3];  //��ü�� ������ �迭�� �̹� �޸𸮿� �������ΰ�??
		
		Book[] arr = {new Book("java") //�� ����� �ѹ濡 ��µ�!.... ����� ����
				,new Book("html")
				,new Book("js")};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. java, ����: 30000��   2.js ����: 20000��  3. HTML ����: 10000��");
		
		for(int i=0; i<a.length; i++) {
			System.out.print("�����Ͻ� å�� �̸� :");
			bookName = sc.nextLine();
			a[i] = new Book(bookName); //�̶� �� ����?... �޸� 2��?... �׷�..... �ʱ� ������ ��ü�迭�� �������?... �ָ��ϳ�,.... �ΰ��� �ִ� ����?..
		}
		
		for(int i=0; i<a.length; i++) {
			a[i].show();
		}
		
	}

}
