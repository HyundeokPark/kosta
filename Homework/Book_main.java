package Homework;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		String bookName ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. java, 가격: 30000원   2.js 가격:  20000원  3. HTML 가격:  1000원");
		System.out.print("구매하실 책의 이름 :");
		bookName = sc.nextLine();
		
		Book a = new Book(bookName);
		a.show();
	}

}
