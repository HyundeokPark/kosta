package Homework;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		String bookName ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. java, ����: 30000��   2.js ����:  20000��  3. HTML ����:  1000��");
		System.out.print("�����Ͻ� å�� �̸� :");
		bookName = sc.nextLine();
		
		Book a = new Book(bookName);
		a.show();
	}

}
