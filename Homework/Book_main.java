package Homework;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		String bookName ="";
		Book[] a = new Book[3];  //객체가 원소인 배열이 이미 메모리에 잡힌것인가??
		
		Book[] arr = {new Book("java") //이 방식은 한방에 잡는듯!.... 강사님 버전
				,new Book("html")
				,new Book("js")};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. java, 가격: 30000원   2.js 가격: 20000원  3. HTML 가격: 10000원");
		
		for(int i=0; i<a.length; i++) {
			System.out.print("구매하실 책의 이름 :");
			bookName = sc.nextLine();
			a[i] = new Book(bookName); //이때 또 생성?... 메모리 2배?... 그럼..... 초기 생성한 객체배열은 사라지나?... 애매하네,.... 두개다 있는 느낌?..
		}
		
		for(int i=0; i<a.length; i++) {
			a[i].show();
		}
		
	}

}
