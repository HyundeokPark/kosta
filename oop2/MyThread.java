package kosta.oop2;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);		
		}
	}
	
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		
		
		for(int i=11; i<21; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(i);		
		}
	}

}
