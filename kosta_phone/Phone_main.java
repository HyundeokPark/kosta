package kosta_phone;

import java.util.Scanner;
import java.io.*;

public class Phone_main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// 1.�߰�  2.��ü���  3.����
		int amount =0;
		
		System.out.print("����ó �ִ� �뷮�� �Է��Ͻʽÿ�. (�ѹ� �����ϸ� �����Ҽ� �����ϴ�.) :");
		amount = DataInput.sc.nextInt();
		Phone_manager pm = new Phone_manager(amount);
		pm.frontDesk();
}

}
