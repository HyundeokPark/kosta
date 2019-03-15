package kosta_phone;

import java.util.Scanner;
import java.io.*;

public class Phone_main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// 1.추가  2.전체출력  3.종료
		int amount =0;
		
		System.out.print("연락처 최대 용량을 입력하십시오. (한번 결정하면 수정할수 없습니다.) :");
		amount = DataInput.sc.nextInt();
		Phone_manager pm = new Phone_manager(amount);
		pm.frontDesk();
}

}
