package Homework;

public class Book {
	String name;
	int price;
	//int discount;
	public Book () {
		
	}
	
	public Book(String name) {
	this.name = name;
	if(name.equals("java")) {
		this.price = 30000;
	}
	else if(name.equals("js")){
		this.price = 20000;
	}
	else {
		this.price = 1000;
	}
	

	}
	
	public int getDiscounting(int price) {
		int discounting = 0;
		if(price >= 30000) {
			discounting = 25;
		}
		else if(price >= 20000) {
			discounting  = 20;
		}
		else {
			discounting  = 15;
		}
		return discounting;
	}
	
	
	public int getDiscounted(int price, int discounting) {
		int discountedPrice = 0;
		discountedPrice = price - price * discounting/100;
		return discountedPrice;
	}
	
	public void show() {
		System.out.println(this.name +"교재의 정가는 " + this.price +"원   할인된 가격은 " + getDiscounted(this.price , this.getDiscounting(this.price)));
	}
	
	
}
