package kosta_oop;

public class GoodsStock {
	String code;
	int sNum;
	int stckAmount;
	public GoodsStock() {
		this.code = "코드값 없음";
		this.sNum = 0;
		this.stckAmount = 0;
	}
	
	public GoodsStock(String code, int sNum, int stckAmount) {
		super();
		this.code = code;
		this.sNum = sNum;
		this.stckAmount = stckAmount;
	}
	
	public void changeCode (String code) {
		this.code = code;
	}
	
	public void changesNum(int sNum) {
		this.sNum = sNum;
	}
	
	public void substractAmount(int sub) {
		if(this.stckAmount < sub) {
			System.out.println("재고가 부족합니다.");
		}
		else {
			this.stckAmount -= sub;
		}
	}
	
	public void show() {
		System.out.println("code :" + this.code);
		System.out.println("sNum :" + this.sNum);
		System.out.println("stckAmount :" + this.stckAmount);
	}


}
