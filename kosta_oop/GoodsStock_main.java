package kosta_oop;

public class GoodsStock_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock a = new GoodsStock();
		GoodsStock b = new GoodsStock("Gram", 1111,10);
		
		b.show();
		//a.show();
		
		
		//a.changeCode("always");
		//a.changesNum(1234);
				
		//a.show();
		b.substractAmount(8);
		b.show();
		
	}

}
